
public class HandPhone {
	//Ŭ���� ������ ��Ģ...
	// 1.������� ��ġ
	String name;
	String no; // ���ڷμ� �ǹ�(����Ұ� �ƴ�)�� ����.
	int price;
	
	// 2.�⺻������ ��ġ
	// ctrl + space : jsp/spring�� �ڵ����� �̰� ��뼭
	public HandPhone() {
		// TODO Auto-generated constructor stub
	}
	
	// 3.�����ε��� ������ ��ġ
	// ctrl + shift + A(����Ű �������)
	public HandPhone(String name, String no, int price) {
		super();
		this.name = name;
		this.no = no;
		this.price = price;
	}
	
	// 4. �Ϲ� �޼ҵ� ��ġ
	public void print() {
		System.out.println(name);
		System.out.println(no);
		System.out.println(price);
	}
	
	
	

}
