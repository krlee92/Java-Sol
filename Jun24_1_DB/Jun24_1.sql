-- 주석
-- 여러 줄 : 블록지정 -> alt + x 거기만 실행
-- 한 줄 : 커서 갖다놓고  - alt + s 로 실행
---------------------------------------------------
-- 행, row, 데이터 data , 레코드 			공식 : record
-- 열, column, 속성(멤버변수), attribute, 	공식 : field

-- 용량
--		3 : 3bytes
--		3 char(단위) : 세글자(사실상 9bytes)
--	영어 : 1
--	한글 : 3

-- 오라클의 자료형
--		글자
--			char(용량)
--				무조건 그 용량으로 저장 char(3 char) -> ㅋ -> ㅋ 공백 공백 저장
--				자리수 정해진 데이터 - 전화번호 주민번호 성별...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

--			varchar2(용량)
--				사이즈 조절해서 저장  varchar2(3 char) -> ㅋ -> ㅋ 저장
--				조절해서 저장 -> 낭비없지만 느림
--				자리수 안정해진 데이터

--		숫자
--			number(용량)
--			number(3) : 정수 3자리
--			number(5, 3) : 실수 12.345 (전체자리수, 소수점이하자리수)

--		날짜/시간
--				date
--				현재시간날짜 : sysdate
				-- 특정시간날짜 : to_date('값', 'YYYY MM DD HH24:MI:SS')
-- 				: to_date('값', 'YYYY MM DD PM HH:MI:SS')
--		옵션
--					not null - 거의기본으로 달고
--					primary key - not null + 중복불허
--					그 데이터를 대표하는 값이 됨 
--					=> 테이블 하나에는 primary key가 있는게 좋음

--					번호가 1 -> 새우깡, 농심, 300, 3000, 오늘

		---- 숫자 자동으로 올라가는 sequence (테이블과 무관)
				-- create sequence jun25_owner_seq; --생성
				-- drop sequence jun25_owner_seq; --삭제
				-- 시퀀스명.nextval로 사용
-- 데이터 수정 : U
select * from jun25_menu;
update 테이블명
set 필드명=값, 필드명=값, ......    <- 바꿀내용
where;

-----데이터 삭제 : D
중요! delete * 안쓰는거임
delete from 테이블명
where;
----------------------------------------------------------------------					 
-- 1. 테이블 만들기
					
					
create table 테이블명(
	필드명 자료형[옵션],
	필드명 자료형[옵션],
	필드명 자료형[옵션],
);

-- 1. 테이블 삭제 : 휴지통에 안넣고, 테이블에 걸린 각종 규칙까지
drop table 테이블명 cascade constraint purge;
drop table jun24_student cascade constraint purge;

create table jun24_student(
	s_no number(2) not null,
	s_name varchar2(10 char) not null,
	s_age number(2) not null,
	s_gender char(2 char) not null,
	s_kor number(3) not null,
	s_eng number(3) not null,
	s_mat number(3) not null
);
---------------------------------------------
--2.데이터 넣기 - C
--insert into 테이블명(필드명, 필드명, ....) values(값, 값, 값...);
insert into JUN24_STUDENT
(s_no, s_name, s_gender, s_age,  s_kor, s_eng, s_mat)
values(1, '홍길동','남자', 20, 100, 50, 30);

insert into JUN24_STUDENT
(s_no, s_name, s_age,  s_kor, s_eng, s_mat)
values(1, '김길동', 20, 20, 10, 15);

--insert into 테이블명 values(값, 값, 값 ....);
insert into jun24_student values(4,'최길동',30,'남자',10,50,20);
----------------------------------------------------------------------------------

-- 3. 조회 - R
select * from JUN24_STUDENT;

select 필드명, 필드명 as 닉네임(필드명 바꿔서 출력할때), ...
from 테이블명
where 조건;
order by 필드명, 필드명 desc , 필드명,(n차조건); : 정렬 (1차조건, 같으면 2차조건, 같으면 3차조건..)
desc 붙이면 내림차순

--전체 과자 이름, 가격만
select s_name, s_price
from JUN24_SNACK;

-- 전체 과자 이름, 제조사, 가격, 유통기한만
select s_name, s_maker as jejosa, s_price, s_exp
from JUN24_SNACK;

-- 전체 과자 이름, 가격, 부가세
select s_name, s_price, s_price * 0.1 as s_vat
from JUN24_SNACK;

-- 전체 과자 이름, 제조사, 가격, g당 얼마
select s_name, s_maker, s_price, s_price/s_weight as s_price2
from jun24_snack;

-- 통계 함수 : max, min, sum, avg, count : select 옆에만 쓸수있음
-- 전체 과자 가격 평균
select avg(s_price)
from jun24_snack;

-- 최저가
select min(s_price)
from JUN24_SNACK;
-- 유통기한 제일 오래 남은거
select max(s_exp)
from JUN24_SNACK;
-- 과자 총 몇개
select count(*)
from JUN24_SNACK;

