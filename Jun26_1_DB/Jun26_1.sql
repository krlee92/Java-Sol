-- �ɳ����� �� ����
-- �ݷҺ������ �� �Ÿ�

--�� ��� �Ⱦ�

-- 4000��¥�� �Ƹ޸�ī�� �ɳ�(����)���θ� ��Ÿ���� ����������
-- 4500��¥�� ļ.�� �ɳ�(����)���θ� ��Ÿ���� ����������
-- 5500��¥�� ��.�� �ݷҺ��(�Ÿ�)���θ� ���ٹ� ����������
-- 5000��¥�� �Ƹ޸�ī�� �ɳ�(����)���θ� ��Ÿ���� ����������

-- ���̺� �����, ������ �����
-- ���̺� ����, ������ ���� -> ���α׷����� ����

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

-- ��ȸ, ���
select * from jun26_cafe;
select * from jun26_menu;
select * from jun26_bean;

drop table jun26_bean cascade constraint purge;
drop table jun26_menu cascade constraint purge;
drop table jun26_cafe cascade constraint purge;

insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '��Ÿ����', '����'
);
insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '��Ÿ����', '����'
);
insert into jun26_cafe values(
	jun26_cafe_seq.nextval, '���ٹ�', '����'
);


insert into jun26_menu values(
	jun26_menu_seq.nextval, '�Ƹ޸�ī��', 4000, '�ɳ�', 1
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, '�Ƹ޸�ī��', 5000, '�ɳ�', 2
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, 'ļ��Ḷ���ƶ�', 5000, '�ɳ�', 2
);
insert into jun26_menu values(
	jun26_menu_seq.nextval, '������', 5500, '�ݷҺ��', 3 
);


insert into jun26_bean values(
	'�ɳ�', '����'
);
insert into jun26_bean values(
	'�ݷҺ��', '�Ÿ�'
);

delete from jun26_cafe
where c_no = 4;



