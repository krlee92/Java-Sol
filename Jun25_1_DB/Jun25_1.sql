-- RDB(RelationalDB) : OracleDB, MySQL, MariaDB, ...
--		테이블간의 관계를 중심으로 해결

-- subquery의 결과가 여러개 나오면 where r_in = 활용



-- DB디자인
-- 역삼동에 있는 무지개맥주에서 5000원짜리 제육볶음
-- 역삼동에 있는 무지개맥주에서 6000원짜리 소고기덮밥
-- 대치동에 있는 강남반점에서 5500원짜리 짜장면
-- 대치동에 있는 강남반점에서 6500원짜리 짬뽕

-- 홍길동 1980-01-01생 역삼동 무지개맥주를 운영
-- 김길동 1990-02-02생 대치동 강남반점을 운영
-- 홍길동 1990-02-02생 대치동 무지개맥주를 운영

create table jun25_menu(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_where number(3) not null
);
create sequence jun25_menu_seq;

create table jun25_restaurant(
	r_no number(3) primary key,
	r_name varchar2(10 char) not null,
	r_where varchar2(10 char) not null
);

create table jun25_ceo(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_birthday date not null
);
create sequence jun25_ceo_seq;
insert into jun25_ceo values(jun25_ceo_seq.nextval,
'홍길동', to_date('1990-01-01', 'YYYY-MM-DD'));
insert into jun25_ceo values(jun25_ceo_seq.nextval,
'김길동', to_date('1980-02-02', 'YYYY-MM-DD'));
--------------------------------------------------
create table jun25_owner(
	o_no number(3) primary key,
	o_ceo number(3) not null,
	o_restautrant number(3) not null
);
create sequence jun25_owner_seq;

insert into jun25_owner values(jun25_owner_seq.nextval, 1, 1);
insert into jun25_owner values(jun25_owner_seq.nextval, 2, 3);
insert into jun25_owner values(jun25_owner_seq.nextval, 2, 2);
insert into jun25_owner values(jun25_owner_seq.nextval, 1, 4);
insert into jun25_owner values(jun25_owner_seq.nextval, 1, 5);


create sequence jun24_restaurant_seq;

insert into jun25_menu values(jun24_menu_seq.nextval, '제육덮밥', 5000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '야채김밥', 3000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '소고기덮밥', 6000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '보쌈', 9000, 6);
insert into jun25_menu values(jun24_menu_seq.nextval, '간짜장', 6000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, '탕수육', 16000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, '짬뽕', 7000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, '칼국수', 8000, 3);
insert into jun25_menu values(jun24_menu_seq.nextval, '왕만두', 6000, 3);
insert into jun25_menu values(jun24_menu_seq.nextval, '콤비네이션피자', 7000, 4);
insert into jun25_menu values(jun24_menu_seq.nextval, '고기피자', 9000, 4);
insert into jun25_menu values(jun24_menu_seq.nextval, '콤비네이션피자', 14000, 5);
insert into jun25_menu values(jun24_menu_seq.nextval, '킹피자', 29000, 5);




insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '무지개맥주', '역삼동');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '무지개맥주', '대치동');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '강남반점', '대치동');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '명동칼국수', '서대문구');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '59쌀피자', '송도동');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '도미노피자', '송도동');
------------조회 드랍

drop table jun25_ceo cascade constraint purge;
drop table jun25_menu cascade constraint purge;
drop  jun25_restaurant cascade constraint purge;

select * from jun25_menu;
select * from jun25_restaurant;
select * from jun25_ceo;
select * from jun25_owner;

---------------------------------------------------------
-- 내가 알고있는 맛집 이름, 위치(이름 가나다순)
select r_name, r_where
from jun25_restaurant
order by r_name;

-- 내가 알고 있는 메뉴중에 제일 비싼거 정보
select *
from jun25_menu
where m_price = (select max(m_price) from jun25_menu);

-- 내 맛집 사장님 중에 최고 연장자 정보
select *
from jun25_ceo
where c_birthday = (select min(c_birthday) from jun25_ceo); 

-- 밥 시리즈 평균가
select avg(m_price)
from jun25_menu
where m_name like '%밥%';

-- 역삼동 맛집 정보
select *
from jun25_restaurant
where r_where = '역삼동';


-- 제일 싼 메뉴를 파는 식당이름, 위치
-- where r_no = 활용시 subquery의 결과로는 하나만 나와야 
-- subquery의 결과가 여러개 나오면 where r_in = 활용
select r_name, r_where
from jun25_restaurant
where r_no = (
	select m_where
	from jun25_menu
	where m_price = (select min(m_price)
	from jun25_menu
					)
);

- 제일싼 메뉴를 파는 식당 번호
select m_where
from jun25_menu
where m_price = (select min(m_price)
from jun25_menu
);

