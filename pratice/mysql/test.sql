drop database if exists javatest1;
create database if not exists javatest1;

create table user
(
    id int primary key auto_increment,
    name varchar(20),
#     只有 datetime, timestamp 可以自动更新
    create_time datetime default now()
);

create table class
(
    id int primary key auto_increment,
    name varchar(20)
);

create table student
(
    id int primary key auto_increment,
    name varchar(20),
    classId int,
    foreign key(classId) references class(id)
);