// ������ ��� ������ ����̰� ����°� -> static 
//		static �������
//			����Ӽ� ǥ���Ҷ�
//			static ������ �ϳ��� �������(�������ŭx)
//			���α׷� �������ڸ��� static ������ ����Ȯ��
//			-> �޸�����
//			-> ��ü ���������� ��밡���� ������
//	static final �������
//		static Ư�� ����
//		�����Ұ� -> ���ȭ
//		((!�߿�!))�������� �� �빮�ڷ�
//		->Math.PI = Math��� Ŭ���� �ȿ��� PI��� �Ӽ����ִµ� static final ��������ΰ�.

//	static �޼ҵ�(�ҽ�)
//		-> �޸� ������ �ణ..(���ο��� ȣ���)
//		-> ��ü ���������� ��밡���� �޼ҵ�
//		(��Ʋ��)static �޼ҵ忡�� static�� �ƴѰ� ���Ұ�(Static �޼ҵ��� �ȿ��� ���� ������ Static������)
//  ���θ޼ҵ��� (String[] args) : jar���� �����(.bat) (�޸��忡?)��ɾ� ���ԵǴ� �ڸ�.

public class Gejang {
	
	String name; // ������ ��������� �� �� heap�� ����Ȯ��
	// �Ϲݿ����� ���(static�Ⱥ��� �޼ҵ�)
	double weight;
	int price;
	//static,�Ϲ� �Ѵ� ���(static�� �پ��⶧����)
	static String maker = "�����"; //�޸𸮻� ����ƽ������ ����� �ϳ�������(���� ����ŭ x)
//		���α׷� �������ڸ��� static ������ ����Ȯ��
//	String maker = "�����" : �������ڵ�
	static final String MADEIN = "����";
	
	public static void printMaker() {
		System.out.println(maker);
	}
	
	public void printProductInfo() {
		System.out.println("��ǰ�� :" + this.name);
		System.out.println("������ :" + maker);
		System.out.println(weight +"kg");
		System.out.println("���� :" + price);
		System.out.println(MADEIN);
	}
	
	public static void test() {
		System.out.println("��");
//		System.out.println(name); // ?
		System.out.println(maker);
		
	}
}
