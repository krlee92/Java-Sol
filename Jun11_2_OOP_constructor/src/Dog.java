// overloading
// 생성자 작업을 전혀안해놓으면
//		컴파일할때 자바가 알아서 만들어줌
public class Dog {
	String name;
	int age;
	
	

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	
// 생성자 overloading
// 우클릭 - source - generate constructor using field
public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



//	 method overloading
//	public void test() {
//
//	}
//
//	public void test(int a) {
//
//	}

	// 생성자 overloading
	

	public Dog() { // 기본 생성자(default constructor)
		System.out.println("개 탄생");
	}

}
