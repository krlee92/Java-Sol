package com.lee.cafe.console;

import java.util.ArrayList;
import java.util.Scanner;

import com.lee.cafe.bean.Bean;
import com.lee.cafe.cafe.Cafe;
import com.lee.cafe.cafe.Menu;

// V

public class ConsoleScreen {
	static Scanner k = new Scanner(System.in);
	
	public static void printMenus(ArrayList<Menu> menus) {
		for (Menu menu : menus) {
			System.out.printf("%d) ", menu.getNo());
			System.out.printf("%s ", menu.getName());
			System.out.printf("%d원 ", menu.getPrice());
			System.out.printf("%s산 ", menu.getBean());
			System.out.printf("매장번호 :%d\r\n", menu.getWhere());
			
		}
	}
	
	public static void printBeans(ArrayList<Bean> beans) {
		for (Bean bean : beans) {
			System.out.printf("%s-", bean.getName());
			System.out.printf("%s\r\n", bean.getTaste());
		}
		
	}
	
	public static void printCafes(ArrayList<Cafe> cafes) {
		for (Cafe cafe : cafes) {
			System.out.printf("%d)", cafe.getNo());
			System.out.printf("%s %s\n", cafe.getName(), cafe.getWhere());
		}
		
	}
	
	public static void printResult(String result) {
		
		System.out.println(result);
	}
	
	public static Menu showRegMenu() {
		
		System.out.println("메뉴명 :");
		String n = k.next();
		System.out.println("가격 :");
		int p = k.nextInt();
		System.out.println("원두 :");
		String b = k.next();
		System.out.println("매장번호 :");
		int w = k.nextInt();
		return new Menu(0, n, p, b, w);
	}
	
	public static Cafe showRegCafeMenu() {
		
		System.out.println("카페명 :");
		String n = k.next();
		System.out.println("지점명 :");
		String w = k.next();
		return new Cafe(0, n, w);
		
	}
	
	public static Bean showRegBean() {
		
		System.out.println("원두명 :");
		String n = k.next();
		System.out.println("원두맛 :");
		String t = k.next();
		return new Bean(n, t); 
	}
	
	public static int showMainMenu() {
		
		Scanner k = new Scanner(System.in);
		System.out.println("-------");
		System.out.println("1. 카페추가");
		System.out.println("2. 원두추가");
		System.out.println("3. 음료추가"); 
		System.out.println("4. 매장전체조회");
		System.out.println("5. 원두전체조회");
		System.out.println("6. 음료(메뉴)수정"); // 하는중
		//....
		System.out.println("10. 종료");
		System.out.println("-------");
		System.out.println("뭐 :");
		return k.nextInt();
	}

}
