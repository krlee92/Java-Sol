-- RDB(RelationalDB) : OracleDB, MySQL, MariaDB, ...
--		���̺��� ���踦 �߽����� �ذ�

-- subquery�� ����� ������ ������ where r_in = Ȱ��



-- DB������
-- ���ﵿ�� �ִ� ���������ֿ��� 5000��¥�� ��������
-- ���ﵿ�� �ִ� ���������ֿ��� 6000��¥�� �Ұ�ⵤ��
-- ��ġ���� �ִ� ������������ 5500��¥�� ¥���
-- ��ġ���� �ִ� ������������ 6500��¥�� «��

-- ȫ�浿 1980-01-01�� ���ﵿ ���������ָ� �
-- ��浿 1990-02-02�� ��ġ�� ���������� �
-- ȫ�浿 1990-02-02�� ��ġ�� ���������ָ� �

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
'ȫ�浿', to_date('1990-01-01', 'YYYY-MM-DD'));
insert into jun25_ceo values(jun25_ceo_seq.nextval,
'��浿', to_date('1980-02-02', 'YYYY-MM-DD'));
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

insert into jun25_menu values(jun24_menu_seq.nextval, '��������', 5000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '��ä���', 3000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '�Ұ�ⵤ��', 6000, 1);
insert into jun25_menu values(jun24_menu_seq.nextval, '����', 9000, 6);
insert into jun25_menu values(jun24_menu_seq.nextval, '��¥��', 6000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, '������', 16000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, '«��', 7000, 2);
insert into jun25_menu values(jun24_menu_seq.nextval, 'Į����', 8000, 3);
insert into jun25_menu values(jun24_menu_seq.nextval, '�ո���', 6000, 3);
insert into jun25_menu values(jun24_menu_seq.nextval, '�޺���̼�����', 7000, 4);
insert into jun25_menu values(jun24_menu_seq.nextval, '�������', 9000, 4);
insert into jun25_menu values(jun24_menu_seq.nextval, '�޺���̼�����', 14000, 5);
insert into jun25_menu values(jun24_menu_seq.nextval, 'ŷ����', 29000, 5);




insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '����������', '���ﵿ');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '����������', '��ġ��');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '��������', '��ġ��');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '��Į����', '���빮��');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '59������', '�۵���');
insert into jun25_restaurant values(jun24_restaurant_seq.nextval, '���̳�����', '�۵���');
------------��ȸ ���

drop table jun25_ceo cascade constraint purge;
drop table jun25_menu cascade constraint purge;
drop  jun25_restaurant cascade constraint purge;

select * from jun25_menu;
select * from jun25_restaurant;
select * from jun25_ceo;
select * from jun25_owner;

---------------------------------------------------------
-- ���� �˰��ִ� ���� �̸�, ��ġ(�̸� �����ټ�)
select r_name, r_where
from jun25_restaurant
order by r_name;

-- ���� �˰� �ִ� �޴��߿� ���� ��Ѱ� ����
select *
from jun25_menu
where m_price = (select max(m_price) from jun25_menu);

-- �� ���� ����� �߿� �ְ� ������ ����
select *
from jun25_ceo
where c_birthday = (select min(c_birthday) from jun25_ceo); 

-- �� �ø��� ��հ�
select avg(m_price)
from jun25_menu
where m_name like '%��%';

-- ���ﵿ ���� ����
select *
from jun25_restaurant
where r_where = '���ﵿ';


-- ���� �� �޴��� �Ĵ� �Ĵ��̸�, ��ġ
-- where r_no = Ȱ��� subquery�� ����δ� �ϳ��� ���;� 
-- subquery�� ����� ������ ������ where r_in = Ȱ��
select r_name, r_where
from jun25_restaurant
where r_no = (
	select m_where
	from jun25_menu
	where m_price = (select min(m_price)
	from jun25_menu
					)
);

- ���Ͻ� �޴��� �Ĵ� �Ĵ� ��ȣ
select m_where
from jun25_menu
where m_price = (select min(m_price)
from jun25_menu
);

- ���Ͻ� �޴� �̸�
select m_name
from jun25_menu
where m_price = (select min(m_price)
from jun25_menu
);

---- ���ﵿ���� ���� �� �ִ� �͵� �̸�, ����
select m_name, m_price
from jun25_menu
where m_where in (
		select r_no
		from jun25_restaurant
		where r_where = '���ﵿ'
);

select r_no
from jun25_restaurant
where r_where = '���ﵿ'; --���ﵿ �Ĵ� ��ȣ


-- �� �ø���� ��𰡸� ���� ���ֳ�
select r_where
from jun25_restaurant
where r_no in(
		select m_where
		from jun25_menu
		where m_name like '%��%'
);

select m_where
from jun25_menu
where m_name like '%��%'; -- ��ø��� �Ĵ� �Ĵ� ��ȣ

-- ���������� ���ﵿ  ������ �޴� ��ü ���
-- ����������, ���ﵿ�̶�� ������ �̿��ؼ� ã��
select *
from jun25_menu
where m_where = (
	select r_no
	from jun25_restaurant
	where r_name = '����������' and r_where = '���ﵿ'
);

select r_no
from jun25_restaurant
where r_name like '%����������%' and r_adress = '���ﵿ' -- �����������̰� ���ﵿ�ΰ��� ��ȣ

-- �ֿ����� �������� �޴���, ���� ��ü ���(���� ��������)
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
	from jun25_ceo); --�ֿ����� ��ȣ
	
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
-- ���������� ��ü��/ �޴���, ����, ������ġ ��ȸ
-- join
select m_name, m_price, r_where
from jun25_menu, jun25_restaurant
where m_where = r_no and r_name = '����������';

-- ���� �Ѱ� �Ĵ� ���忡�� �������ִ�  ���� ��ġ, �޴���, ����
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


-- ���� ���� ����Գ�
--		�����, ��ġ, ������̸�, ����, �޴���, ����
--		���� ��������

select r_name, r_where, c_name, c_birthday, m_price, m_name
from jun25_menu, jun25_restaurant, jun25_ceo, jun25_owner
where m_where = r_no and r_no = o_no and m_where = o_no;

-----------------------------------------------
-- ������ ���� : U
select * from jun25_menu;
update ���̺��
set �ʵ��=��, �ʵ��=��, ......    <- �ٲܳ���
where;

--- �������� 6000������ ����
update jun25_menu
set m_price =6000
where m_name = '��������';
-- ���� �Ѱ� ����
update jun25_menu
set m_price = 0
where m_price = (
	select min(m_price)
	from jun25_menu
);
-- ��հ����� ��Ѱ� 10%����ֱ�
update jun25_menu
set m_price = m_price * 0.9
where m_price > (
	select avg(m_price)
	from jun25_menu
);
-- ���ﵿ �޴� 1000�� �λ�
update jun25_menu
set m_price = m_price + 1000
where m_where in (
	select r_no
	from jun25_restaurant
	where r_where = '���ﵿ'
);

select * from jun25_menu;
select * from jun25_restaurant;
---------------------------------
-----������ ���� : D
�߿�! delete * �Ⱦ��°���
delete from ���̺��
where;

-- ���������� ������ ���

delete from jun25_menu
where m_where = (
	select r_no
	from jun25_restauarant
	where r_name = '����������' and r_where = '���ﵿ'
);

delete from jun25_restaurant
where r_name = '����������'  and r_where = '���ﵿ';

insert into jun25_menu values(jun25_menu_seq.nextval, '�׽�Ʈ', 100, 10)

delete from jun25_menu 
					 where m_where in (
					select r_no 
					from jun25_restaurant 
					where r_name like '%��%');
