--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table INFLOW1
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."INFLOW1" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"RDATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.INFLOW1
SET DEFINE OFF;
