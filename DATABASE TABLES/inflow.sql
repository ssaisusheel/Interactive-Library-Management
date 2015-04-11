--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table INFLOW
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."INFLOW" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"RDATE" DATE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.INFLOW
SET DEFINE OFF;
