package com.lee.mvc.main;

import java.util.Scanner;

// V : View 입력, 출력만

public class V {
	
	public static void printResult(Result r) {
		System.out.println(r.getHab());
		System.out.println(r.getCha());
		System.out.println(r.getGob());
		System.out.println(r.getMoks());
	}
	
	public static Result getInput() {
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		
		Result r = new Result(x, y);
		
		return r;
	}
}
