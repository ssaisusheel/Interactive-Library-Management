--------------------------------------------------------
--  File created - Sunday-February-02-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BOOKS
--------------------------------------------------------

  CREATE TABLE "CHIMMU"."BOOKS" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(100 BYTE), 
	"AUTHOR" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into CHIMMU.BOOKS
SET DEFINE OFF;
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (118,'Advanced Engineering Mathematics','B S Grewal');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (110,'Computer networks','Andrew S. Tanenbaum');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (121,'Pulse & Digital Circuits','U.a.bakshi');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (120,'Engineering Fluid Mechanics','T. Al-Shemmeri');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (138,'Electrical Machines','R. K. Rajput');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (136,'Java','Herbert Schildt');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (130,'Database System Concepts','Abraham Silberschatz');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (152,'Operating System Principles-Eigth Edition','sebesta');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (150,'Unix','robbins');
Insert into CHIMMU.BOOKS (BOOKID,BOOKNAME,AUTHOR) values (100,'Strength of Materials – A practical Approach','D.S. Prakash Rao');
