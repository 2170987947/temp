drop database if exists library;
create database if not exists library character set utf8mb4;
use library;
create table book (
    name varchar(20),
    author varchar(20),
    price int,
    sort varchar(20)
);

create table teacher (
    name varchar(20),
    age int,
    height int,
    weight int,
    sex varchar(3),
    education varchar(20),
    birthday date,
    id varchar(20)
);
-- 商品名称、商品价格、商品库存、商品描述
create table goods (
  name varchar(20),
  price int,
  stock int,
  description varchar(20)
);

insert into book values ('红楼梦', '曹雪芹', 100, '清代长篇人情小说'),
                        ('西游记', '吴承恩', 80, '古典小说'),
                        ('三国演义', '罗贯中', 88, '古典小说'),
                        ('水浒传', '施耐庵', 120, '古典小说');

create table if not exists exam_result (
    id int,
    name varchar(20),
    chinese decimal(3, 1),
    math decimal(3, 1),
    english decimal(3, 1)
);
insert into exam_result values (1, '小赵', 67.0, 55.9, 89.1),
                            (2, '小李', 55, 90, 98),
                            (3, '小王', 89, 79, 97),
                            (4, '小徐', 87, 88, 79),
                            (5, '小肖', 99, 78, 87);
select id, chinese + math + english tatal from exam_result order by tatal desc;
insert into exam_result value (6, '小钱', 89, 79, 97);
insert into exam_result value (6, '小钱', 89, 79, 97);
insert into exam_result value (7, '小新', null, null, null);
