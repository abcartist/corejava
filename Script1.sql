--<ScriptOptions statementTerminator=";"/>

CREATE TABLE S_DEPT (
		ID NUMBER(7 , 0) NOT NULL,
		NAME VARCHAR2(25) NOT NULL,
		REGION_ID NUMBER(7 , 0)
	);

CREATE UNIQUE INDEX S_DEPT_ID_PK ON S_DEPT (ID ASC);

CREATE UNIQUE INDEX S_DEPT_NAME_REGION_ID_UK ON S_DEPT (NAME ASC, REGION_ID ASC);

ALTER TABLE S_DEPT ADD CONSTRAINT S_DEPT_ID_PK PRIMARY KEY (ID);

