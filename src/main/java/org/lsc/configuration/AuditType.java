//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.23 at 07:48:47 PM CET 
//


package org.lsc.configuration;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for auditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="append" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditType", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", propOrder = {
    "name",
    "append",
    "operations",
    "file"
})
@XmlSeeAlso({
    LdifAuditType.class,
    PluginAuditType.class,
    CsvAuditType.class
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class AuditType {

    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String name;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", defaultValue = "true")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected Boolean append;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String operations;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String file;
    @XmlAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the append property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public Boolean isAppend() {
        return append;
    }

    /**
     * Sets the value of the append property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAppend(Boolean value) {
        this.append = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setOperations(String value) {
        this.operations = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-01-23T07:48:47+01:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setId(String value) {
        this.id = value;
    }

}
