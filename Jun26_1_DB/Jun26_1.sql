-- 케냐콩은 다 쓴맛
-- 콜롬비아콩은 다 신맛

--콩 섞어서 안씀

-- 4000원짜리 아메리카노 케냐(쓴맛)원두를 스타벅스 강남점에서
-- 4500원짜리 캬.마 케냐(쓴맛)원두를 스타벅스 서초점에서
-- 5500원짜리 녹.라 콜롬비아(신맛)원두를 빽다방 강남점에서
-- 5000원짜리 아메리카노 케냐(쓴맛)원두를 스타벅스 서초점에서

-- 테이블 만들기, 시퀀스 만들기
-- 테이블 삭제, 시퀀스 삭제 -> 프로그램으로 못함

create table jun26_cafe(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_where varchar2(10 char) not null
);
create sequence jun26_cafe_seq;

create table jun26_menu(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_price number(4) not null,
	m_bean varchar2(10 char) not null,
	m_where number(3) not null
);
create sequence jun26_menu_seq;

create table jun26_bean(
	b_name varchar2(10 char) primary key,
	b_taste varchar2(10 char) not null
);

drop sequence jun26_bean_seq;

-- 조회, 드랍
select * from jun26_cafe;
select * from jun26_menu;
select * from jun26_bean;

drop table jun26_bean cascade constraint purge;
drop table jun26_menu cascade constraint purge;
drop table jun26_cafe cascade constraint purge;

insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '스타벅스', '강남'
);
insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '스타벅스', '서초'
);
insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '빽다방', '강남'
);


insert into jun26_menu values(
	jun26_menu_seq.nextval, '아메리카노', 4000, '케냐', 1
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, '아메리카노', 5000, '케냐', 2
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, '캬라멜마끼아또', 5000, '케냐', 2
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, '녹차라떼', 5500, '콜롬비아', 3 
);


insert into jun26_bean values(
	'케냐', '쓴맛'
);
insert into jun26_bean values(
	'콜롬비아', '신맛'
);

delete from jun26_cafe
where c_no = 4;



