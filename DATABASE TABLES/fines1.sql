--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table FINES1
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."FINES1" 
   (	"ID" VARCHAR2(30 BYTE), 
	"BOOKID" NUMBER, 
	"AMOUNT" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.FINES1
SET DEFINE OFF;
Insert into CHIMMU.FINES1 (ID,BOOKID,AMOUNT) values ('160110737118',136,200);
Insert into CHIMMU.FINES1 (ID,BOOKID,AMOUNT) values ('160110737118',138,225);
