// 0. JVM�� OMain2.main(null);�� ����
// 1. �ҽ�(�޼ҵ�)�� ����� �����Ȱ� �� stack�� : R
// 2. static ����������� static ������ : G
// 3. 16���� ���� ��... : B


public class OMain2 {
	public static void main(String[] args) throws InterruptedException {
		// static �޼ҵ� ȣ�� : �޸� 0���
		Gejang.printMaker();
		
		// �Ϲ� �޼ҵ� ȣ��  : �޸� 64bit + a���
		Gejang gg = new Gejang();
		gg.printMaker();
		
		
		for (String s : args) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		System.out.println(Gejang.maker);
		System.out.println(Gejang.MADEIN);
		System.out.println("----------");
		Gejang.test();
		
		Gejang g = new Gejang();
		g.name = "������Ư��";
		g.price = 39900;
		g.weight = 10;
		g.printProductInfo();

	}

}
