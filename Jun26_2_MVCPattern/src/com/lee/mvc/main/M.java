package com.lee.mvc.main;

// Model : °è»ê 
public class M {
	public static void calculate(Result r) {
		int a = r.getX() + r.getY();
		int b = r.getX() - r.getY();
		int c = r.getX() * r.getY();
		int d = r.getX() / r.getY();
		
		r.setHab(a);
		r.setCha(b);
		r.setGob(c);
		r.setMoks(d);
		
	}

}