- 제일싼 메뉴 이름
select m_name
from jun25_menu
where m_price = (select min(m_price)
from jun25_menu
);

---- 역삼동에서 먹을 수 있는 것들 이름, 가격
select m_name, m_price
from jun25_menu
where m_where in (
		select r_no
		from jun25_restaurant
		where r_where = '역삼동'
);

select r_no
from jun25_restaurant
where r_where = '역삼동'; --역삼동 식당 번호


-- 밥 시리즈는 어디가면 먹을 수있나
select r_where
from jun25_restaurant
where r_no in(
		select m_where
		from jun25_menu
		where m_name like '%밥%'
);

select m_where
from jun25_menu
where m_name like '%밥%'; -- 밥시리즈 파는 식당 번호

-- 무지개맥주 역삼동  지점의 메뉴 전체 출력
-- 무지개맥주, 역삼동이라는 정보만 이용해서 찾기
select *
from jun25_menu
where m_where = (
	select r_no
	from jun25_restaurant
	where r_name = '무지개맥주' and r_where = '역삼동'
);

select r_no
from jun25_restaurant
where r_name like '%무지개맥주%' and r_adress = '역삼동' -- 무지개맥주이고 역삼동인곳의 번호

-- 최연장자 아저씨네 메뉴명, 가격 전체 출력(가격 오름차순)
select m_name, m_price
from jun25_menu
where m_where in(

)



select r_no
from jun25_restaurant
where r_no = (select *
from jun25_owner
	where o_no = (select c_no
	from jun25_ceo
	where c_birthday = (select min(c_birthday) from jun25_ceo)));

select *
	from jun25_owner
	where o_no = (select c_no
	from jun25_ceo
	where c_birthday = (select min(c_birthday) from jun25_ceo));


select c_no
from jun25_ceo
where c_birthday = (
	select min(c_birthday)
	from jun25_ceo); --최연장자 번호
	
select m_name, m_price
from jun25_menu
where m_where in (
   select r_no
   from jun25_restaurant
   where r_no in (
      select o_restaurant
      from jun25_owner
      where o_ceo in (
         select c_no
         from jun25_ceo
         where c_birthday in (
            select min(c_birthday)
            from jun25_ceo
         )
      )
   )
)
order by m_price desc;
----------------------------------------------------
-- 무지개맥주 전체의/ 메뉴명, 가격, 매장위치 조회
-- join
select m_name, m_price, r_where
from jun25_menu, jun25_restaurant
where m_where = r_no and r_name = '무지개맥주';

-- 제일 싼거 파는 매장에서 먹을수있는  매장 위치, 메뉴명, 가격
select m_name, m_price, r_where
from jun25_menu, jun25_restaurant
where m_where = r_no and r_no = (
	select m_where
	from jun25_menu
	where m_price = (
		select min(m_price) 
		from jun25_menu
	)
);


-- 제일 젊은 사장님네
--		매장명, 위치, 사장님이름, 생일, 메뉴명, 가격
--		가격 오름차순

select r_name, r_where, c_name, c_birthday, m_price, m_name
from jun25_menu, jun25_restaurant, jun25_ceo, jun25_owner
where m_where = r_no and r_no = o_no and m_where = o_no;

-----------------------------------------------
-- 데이터 수정 : U
select * from jun25_menu;
update 테이블명
set 필드명=값, 필드명=값, ......    <- 바꿀내용
where;

--- 제육덮밥 6000원으로 수정
update jun25_menu
set m_price =6000
where m_name = '제육덮밥';
-- 제일 싼거 무료
update jun25_menu
set m_price = 0
where m_price = (
	select min(m_price)
	from jun25_menu
);
-- 평균가보다 비싼거 10%깎아주기
update jun25_menu
set m_price = m_price * 0.9
where m_price > (
	select avg(m_price)
	from jun25_menu
);
-- 역삼동 메뉴 1000원 인상
update jun25_menu
set m_price = m_price + 1000
where m_where in (
	select r_no
	from jun25_restaurant
	where r_where = '역삼동'
);

select * from jun25_menu;
select * from jun25_restaurant;
---------------------------------
-----데이터 삭제 : D
중요! delete * 안쓰는거임
delete from 테이블명
where;

-- 무지개맥주 강남점 폐업

delete from jun25_menu
where m_where = (
	select r_no
	from jun25_restauarant
	where r_name = '무지개맥주' and r_where = '역삼동'
);

delete from jun25_restaurant
where r_name = '무지개맥주'  and r_where = '역삼동';

insert into jun25_menu values(jun25_menu_seq.nextval, '테스트', 100, 10)

delete from jun25_menu 
					 where m_where in (
					select r_no 
					from jun25_restaurant 
					where r_name like '%무%');
