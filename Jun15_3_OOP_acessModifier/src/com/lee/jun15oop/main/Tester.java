package com.lee.jun15oop.main;

import com.lee.jun15oop.coffee.Coffee;

public class Tester extends Coffee{
	
	public void test() {
		Coffee c = new Coffee();
		c.a = 1; //public �ƹ�������
		c.b = 2; //protected ������Ű��, ��Ӱ���
		c.c = 3; //�Ⱦ��� : ������Ű��
		c.d = 4;
	}

}
