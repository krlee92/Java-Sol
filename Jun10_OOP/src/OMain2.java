

public class OMain2 {
	public static void main(String[] args) {
		// 메뉴명이 제육볶음, 가격이 8000원 인 메뉴
		// 출력
		//////////////////////////////
		//식당A
		Menu m = new Menu();		
		m.name = "제육볶음";
		m.price = 8000;
		m.printMenuInfo();
		System.out.println("---------------");
		//식당 B에도 제육볶음 8000원짜리
		Menu m2 = m; // A식당 제육볶음을 m2라는 변수로도 접근 가능하게.
		m2.printMenuInfo();
		m2.price = 10000; //제육볶음값 만원으로 인상
		m2.printMenuInfo();
		m.printMenuInfo(); // m,m2는 heap의 같은주소에 저장되있음
//								따라서 m2값을 바꾼것 = m값을 바꾼것
		System.out.println("---------------");
		Menu m3 = new Menu();
		m3.name = "제육볶음";
		m3.price = 5000;
		m3.printMenuInfo();
		m3.price = 90000;
		m.printMenuInfo();
		System.out.println(m);
		System.out.println(m3);
		System.out.println("---------------");
		m2 = null; // 참조형 변수가 아무 번지(주소)도 가리키지 않게. 주소를 지우는게 아님
		m = null; // garbage collection 발동 : heap에 더이상 접근 못하게 됨으로 heap 자동정리
		m3 = null; // garbage collection 발동 시점을 지금으로.
//						지금 안하면 프로그램 끝날때까지 m3 남아있음.
		System.out.println("ㅋㅋㅋㅋㅋ");
		System.out.println("ㅋㅋㅋㅋㅋ");
		System.out.println("ㅋㅋㅋㅋㅋ");
		
	}

}
// ?
// stack : 프로그램 종료되면 자동정리
// heap : 자동 정리 안됨
//			garbage collection : heap영억 자동정리
//				그 번지에 더이상 접근할 방법이 없게 되면 발동