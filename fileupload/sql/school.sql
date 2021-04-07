    drop database if exists school;
    create database if not exists school;

    use school;

    create table class
    (
        id int primary key auto_increment,
        name varchar(20)
    );

    create table course
    (
        id int primary key auto_increment,
        name varchar(20)
    );

    create table student
    (
        id int primary key auto_increment,
        name varchar(20),
        classId int,
        courseId int,
        foreign key(classId) references class(id),
        foreign key(courseId) references course(id)
    );

    create table teacher
    (
        id int primary key auto_increment,
        name varchar(20)
    );

    create table teach
    (
        teacherId int,
        courseId int,
        score int,
        foreign key(courseId) references course(id),
        foreign key(teacherId) references teacher(id)
    );
create table user
(

)

