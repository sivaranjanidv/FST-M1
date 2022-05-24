REM   Script: Session 02
REM   Session 02

select ename from scott.emp where dno =(select dno from scott.dept where dname ='sales';

select ename from scott.emp where dno =(select dno from scott.dept where dname ='sales';

select ename from scott.emp where dno =(select dno from scott.dept where dname ='sales';

create table salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Select * from salesman;

insert into salesman values(5001 ,James Hoog,New York ,15)  
insert into salesman values(5002  ,Nail Knite Paris ,13)  
insert into salesman values(5005 ,Pit Alex ,London ,11)  
insert into salesman values(5006 ,McLyon,Paris ,14)  
insert into salesman values(5007 ,Paul Adam,Rome ,13)  
insert into salesman values(5003 ,Lauson Hen,San Jose ,12);

insert into salesman values(5001 ,James Hoog,New York ,15);

insert into salesman values(5002  ,Nail Knite Paris ,13) ;

insert into salesman values(5005 ,Pit Alex ,London ,11) ;

insert into salesman values(5006 ,McLyon,Paris ,14) ;

insert into salesman values(5007 ,Paul Adam,Rome ,13);

insert into salesman values(5003 ,Lauson Hen,San Jose ,12);

insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

alter table saleman add column grade;

Select * from salesman;

insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

alter table saleman add grade int;

Select * from salesman;

insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

alter table saleman add grade int;

Select * from salesman;

insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

alter table saleman add grade int;

alter table saleman add grade int;

alter table salesman add grade int;

update salesman set grade = 100;

select * from salesman;

select * from salesman;

drop table salesman;

select * from salesman;

select * from salesman;

create table salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

alter table salesman add grade int;

update salesman set grade = 100;

select * from salesman;

update salesman set grade = 200 where salesman_city = 'Rome' 
;

select * from salesman;

update salesman set grade = 300 where SALESMAN_NAME = 'James Hoog' 
;

select * from salesman;

update salesman set SALESMAN_NAME = 'Pierre' where SALESMAN_NAME= 'McLyon';

select * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

Select distinct salesman_id from orders;

select * from orders;

Select order_no from orders order by order_date ;

Select order_no from orders order by order_date asc;

select order_no from orders order by purchase_amount desc;

select order_no from orders order by purchase_amount desc;

select * from orders where purchase_amount<500 
;

select * from orders where purchase_amount 1000<>2000 
;

select * from orders where purchase_amount between 1000 and 2000 
;

select sum(purchase amount) as "total sum" from orders;

select sum(purchase amount) as "total sum" from orders;

select sum(purchase_amount) as "total sum" from orders;

select sum(purchase_amount) as "total sum" from orders;

select avg(purchase_amount) as "Avg Purchase amt" from orders;

select Max(purchase_amount) as "Max Purchase amt" from orders;

select Min(purchase_amount) as "Min Purchase amt" from orders;

select * from orders;

Select Count(salesmam_id) as "No of Salesman" from orders;

//Activity 1 


create table salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Select * from salesman;

//activity 2 


insert into salesman values(5001 ,'James Hoog','New York' ,15);

insert into salesman values(5002 ,'Nail Knite', 'Paris' ,13);

insert into salesman values(5005 ,'Pit Alex' ,'London' ,11);

insert into salesman values(5006 ,'McLyon','Paris' ,14);

insert into salesman values(5007 ,'Paul Adam','Rome' ,13);

insert into salesman values(5003 ,'Lauson Hen','San Jose' ,12);

//activity 3 


select salesman_id,salesman_city from salesman;

Select * from salesman where salesman_city='paris';

Select * from salesman where salesman_city='Paris';

select salesman_id,commission from salesman where salesman_name = 'Paul Adam';

//activity 4 


alter table salesman add grade int;

update salesman set grade = 100;

select * from salesman;

//activity 5 


update salesman set grade = 200 where salesman_city = 'Rome' 
 
update salesman set grade = 300 where SALESMAN_NAME = 'James Hoog' 
 
update salesman set SALESMAN_NAME = 'Pierre' where SALESMAN_NAME= 'McLyon' 
 
select * from salesman;

//Activity 6-Precondition 


create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

Select distinct salesman_id from orders 
 
Select order_no from orders order by order_date 
 
select order_no from orders order by purchase_amount desc 
 
select * from orders where purchase_amount<500 
 
select * from orders where purchase_amount between 1000 and 2000 
 
//Activity 7 
 
select sum(purchase_amount) as "total sum" from orders;

select avg(purchase_amount) as "Avg Purchase amt" from orders;

select Max(purchase_amount) as "Max Purchase amt" from orders;

select Max(purchase_amount) as "Max Purchase amt" from orders;

select Min(purchase_amount) as "Min Purchase amt" from orders;

select Min(purchase_amount) as "Min Purchase amt" from orders;

select Min(purchase_amount) as "Min Purchase amt" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(salesman_id) as "No of Salesman" from orders;

Select Count(distinct salesman_id) as "No of Salesman" from orders;

