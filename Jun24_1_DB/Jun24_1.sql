-- �ּ�
-- ���� �� : ������� -> alt + x �ű⸸ ����
-- �� �� : Ŀ�� ���ٳ���  - alt + s �� ����
---------------------------------------------------
-- ��, row, ������ data , ���ڵ� 			���� : record
-- ��, column, �Ӽ�(�������), attribute, 	���� : field

-- �뷮
--		3 : 3bytes
--		3 char(����) : ������(��ǻ� 9bytes)
--	���� : 1
--	�ѱ� : 3

-- ����Ŭ�� �ڷ���
--		����
--			char(�뷮)
--				������ �� �뷮���� ���� char(3 char) -> �� -> �� ���� ���� ����
--				�ڸ��� ������ ������ - ��ȭ��ȣ �ֹι�ȣ ����...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

--			varchar2(�뷮)
--				������ �����ؼ� ����  varchar2(3 char) -> �� -> �� ����
--				�����ؼ� ���� -> ��������� ����
--				�ڸ��� �������� ������

--		����
--			number(�뷮)
--			number(3) : ���� 3�ڸ�
--			number(5, 3) : �Ǽ� 12.345 (��ü�ڸ���, �Ҽ��������ڸ���)

--		��¥/�ð�
--				date
--				����ð���¥ : sysdate
				-- Ư���ð���¥ : to_date('��', 'YYYY MM DD HH24:MI:SS')
-- 				: to_date('��', 'YYYY MM DD PM HH:MI:SS')
--		�ɼ�
--					not null - ���Ǳ⺻���� �ް�
--					primary key - not null + �ߺ�����
--					�� �����͸� ��ǥ�ϴ� ���� �� 
--					=> ���̺� �ϳ����� primary key�� �ִ°� ����

--					��ȣ�� 1 -> �����, ���, 300, 3000, ����

		---- ���� �ڵ����� �ö󰡴� sequence (���̺�� ����)
				-- create sequence jun25_owner_seq; --����
				-- drop sequence jun25_owner_seq; --����
				-- ��������.nextval�� ���
-- ������ ���� : U
select * from jun25_menu;
update ���̺��
set �ʵ��=��, �ʵ��=��, ......    <- �ٲܳ���
where;

-----������ ���� : D
�߿�! delete * �Ⱦ��°���
delete from ���̺��
where;
----------------------------------------------------------------------					 
-- 1. ���̺� �����
					
					
create table ���̺��(
	�ʵ�� �ڷ���[�ɼ�],
	�ʵ�� �ڷ���[�ɼ�],
	�ʵ�� �ڷ���[�ɼ�],
);

-- 1. ���̺� ���� : �����뿡 �ȳְ�, ���̺� �ɸ� ���� ��Ģ����
drop table ���̺�� cascade constraint purge;
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
--2.������ �ֱ� - C
--insert into ���̺��(�ʵ��, �ʵ��, ....) values(��, ��, ��...);
insert into JUN24_STUDENT
(s_no, s_name, s_gender, s_age,  s_kor, s_eng, s_mat)
values(1, 'ȫ�浿','����', 20, 100, 50, 30);

insert into JUN24_STUDENT
(s_no, s_name, s_age,  s_kor, s_eng, s_mat)
values(1, '��浿', 20, 20, 10, 15);

--insert into ���̺�� values(��, ��, �� ....);
insert into jun24_student values(4,'�ֱ浿',30,'����',10,50,20);
----------------------------------------------------------------------------------

-- 3. ��ȸ - R
select * from JUN24_STUDENT;

select �ʵ��, �ʵ�� as �г���(�ʵ�� �ٲ㼭 ����Ҷ�), ...
from ���̺��
where ����;
order by �ʵ��, �ʵ�� desc , �ʵ��,(n������); : ���� (1������, ������ 2������, ������ 3������..)
desc ���̸� ��������

--��ü ���� �̸�, ���ݸ�
select s_name, s_price
from JUN24_SNACK;

-- ��ü ���� �̸�, ������, ����, ������Ѹ�
select s_name, s_maker as jejosa, s_price, s_exp
from JUN24_SNACK;

-- ��ü ���� �̸�, ����, �ΰ���
select s_name, s_price, s_price * 0.1 as s_vat
from JUN24_SNACK;

-- ��ü ���� �̸�, ������, ����, g�� ��
select s_name, s_maker, s_price, s_price/s_weight as s_price2
from jun24_snack;

-- ��� �Լ� : max, min, sum, avg, count : select ������ ��������
-- ��ü ���� ���� ���
select avg(s_price)
from jun24_snack;

-- ������
select min(s_price)
from JUN24_SNACK;
-- ������� ���� ���� ������
select max(s_exp)
from JUN24_SNACK;
-- ���� �� �
select count(*)
from JUN24_SNACK;

