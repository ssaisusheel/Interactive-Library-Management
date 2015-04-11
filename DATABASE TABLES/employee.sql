--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMPLOYEE
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."EMPLOYEE" 
   (	"NAME" VARCHAR2(20 BYTE), 
	"ADDRESS" VARCHAR2(200 BYTE), 
	"CONTACT" NUMBER, 
	"DOB" VARCHAR2(10 BYTE), 
	"AGE" NUMBER, 
	"SALARY" NUMBER, 
	"JOININGDATE" DATE, 
	"EMPID" VARCHAR2(30 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.EMPLOYEE
SET DEFINE OFF;
Insert into CHIMMU.EMPLOYEE (NAME,ADDRESS,CONTACT,DOB,AGE,SALARY,JOININGDATE,EMPID) values ('RAMESH','V.V’s Vintage Boulevard;Shop No.- 2 & 3 ;Upper Ground Floor; H.No.-6-3-1093; Rajbhavan Road; Somajiguda
Hyderabad; AP',9396559976,'22-07-1976',38,12897,to_date('23-JUN-07','DD-MON-RR'),null);
Insert into CHIMMU.EMPLOYEE (NAME,ADDRESS,CONTACT,DOB,AGE,SALARY,JOININGDATE,EMPID) values ('SURESH','H No.4-1-643, Wall street, Beside Old Vikranthi Theatre,, Jambagh, M.J.Market Road
Hyderabad, Andhra Pradesh',9849110308,'24-02-1988',23,7890,to_date('23-JUN-07','DD-MON-RR'),null);
Insert into CHIMMU.EMPLOYEE (NAME,ADDRESS,CONTACT,DOB,AGE,SALARY,JOININGDATE,EMPID) values ('RAJU','5-9-241/A/A& b, Abids Rd, Abids
Hyderabad, Andhra Pradesh',9848941956,'13-08-1966',42,14500,to_date('30-OCT-02','DD-MON-RR'),null);
Insert into CHIMMU.EMPLOYEE (NAME,ADDRESS,CONTACT,DOB,AGE,SALARY,JOININGDATE,EMPID) values ('CHARY','NH 9, Sandhu Apartment, Kalasiguda
Andhra Pradesh',9912343180,'19-04-1976',40,13900,to_date('07-DEC-06','DD-MON-RR'),'Fw6x4');
