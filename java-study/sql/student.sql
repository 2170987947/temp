select s_no, class_no, s_name, s_sex, s_birthday from Student;
select s_no, s_name from Student;
select s_no, s_name, s_birthday from Student where s_sex = '男';
select s_no, s_name, s_sex, s_birthday from Student where s_sex = '女' and s_birthday < '1980-01-01';
select s_no, s_name, s_sex, s_birthday from Student where s_mame like '李%' and s_sex = '男';
select s_no, s_name from Student where s_name like '%一%';
select t_no, t_name, t_title from Teacher where t_name not in('讲师');
select s_no from Choice where score is null;
select s_no, score from Choice where score <= 60 order by score desc;
select course_no, course_name from Course where course_no in('01001', '02001', '02003');
select t_no, t_name, t_birthday from Teacher where t_birthday between '1970-01-01' and '1970-12-31';
select course_no, count(course_no) from Choice group by course_no;
select t_no from Choice group by t_no having count(course_no) > 2;
select avg(score), min(score), max(score) from Choice where course_no = '01001';
select t_no, t_birthday from Teacher where t_birthday > '1960-01-01' and t_title = '讲师' order by (t_birthday);
insert into Class values('xx0003', '信息 00-3', '信息系');
update Class set class_no = 'xx0004' where class_name = '信息 00-3';
delete from Class where class_no = 'xx0004';
select class_no, count(class_no) from Class group by class_no having count(class_no) > 2;

连接查询
select s_no, s_name, course_no, score from Student, Choice where Student.s_no = Choice.s_no;
select s_no, s_name, course_no, score from Student left outer join Choice on Student.s_no = Choice.s_no;
select s_name, course_name, score from Student, Choice, Course where Student.s_no = Choice.s_no and Choice.course_no = Course.course_no;
select s_no, s_name, course_no, course_name, score from Student, Course, Choice, Class where Student.s_no = Choice.s_no and Choice.course_no = Course.course.no and Class.class_no = Student.class_no and class.name = '计算机 99-1';
select s_no, s_name, sum(course_score) from Student, Choice where score >= 60 group by s_no, s_name;
select s_no, s_name, avg(score), count(s_no) from Student, Choice where Student.s_no = Choice.s_no group by s_no, s_name;

