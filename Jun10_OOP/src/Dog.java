// java에는 함수가 없음 => perfect한 객체지향언어 -> 엄격함
// python은 함수, method 둘다 가능 => hybrid한 객체지향언어 ->자유도 높

// java의 main
// c언어 main

public class Dog {
	// 멤버xx
	// 멤버변수(파란색) - 그 객체만이 가지는 속성 표현
	//		자동 초기화 : 따라서 int age = 0;이런것 안함. age값이 자동초기화되므로
	
	int age; //멤버변수는  member variable, attribute, field 다씀..
	String name;
	
	// method - 행동, 프로그램에 필요한 기능
	public void bark() {
		System.out.println("멍");
	}
	
	public void printDogInfo() {
		System.out.println(name);
		System.out.println(age);
	}

}
