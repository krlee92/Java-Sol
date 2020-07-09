package com.lee.jun15oop.main;

import com.lee.jun15oop.coffee.Coffee;

public class Tester extends Coffee{
	
	public void test() {
		Coffee c = new Coffee();
		c.a = 1; //public 아무데서나
		c.b = 2; //protected 같은패키지, 상속관계
		c.c = 3; //안쓴거 : 같은패키지
		c.d = 4;
	}

}
