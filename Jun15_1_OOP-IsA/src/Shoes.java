// �Ź� is a ��ǰ => ��� extends =>Ȯ��

//@XXX : annotation - �ڵ����� ������ ���ִ°�
public class Shoes extends Product{
	// product�� �ִ� �Ӽ����� �� ��ӵ�
	int size;
	
	// product�κ��� �����޾ƿ� printInfo()�� �̸�, ������� ��ɸ�
	// printInfo()�� ������ �̸�, ����, ��������� ���������
	// => �����޾ƿ� printInfo()��� �� ����(����߰�)�ϰ� ����
	// overriding
	
	@Override // �ٷ� �ؿ� overriding�޼ҵ尡 �־��
//				-> �ҽ��� ���� �ٷ� �˰� ǥ�ÿ�(�������̵� ���پ˰�)
	public void printInfo() {
		super.printInfo(); // spuer(����Ŭ����,�θ�Ŭ����) = Product
								// Product�� �ִ� printInfo() ȣ��
		System.out.println(size);
		
	}
	
	
}
