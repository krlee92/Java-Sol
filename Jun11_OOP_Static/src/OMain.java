// static �߾��°� OOP ���ϴ°�
// ������ ��� ������ ����̰� ����°� -> static 
//		static �������
//			����Ӽ� ǥ���Ҷ�

public class OMain {

	public static void main(String[] args) {
		// ��ǰ�� : ����Ư����Ʈ, ������ 39900, ���԰�5kg, ����̰� ���� ����
		// ���
		System.out.println(Gejang.maker);
		System.out.println("---------------");
		Gejang g = new Gejang();
		g.name = "���� Ư�� ��Ʈ";
		g.price = 39900;
		g.weight = 5;
		g.printProductInfo();
		System.out.println(g.maker); //�����ڸ� �˰������ 
//		System.out.println(Gejang.maker); �����ڵ���� Gejang.maker�̴�.
		
		System.out.println("---------------");
		// ��ǰ�� :������弼Ʈ, 29900, 3kg, ����̰� ���� ����
		Gejang g2 = new Gejang();
		g2.name = "������弼Ʈ";
		g2.price = 29900;
		g2.weight = 3;
		g2.printProductInfo();
		System.out.println("---------------");
		g2.price = 29000000;
		g2.maker = "�ּ���"; //�̽�����static ��ȭ��.
//		g2.madeIn = "�߱���"; :���ٲ� ����������
		g.printProductInfo();
		
	}

}
