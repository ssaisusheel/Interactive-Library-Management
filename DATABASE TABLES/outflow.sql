--------------------------------------------------------
--  File created - Sunday-February-09-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table OUTFLOW
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."OUTFLOW" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"LDATE" DATE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table OUTFLOW1
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."OUTFLOW1" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"LDATE" DATE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table OUTFLOW2
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."OUTFLOW2" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"LDATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.OUTFLOW
SET DEFINE OFF;
REM INSERTING into CHIMMU.OUTFLOW1
SET DEFINE OFF;
REM INSERTING into CHIMMU.OUTFLOW2
SET DEFINE OFF;
Insert into CHIMMU.OUTFLOW2 (BOOKID,BOOKNAME,LDATE) values (152,'Operating System Principles-Eigth Edition',to_date('15-DEC-13','DD-MON-RR'));
Insert into CHIMMU.OUTFLOW2 (BOOKID,BOOKNAME,LDATE) values (121,'Pulse & Digital Circuits',to_date('13-DEC-13','DD-MON-RR'));
