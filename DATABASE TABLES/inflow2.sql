--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table INFLOW2
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."INFLOW2" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"RDATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.INFLOW2
SET DEFINE OFF;
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (110,'Computer networks',to_date('16-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (136,'Java',to_date('17-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (100,'Strength of Materials – A practical Approach',to_date('18-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (130,'Database System Concepts',to_date('10-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (138,'Electrical Machines',to_date('10-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (118,'Advanced Engineering Mathematics',to_date('16-DEC-13','DD-MON-RR'));
Insert into CHIMMU.INFLOW2 (BOOKID,BOOKNAME,RDATE) values (120,'Engineering Fluid Mechanics',to_date('11-DEC-13','DD-MON-RR'));
