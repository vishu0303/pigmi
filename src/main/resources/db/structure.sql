create database pigmi;

use pigmi;

CREATE TABLE USER_DETAILS (
  UID int primary key auto_increment,
  NAME VARCHAR(40)
);

create table INSTALLMENT_DETAIL(
UID int,
AMOUNT int,
IMONTH varchar(30),
IYEAR int
);