-- ���� �̸�, ȸ���, ����, �Ե�����Ŀ��
select s_name, s_maker, s_price
from JUN24_SNACK
where s_maker = '�Ե�';

-- �Ե� ���� ��հ�
select avg(s_price)
from JUN24_SNACK
where s_maker = '�Ե�';

-- �Ծ �Ǵ� ���� �̸�, ȸ���, ����
select s_name, s_maker, s_price
from JUN24_SNACK
where s_exp >= sysdate;

-- �����νø���(Ű��������) �����̸�, ȸ���, ����
'%��' : ���� �����°�
'��%' : ���� �����ϴ°�
'%��%' : ���� �ִ°�
select s_name, s_maker, s_price
from JUN24_SNACK
where s_name like '%������%';

-- �� �ø��� �ְ�
select max(s_price)
from jun24_snack
where s_name like '%��%';

-- subquery
-- �ְ�
select max(s_price)
from jun24_snack;

-- subquery �̿�
-- �ְ� ���� �̸�, ȸ���, ����
select s_name, s_maker, s_price
from jun24_snack
where s_price = (select max(s_price)
from jun24_snack);

-- ��հ����� ��� ���� �̸�, ������, ����
select s_name, s_maker, s_price
from jun24_snack
where s_price > (select avg(s_price)
from jun24_snack);

-- ���� ������ ���� �̸�, ����, g�� ��
select s_name, s_price, (s_price/s_weight) as s_price2
from jun24_snack
where s_weight = (select min(s_weight)
from jun24_snack);

-- ���� ������ ��հ����� ��� ���ڵ� ���� ��ü
select avg(s_price)
from jun24_snack
where s_maker = '����' -- ������ ������ ��հ�

select *
from jun24_snack
where s_price > (
	select avg(s_price)
	from jun24_snack
	where s_maker = '����'
);

-- ������, �Ե����� ���� ��ü (or����)
select *
from jun24_snack
where s_maker = '������' or s_maker = '�Ե�';

-- 1000 < ���� < 5000 �� ���� ���� ��ü
select *
from jun24_snack
where s_price < 5000 and s_price >1000;

-- �����°��� ��ü������ �����̸� �����ټ�, ���� �������� ����
select *
from jun24_snack
where s_maker = '������'
order by s_name, s_price desc;

-- 5000�� ���� ����
-- ���� ����� �� �ִ°� ����Ʈ ���
-- ������� �� �ȳ����� �������� ���̰�

select *
from jun24_snack
where s_price < 5000
order by s_exp;

-- �����Ͱ� 1~1000�������� �ִµ�
-- �� �������� 3���� ������
-- 2������ �з��� : 4,5,6�� ���̱�

-- ����Ŭ���� �����ʵ� - rownum
--		order by���� ���� �ߵ�
--		������ 1������ ��ȸ�ؾ� 
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
-- ����
-- �̸� ������ �߷� ���� �������
create table jun24_snack(
	s_no number(5) primary key,
	s_name varchar2(10 char) not null,
	s_maker varchar2(10 char) not null,
	s_weight number(5, 1) not null,
	s_price number(5) not null,
	s_exp date not null
);
---- ���� �ڵ����� �ö󰡴� sequence (���̺�� ����)
create sequence ��������;
create sequence jun24_snack_seq;
-- ��������.nextval�� ���


--------------------- ����ð���¥ : sysdate
insert into jun24_snack values(jun24_snack_seq.nextval, '�����', '���', 300.5, 3000, sysdate);
select * from JUN24_snack;

-- Ư���ð���¥ : to_date('��', 'YYYY MM DD HH24:MI:SS')
-- 				: to_date('��', 'YYYY MM DD PM HH:MI:SS')
insert into jun24_snack values(jun24_snack_seq.nextval, '������', '�Ե�', 100.5, 1000, 
to_date('2022-12-31', 'YYYY-MM-DD'));
select * from JUN24_snack;

insert into jun24_snack values(jun24_snack_seq.nextval, '����ƾƾ', '���', 100.6, 1000, to_date('2023-12-22', 'YYYY-MM-DD'));
select * from JUN24_snack;

insert into jun24_snack values(jun24_snack_seq.nextval, 'ABC���ݸ�', '����', 100.6, 1000, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '��û����', '����', 100.6, 1200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '��������', '����', 200.6, 4200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

insert into jun24_snack values(jun24_snack_seq.nextval, '����', '������', 120.6, 3200, to_date('2023-12-22-12:55:55', 'YYYY-MM-DD-HH:MI:SS'));

select * from JUN24_snack;
drop table jun24_snack cascade constraint purge;
