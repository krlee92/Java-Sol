package abcd;
import Product;

public class Scanner extends Product{
	int speed;
	
	public Scanner() {
		// TODO Auto-generated constructor stub
	}

	public Scanner(String name, int price, int speed) {
		super(name, price);
		this.speed = speed;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(speed);
	}
	
	

}
