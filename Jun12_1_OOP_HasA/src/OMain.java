//	��ü�� ����(Has A ����)
// 		Has A
//			House Has A Bug
// 		Is A
//			House Is A Bug(x)
public class OMain {
	public static void main(String[] args) {
		// �����ְ�1����, 1���� �ִ� ��
		// ���
		House h = new House("�����ְ�1����", 1);
//		h.print();
		System.out.println("-------");
		// ��������, 3cm ����
		// ���
		Bug b = new Bug("��������", 3);
		b.print();
		System.out.println("-------");
		
		h.bug = b; // h������ b��� ������ ���´ٴ� ǥ��.
		h.print();
		System.out.println("================");
		// ��ȭ�ְ�4����, 9���� ��
		House h2 = new House("��ȭ�ְ�4����",9);
		h2.print();
		System.out.println("================");
		
		// �̸��� �Ǳ��, ���̰� 29�� ���
		// �� ����� �� �������� ������ �����ְ�1������ ���.
		Human k = new Human("�Ǳ��", 29);
		k.home = h;
		k.introduce();
		System.out.println("================");
		
		// ������s4, 01031544435, ���� �ڵ���
		// �ڵ��� ������ (�������������� �����ְ�1������ ��� �Ǳ��)
		// ��ȭ�� �������
		Phone p = new Phone("������s4", "01031544435", "silver");
		p.owner = k;
		p.print();
		System.out.println("================");
		
		// �ǵ���, 3000��, ��
		// �Ǳ���� ���Ⱑ �ǵ���
		// �ڱ�Ұ�
		Chemical c = new Chemical("�ǵ���", 3000);
		k.weapon = c;
		k.introduce();
		System.out.println("=========");
//		Has A ����
		// �Ǳ���� ���� ���ݸ� �˰������
		System.out.println(k.weapon.price);
		System.out.println("=========");
		
		// �Ǳ���� ���� ������
		System.out.println(k.home.floor);
		System.out.println("=========");
		
		// �Ǳ���� ������ ������ ���� �̸�
		System.out.println(k.home.bug.name);
		System.out.println("=========");
		
		//������s4�� ������ ������ ������ ���� ������
		System.out.println(p.owner.home.bug.size);
		System.out.println("=========");
		
		// �Ǳ�� ������ ������ ���� ���� ��ü ���
		k.home.bug.print();
	}

}
