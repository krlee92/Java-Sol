// Part 2.
// ~part1 : Procedural P
//		������� �� �ڵ��ؼ� ��� ����
//------------------------------------
//	Object Oriented P
//		���������� ������ ���·� ������
//		-> �ڵ尡 �˾ƺ��� ���ؾ�
//		-> �ڵ�� �ǻ�Ȱ ����

public class OMain {
	public static void main(String[] args) {
		// �� ���̰� 3��
		int �߻�age = 3;
		// �� �̸��� �߻�
		String dogName = "�߻�";
		// ���� ¢��(�� ���)
		System.out.println("��");
		//////////////////////////////
		// ��ü : �ǻ�Ȱ�� �����ϴ� ��
		// ��ü�� ������� Ŭ������ �ʿ�
		Dog d; // ���� ���� �� �ִ� ���� d
		d = new Dog(); // �� �Ѹ��� ���� d�� ����
//		System.out.println(d); // d�� ������, ������ ������ ������
		Dog d2 = new Dog();
		d2.age = 3;
		d2.name = "�ǻ�";
		d2.bark();
		d2.printDogInfo();
		
		d.printDogInfo();

		
	}

}
