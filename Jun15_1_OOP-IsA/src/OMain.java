//  �Ź� is a ��ǰ => ���

// �Ź�
//		�𵨸�
//		����
//		������
//		�������
public class OMain {
	public static void main(String[] args) {
		Shoes s = new Shoes();
		s.name = "?";
		s.price = 0;
		s.size = 0;
		s.printInfo();
		System.out.println("------------");
		// ��
		//		������ũ
		//		1000��
		//		����
		//		���
		Pen p = new Pen();
		p.name = "������ũ";
		p.price = 1000;
		p.color = "����";
		p.printInfo();
		System.out.println("------------");
		// ��ȭ = �Ź�
		//		�̸� : ī�̸�6
		//		���� : 100000
		//		������ : 265
		//		������ : ����Ʈ����
		//		���
		BasketBallShoes bbs = new BasketBallShoes();
		bbs.name = "ī�̸�6";
		bbs.price = 1000000;
		bbs.size =  265;
		bbs.position = "PG";
		bbs.printInfo();
		System.out.println("------------");
		
		// ��ǻ��
		//		���������̼�123
		//		cpu : i7-1234
		//		ram : 8
//				hdd : 500
//				���� : 800000
//				���
		Computer c = new Computer();
		c.name = "���������̼�123";
		c.cpu = "i7-1234";
		c.ram = 8;
		c.hdd = 500;
		c.price = 800000;
		c.printInfo();
		System.out.println("------------");
		// ��Ʈ��
		//		����123
//				cpu : i7-1111
//				ram : 8
//				hdd : 1000
//				���� : 200000
//				���� : 5kg
//				���
		laptop l = new laptop();
		l.name ="����123";
		l.cpu ="i7-1111";
		l.ram = 8;
		l.hdd = 1000;
		l.price = 200000;
		l.weight = 5;
		l.printInfo();
		System.out.println("------------");
//		���� ¦���� �̱� - ������ ������ ����߰�
		RandomMachine rm = new RandomMachine();
		int a = rm.nextInt(10);
		System.out.println(a);
		System.out.println("------------");
		
		Pen p2 = new Pen(); // Pen ����-> product�� �⺻�����ڸ� ȣ����
//		Pen p3 = new Pen("��", 1); //������ ��ӾȵǴϱ� ����
		Pen p3 = new Pen("�𳪹�153", 300, "����");
		p3.printInfo();
		System.out.println("----------");
		// ��ŵ��123, 1000��¥�� ����ũ
		// �������
		Mask m = new Mask("��ŵ��123", 1000);
		m.printInfo();
		
	}

}
