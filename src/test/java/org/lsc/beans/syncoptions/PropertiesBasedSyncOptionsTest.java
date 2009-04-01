/*
 ****************************************************************************
 * Ldap Synchronization Connector provides tools to synchronize
 * electronic identities from a list of data sources including
 * any database with a JDBC connector, another LDAP directory,
 * flat files...
 *
 *                  ==LICENSE NOTICE==
 * 
 * Copyright (c) 2008, LSC Project 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:

 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *     * Neither the name of the LSC Project nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *                  ==LICENSE NOTICE==
 *
 *               (c) 2008 - 2009 LSC Project
 *         Sebastien Bahloul <seb@lsc-project.org>
 *         Thomas Chemineau <thomas@lsc-project.org>
 *         Jonathan Clarke <jon@lsc-project.org>
 *         Remy-Christophe Schermesser <rcs@lsc-project.org>
 ****************************************************************************
 */
package org.lsc.beans.syncoptions;

import java.util.Iterator;
import java.util.List;

import org.lsc.beans.syncoptions.ISyncOptions;
import org.lsc.beans.syncoptions.PropertiesBasedSyncOptions;
import org.lsc.jndi.JndiServices;
import org.lsc.utils.JScriptEvaluator;
import org.mozilla.javascript.EcmaError;

import junit.framework.TestCase;

public class PropertiesBasedSyncOptionsTest extends TestCase {

    protected final void setUp() throws Exception {
        super.setUp();
    }

    public final void test1() {
        ISyncOptions iso = new PropertiesBasedSyncOptions();
        assertNotNull(iso);
        iso.initialize("sampleTask");
        assertNotSame(iso.getStatus("sampleTask", "sampleAttribute"), ISyncOptions.STATUS_TYPE.UNKNOWN);
        assertEquals(ISyncOptions.STATUS_TYPE.KEEP, iso.getStatus(null, "nonExistantAttrName"));
    }

    public final void testJS() {
        ISyncOptions iso = new PropertiesBasedSyncOptions();
        assertNotNull(iso);
        iso.initialize("sampleTask");
        
        // get JavaScript enable default value
        List<String> defaultValues = iso.getDefaultValues(null, "JsAttribute");
        assertNotNull(defaultValues);
        Iterator<String> it = defaultValues.iterator();
        assertTrue(it.hasNext());
        String defaultValue = it.next();
        assertEquals("srcLdap.sup(\"uid=jclarke,ou=people,dc=lsc-project,dc=net\",1)", defaultValue);
        
        // evaluate JavaScript
        try {
            defaultValues = JScriptEvaluator.evalToStringList(defaultValue, null);        	
        } catch (EcmaError e) {
        	// srcLdap is not defined, it should not be used
        	assertEquals("ReferenceError", e.getName());
        	assertTrue(e.getErrorMessage().startsWith("\"srcLdap\" "));
        } catch (Exception e) {
        	// shouldn't happen
        	assertTrue(false);
        }
    }

    protected final void tearDown() throws Exception {
        super.tearDown();
    }

}