-- 과자 이름, 회사명, 가격, 롯데메이커만
select s_name, s_maker, s_price
from JUN24_SNACK
where s_maker = '롯데';

-- 롯데 과자 평균가
select avg(s_price)
from JUN24_SNACK
where s_maker = '롯데';

-- 먹어도 되는 과자 이름, 회사명, 가격
select s_name, s_maker, s_price
from JUN24_SNACK
where s_exp >= sysdate;

-- 빼빼로시리즈(키워드포함) 과자이름, 회사명, 가격
'%ㅋ' : ㅋ로 끝나는거
'ㅋ%' : ㅋ로 시작하는거
'%ㅋ%' : ㅋ가 있는거
select s_name, s_maker, s_price
from JUN24_SNACK
where s_name like '%빼빼로%';

-- 깡 시리즈 최고가
select max(s_price)
from jun24_snack
where s_name like '%깡%';

-- subquery
-- 최고가
select max(s_price)
from jun24_snack;

-- subquery 이용
-- 최고가 과자 이름, 회사명, 가격
select s_name, s_maker, s_price
from jun24_snack
where s_price = (select max(s_price)
from jun24_snack);

-- 평균가보다 비싼 과자 이름, 제조사, 가격
select s_name, s_maker, s_price
from jun24_snack
where s_price > (select avg(s_price)
from jun24_snack);

-- 제일 가벼운 과자 이름, 가격, g당 얼마
select s_name, s_price, (s_price/s_weight) as s_price2
from jun24_snack
where s_weight = (select min(s_weight)
from jun24_snack);

-- 해태 과자의 평균가보다 비싼 과자들 정보 전체
select avg(s_price)
from jun24_snack
where s_maker = '해태' -- 오리온 과자의 평균가

select *
from jun24_snack
where s_price > (
	select avg(s_price)
	from jun24_snack
	where s_maker = '해태'
);

-- 오리온, 롯데과자 정보 전체 (or쓰기)
select *
from jun24_snack
where s_maker = '오리온' or s_maker = '롯데';

-- 1000 < 가격 < 5000 인 과자 정보 전체
select *
from jun24_snack
where s_price < 5000 and s_price >1000;

-- 오리온과자 전체정보를 과자이름 가나다순, 가격 내림차순 정렬
select *
from jun24_snack
where s_maker = '오리온'
order by s_name, s_price desc;

-- 5000원 갖고 있음
-- 내가 사먹을 수 있는거 리스트 출력
-- 유통기한 얼마 안남은걸 위쪽으로 보이게

select *
from jun24_snack
where s_price < 5000
order by s_exp;

-- 데이터가 1~1000만번까지 있는데
-- 한 페이지당 3개씩 보여줌
-- 2페이지 분량만 : 4,5,6번 보이기

-- 오라클에는 가상필드 - rownum
--		order by보다 먼저 발동
--		무조건 1번부터 조회해야 
select rownum, s_no, s_name, s_price
from (select s_no, s_name, s_price
	from jun24_snack
	order by s_price desc)
where rownum >= 4 and rownum <= 6;


(select s_no, s_name, s_price
from jun24_snack
order by s_price desc)

select *
from(
	select rownum as rn, s_no, s_name, s_price
	from jun24_snack
	order by s_price desc
)
where rn >= 4 and rn <= 6;
----------------------------------------------------------------------------------
-- 과자
-- 이름 제조사 중량 가격 유통기한
create table jun24_snack(
	s_no number(5) primary key,
	s_name varchar2(10 char) not null,
	s_maker varchar2(10 char) not null,
	s_weight number(5, 1) not null,
	s_price number(5) not null,
	s_exp date not null
);
---- 숫자 자동으로 올라가는 sequence (테이블과 무관)
create sequence 시퀀스명;
create sequence jun24_snack_seq;
-- 시퀀스명.nextval로 사용


--------------------- 현재시간날짜 : sysdate
insert into jun24_snack values(jun24_snack_seq.nextval, '새우깡', '농심', 300.5, 3000, sysdate);
select * from JUN24_snack;

-- 특정시간날짜 : to_date('값', 'YYYY MM DD HH24:MI:SS')
-- 				: to_date('값', 'YYYY MM DD PM HH:MI:SS')
insert into jun24_snack values(jun24_snack_seq.nextval, '빼빼로', '롯데', 100.5, 1000, 
to_date('2022-12-31', 'YYYY-MM-DD'));
select * from JUN24_snack;

insert into jun24_snack values(jun24_snack_seq.nextval, '초코틴틴', '농심', 100.6, 1000, to_date('2023-12-22', 'YYYY-MM-DD'));
select * from JUN24_snack;

insert into jun24_snack values(jun24_snack_seq.nextval, 'ABC초콜릿', '해태', 100.6, 1000, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '조청유과', '해태', 100.6, 1200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '초코파이', '해태', 200.6, 4200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '오뜨', '오리온', 120.6, 3200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

select * from JUN24_snack;
drop table jun24_snack cascade constraint purge;
