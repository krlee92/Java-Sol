
public class Pen {
	String maker;
	int price;
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(String maker, int price, String color) {
		super();
		this.maker = maker;
		this.price = price;
		this.color = color;
	}
	
	public void print() {
		System.out.println(maker);
		System.out.println(price);
		System.out.println(color);
	}

}
