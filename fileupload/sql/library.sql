drop database if exists library;
create database if not exists library;

use library;

create table if not exists book
(
    id int primary key auto_increment unique,
    name varchar(20) not null,
    author varchar(20) not null,
    price int,
    publish_data date,
    sort varchar(20)
);

insert into book(name, author, price, publish_data, sort) value ('红楼梦', '施耐腌', 60, '2020-01-01' , '长篇小说');
insert into book(name, author, price, publish_data, sort) value ('红楼梦2', '施耐腌', 50,  '2018-01-01', '长篇小说');

create table goods
(
    id int primary key auto_increment,
    name varchar(20),
    inventory int,
    price decimal(7, 2),
    description varchar(50)
);
insert into goods(id, name, inventory, price, description) values(
                                                                1, '书包', 100, 50, null),
                                                                (2, '零食', 120, 60, null);

create table user
(
    id int primary key auto_increment,
    name varchar(20),
    account varchar(20),
    amount decimal(10, 2)
);

insert into user(id, name, account, amount) values
                            (1, '黑', 18060, 1000),
                            (2, '红', 18061, 1200),
                            (3, '白', 180603, 800),
                            (500, '绿', 18066, 1500);

create table student
(
    id int primary key auto_increment,
    name varchar(20),
    age int
);
insert into student(id, name, age) values
                                        (1, '张三三', 10),
                                        (2, '李四', 24),
                                        (3, '张小', 25);