This is the instruction manual for the ATM Machine Project.

Need to Install:
Java JDK
MySql 
Mysql J Connector v 8.0

***Include the reference library usually located at C:\Program Files (x86)\MySQL\Connector J 8.0 and add the jar file.***
Change the localhost (located in ATM.java)

For creating the database, login with the credentials in mysql command line client and use the following code :
show databases;
create database atm;
use atm;
create table atm_table(username int, password int, amount double);
insert into atm_table values ("97910134","1234","25000");
fill the database with values.
describe atm_table;

