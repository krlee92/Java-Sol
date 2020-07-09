// Part 2.
// ~part1 : Procedural P
//		순서대로 잘 코딩해서 결과 내자
//------------------------------------
//	Object Oriented P
//		유지보수에 유리한 형태로 만들자
//		-> 코드가 알아보기 편해야
//		-> 코드로 실생활 묘사

public class OMain {
	public static void main(String[] args) {
		// 개 나이가 3살
		int 삐삐age = 3;
		// 개 이름이 삐삐
		String dogName = "삐삐";
		// 개가 짖음(멍 출력)
		System.out.println("멍");
		//////////////////////////////
		// 객체 : 실생활에 존재하는 거
		// 객체를 만들려면 클래스가 필요
		Dog d; // 개를 담을 수 있는 변수 d
		d = new Dog(); // 개 한마리 만들어서 d에 저장
//		System.out.println(d); // d는 참조형, 참조형 데이터 번지값
		Dog d2 = new Dog();
		d2.age = 3;
		d2.name = "뽀삐";
		d2.bark();
		d2.printDogInfo();
		
		d.printDogInfo();

		
	}

}
