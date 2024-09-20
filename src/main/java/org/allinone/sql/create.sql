create table dailycodeworkdb.employee (
    id int primary key,
    first_name varchar(255),
    last_name varchar(255),
    gender varchar(255)
);

select * from dailycodeworkdb.employee;

insert into dailycodeworkdb.employee (id, first_name, last_name, gender)
values (1,'John','Doe','Male');

insert into dailycodeworkdb.employee (id, first_name, last_name, gender)
values (2,'Anna','Smith','Male');

select * from dailycodeworkdb.employee order by first_name desc , last_name asc;






