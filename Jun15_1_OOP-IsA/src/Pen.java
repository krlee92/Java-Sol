// �����ڴ� ��� �ȵ�
// Pen ���� -> product�� �⺻�����ڸ� ȣ����
// Pen�� �����ڸ� ��������� ���� ������
public class Pen extends Product {
	String color;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String name, int price, String color) {
		super(name, price); // product(�̸�, ����)
		this.color = color;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
	

}
