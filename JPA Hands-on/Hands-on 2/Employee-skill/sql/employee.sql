create  schema employee;
use employee;

create table department(
dp_id int primary key auto_increment,
dp_name varchar(20));

create table skill(
sk_id int primary key auto_increment,
sk_name varchar(20));

create table employee(
em_id int primary key auto_increment,
em_name varchar(20),
em_salary double,
em_permanent boolean,
em_date_of_birth date,
em_dp_id int,
foreign key(em_dp_id) references department(dp_id));

create table employee_skill(
es_id int primary key auto_increment,
es_em_id int not null,
es_sk_id int not null,
foreign key(es_em_id) references employee(em_id),
foreign key(es_sk_id) references skill(sk_id));

  
insert into department (dp_name) values("department1");
insert into department (dp_name) values("department2");
insert into department (dp_name) values("department3");

insert into employee (em_name,em_salary,em_permanent,em_date_of_birth,em_dp_id) values ("Dhanwin",40000 ,true ,"1991-07-10" ,2);
insert into employee (em_name,em_salary,em_permanent,em_date_of_birth,em_dp_id) values ("Dia",240000 ,true ,"1987-01-23" ,1);
insert into employee (em_name,em_salary,em_permanent,em_date_of_birth,em_dp_id) values ("Saman",240000 ,true ,"1989-05-13" ,1);
insert into employee (em_name,em_salary,em_permanent,em_date_of_birth,em_dp_id) values ("Liya",50000 ,false ,"1993-10-11" ,2);

insert into skill (sk_name) values ("Skill-1");
insert into skill (sk_name) values ("Skill-2");
insert into skill (sk_name) values ("Skill-3");
insert into skill (sk_name) values ("Skill-4");
insert into skill (sk_name) values ("Skill-5");
insert into skill (sk_name) values ("Skill-6");
insert into skill (sk_name) values ("Skill-7");


insert into employee_skill (es_em_id, es_sk_id) values (1,1);
insert into employee_skill (es_em_id, es_sk_id) values (1,5);

insert into employee_skill (es_em_id, es_sk_id) values (2,2);
insert into employee_skill (es_em_id, es_sk_id) values (2,4);

insert into employee_skill (es_em_id, es_sk_id) values (3,3);
insert into employee_skill (es_em_id, es_sk_id) values (3,6);
