
create database student;
use student;
alter table student add PRIMARY KEY (STUDENT_ID);
create table ADDRESS (ADDRESS_ID INT NOT NULL,ADDRESS_STREET varchar(250),ADDRESS_CITY varchar(50),ADDRESS_STATE varchar(50),ADDRESS_ZIPCODE varchar(10),PRIMARY KEY (ADDRESS_ID));
create table student (STUDENT_ID INT NOT NULL,STUDENT_NAME varchar(250),STUDENT_ADDRESS varchar(250),PRIMARY KEY (STUDENT_ID));
create table COURSE (COURSE_ID int not null,COURSE_NAME varchar(250), primary key (COURSE_ID));
#create table STUDENT_COURSE (STUDENT_ID int not null,COURSE_ID int not null, foreign key (STUDENT_ID) references student(STUDENT_ID), foreign key (COURSE_ID) references COURSE(COURSE_D));
create table STUDENT_COURSE (STUDENT_ID int not null, COURSE_ID int not null);
