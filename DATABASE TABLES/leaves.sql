--------------------------------------------------------
--  File created - Sunday-February-09-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LEAVES
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."LEAVES" 
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
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.LEAVES
SET DEFINE OFF;
Insert into CHIMMU.LEAVES (EMPID,NAME,CONTACT,LEAVEFROM,FROMTIME,LEAVETO,TOTIME,LEAVECATEG,LEAVEDESC,APPROVAL) values ('Fw6x4','CHARY',9912343180,to_date('11-FEB-14','DD-MON-RR'),'full day',to_date('13-FEB-14','DD-MON-RR'),'half day','vacation','tour plan','yes');
