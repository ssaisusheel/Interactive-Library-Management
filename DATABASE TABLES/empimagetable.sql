--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMPIMAGETABLE
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."EMPIMAGETABLE" 
   (	"NAME" VARCHAR2(20 BYTE), 
	"PIC" BLOB
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" 
 LOB ("PIC") STORE AS BASICFILE (
  TABLESPACE "USERS" ENABLE STORAGE IN ROW CHUNK 8192 RETENTION 
  NOCACHE LOGGING 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)) ;
REM INSERTING into CHIMMU.EMPIMAGETABLE
SET DEFINE OFF;
Insert into CHIMMU.EMPIMAGETABLE (NAME) values ('CHARY');
