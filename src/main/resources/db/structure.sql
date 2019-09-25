use pigmi;

CREATE TABLE users (
  id int primary key auto_increment,
  name VARCHAR(40),
  mobile VARCHAR(40),
  address VARCHAR(40),
  username VARCHAR(40),
  password VARCHAR(40)  
);

select * from users;

drop table members;
CREATE TABLE members (
  id int primary key auto_increment,
  name VARCHAR(40),
  mobile VARCHAR(40),
  address VARCHAR(40)
 );
 
 select * from members;
 
 drop table installment;
 CREATE TABLE installment (
  id int primary key auto_increment,
  memberId int,
  year VARCHAR(40),
  month VARCHAR(40),
  investment VARCHAR(40),
  fine VARCHAR(40)
  );
  
  select * from installment;
  
  select id,name from members;
  select name,month,investment from installment where memberId = 1 && year=2019;