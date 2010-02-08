CREATE TABLE inetOrgPerson (
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1) PRIMARY KEY,
	uid varchar(255),
	endOfValidity varchar(255),
	sn varchar(255),
	cn varchar(255),
	givenName varchar(255),
	mail varchar(255),
	telephoneNumber varchar(255),
	address varchar(255)
);

CREATE INDEX inetOrgPerson_id ON inetOrgPerson (id);
CREATE INDEX inetOrgPerson_uid ON inetOrgPerson (uid);

COMMIT;
SHUTDOWN;