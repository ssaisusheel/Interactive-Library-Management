--------------------------------------------------------
--  File created - Sunday-February-09-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LEAVES1
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."LEAVES1" 
   (	"EMPID" VARCHAR2(30 BYTE), 
	"NAME" VARCHAR2(20 BYTE), 
	"CONTACT" NUMBER, 
	"LEAVEFROM" DATE, 
	"FROMTIME" VARCHAR2(20 BYTE), 
	"LEAVETO" DATE, 
	"TOTIME" VARCHAR2(30 BYTE), 
	"LEAVECATEG" VARCHAR2(20 BYTE), 
	"LEAVEDESC" VARCHAR2(100 BYTE), 
	"APPROVAL" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.LEAVES1
SET DEFINE OFF;
