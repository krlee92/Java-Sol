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
			System.out.printf("%d�� ", menu.getPrice());
			System.out.printf("%s�� ", menu.getBean());
			System.out.printf("�����ȣ :%d\r\n", menu.getWhere());
			
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
		
		System.out.println("�޴��� :");
		String n = k.next();
		System.out.println("���� :");
		int p = k.nextInt();
		System.out.println("���� :");
		String b = k.next();
		System.out.println("�����ȣ :");
		int w = k.nextInt();
		return new Menu(0, n, p, b, w);
	}
	
	public static Cafe showRegCafeMenu() {
		
		System.out.println("ī��� :");
		String n = k.next();
		System.out.println("������ :");
		String w = k.next();
		return new Cafe(0, n, w);
		
	}
	
	public static Bean showRegBean() {
		
		System.out.println("���θ� :");
		String n = k.next();
		System.out.println("���θ� :");
		String t = k.next();
		return new Bean(n, t); 
	}
	
	public static int showMainMenu() {
		
		Scanner k = new Scanner(System.in);
		System.out.println("-------");
		System.out.println("1. ī���߰�");
		System.out.println("2. �����߰�");
		System.out.println("3. �����߰�"); 
		System.out.println("4. ������ü��ȸ");
		System.out.println("5. ������ü��ȸ");
		System.out.println("6. ����(�޴�)����"); // �ϴ���
		//....
		System.out.println("10. ����");
		System.out.println("-------");
		System.out.println("�� :");
		return k.nextInt();
	}

}
