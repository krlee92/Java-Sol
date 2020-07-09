package com.lee.cafe.main;

import java.util.ArrayList;

import com.lee.cafe.bean.Bean;
import com.lee.cafe.cafe.BeanDAO;
import com.lee.cafe.cafe.Cafe;
import com.lee.cafe.cafe.CafeDAO;
import com.lee.cafe.cafe.Menu;
import com.lee.cafe.cafe.MenuDAO;
import com.lee.cafe.console.ConsoleScreen;
// 콘솔창 보여줄것
// ojdbc8.jar
// C

// 1.카페추가
// 2.원두추가
// 3.음료추가
// 4.매장정보조회
// 5.원두정보조회
// 6.음료(메뉴) 수정
// 10. 종료


public class CafeMain {
	public static void main(String[] args) {
		int menu = 0;
		Cafe c = null;
		String result = null;
		Bean b = null;
		ArrayList<Cafe> cafes = null;
		ArrayList<Bean> beans = null;
		Menu m = null;
		ArrayList<Menu> menus = null;
		while (true) {
			menu = ConsoleScreen.showMainMenu();
			if (menu == 10) {
				break;
			} else if (menu == 1) {
				c = ConsoleScreen.showRegCafeMenu();
				result = CafeDAO.regCafe(c);
				ConsoleScreen.printResult(result);
			} else if (menu == 2) {
				b = ConsoleScreen.showRegBean();
				result = BeanDAO.regBean(b);
				ConsoleScreen.printResult(result);

			}  else if (menu == 4) {
				cafes = CafeDAO.getAllCafe();
				ConsoleScreen.printCafes(cafes);
			} else if (menu == 5) {
				beans = BeanDAO.getAllBean();
				ConsoleScreen.printBeans(beans);
			} else if (menu == 3) { // 원두정보랑 매장정보(번호)를 봐야 음료추가 가능
				cafes = CafeDAO.getAllCafe();
				ConsoleScreen.printCafes(cafes);
				beans = BeanDAO.getAllBean();
				ConsoleScreen.printBeans(beans); 
				System.out.println("----------");
				m = ConsoleScreen.showRegMenu();
				result = MenuDAO.regMenu(m);
				ConsoleScreen.printResult(result);
				System.out.println("----------");
			} else if (menu == 6) {
				menus = MenuDAO.getAllMenu();
				ConsoleScreen.printMenus(menus);
				System.out.println("-----------");
				m = ConsoleScreen.showRegMenu();
				
				
			}
			

		}

	}
}
