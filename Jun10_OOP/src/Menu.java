// 클래스는 객체를 찍어내는 도장.
public class Menu {
	
	int price;
	String name;
	
	public void printMenuInfo() {
		
		// this : 이 객체(안쓰면 생략됨)
//		System.out.print(this.name + ":");
		System.out.print(name + ":");
		System.out.print(price + "원");
		System.out.println();
	}

}
