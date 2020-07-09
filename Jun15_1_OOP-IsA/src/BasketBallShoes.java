// 농구화는 신발, 신발은 상품
public class BasketBallShoes extends Shoes{ // 2단상속도 똑같이
	// Product에 있는 name, price
	// Shoes에 있는 size 다 들어옴.
	String position;
	
	@Override
	public void printInfo() {
		super.printInfo(); // Shoes의 printInfo()호출
		System.out.println(position);
	}

}
