// ��ȭ�� �Ź�, �Ź��� ��ǰ
public class BasketBallShoes extends Shoes{ // 2�ܻ�ӵ� �Ȱ���
	// Product�� �ִ� name, price
	// Shoes�� �ִ� size �� ����.
	String position;
	
	@Override
	public void printInfo() {
		super.printInfo(); // Shoes�� printInfo()ȣ��
		System.out.println(position);
	}

}
