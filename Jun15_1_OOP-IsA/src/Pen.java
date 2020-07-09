// 생성자는 상속 안됨
// Pen 생성 -> product의 기본생성자를 호출함
// Pen의 생성자를 쓰고싶으면 따로 만들어야
public class Pen extends Product {
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String name, int price, String color) {
		super(name, price); // product(이름, 가격)
		this.color = color;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
	

}
