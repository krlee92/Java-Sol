

public class OMain2 {
	public static void main(String[] args) {
		// �޴����� ��������, ������ 8000�� �� �޴�
		// ���
		//////////////////////////////
		//�Ĵ�A
		Menu m = new Menu();		
		m.name = "��������";
		m.price = 8000;
		m.printMenuInfo();
		System.out.println("---------------");
		//�Ĵ� B���� �������� 8000��¥��
		Menu m2 = m; // A�Ĵ� ���������� m2��� �����ε� ���� �����ϰ�.
		m2.printMenuInfo();
		m2.price = 10000; //���������� �������� �λ�
		m2.printMenuInfo();
		m.printMenuInfo(); // m,m2�� heap�� �����ּҿ� ���������
//								���� m2���� �ٲ۰� = m���� �ٲ۰�
		System.out.println("---------------");
		Menu m3 = new Menu();
		m3.name = "��������";
		m3.price = 5000;
		m3.printMenuInfo();
		m3.price = 90000;
		m.printMenuInfo();
		System.out.println(m);
		System.out.println(m3);
		System.out.println("---------------");
		m2 = null; // ������ ������ �ƹ� ����(�ּ�)�� ����Ű�� �ʰ�. �ּҸ� ����°� �ƴ�
		m = null; // garbage collection �ߵ� : heap�� ���̻� ���� ���ϰ� ������ heap �ڵ�����
		m3 = null; // garbage collection �ߵ� ������ ��������.
//						���� ���ϸ� ���α׷� ���������� m3 ��������.
		System.out.println("����������");
		System.out.println("����������");
		System.out.println("����������");
		
	}

}
// ?
// stack : ���α׷� ����Ǹ� �ڵ�����
// heap : �ڵ� ���� �ȵ�
//			garbage collection : heap���� �ڵ�����
//				�� ������ ���̻� ������ ����� ���� �Ǹ� �ߵ