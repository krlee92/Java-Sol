// ���� ��ġ�ų� �����ų�
// \\192.168.0.81 - workspace
// ctrl shift / �Լ� ����
// ctrl shift * �Լ� ��ġ��
// ctrl (�Լ���)Ŭ�� : �Լ��� �̵�
// ctrl z : �������
// �Լ� Function
//		���õ� �۾��� ��� ���� �س���, �ʿ��� ������ ������ ��� 
//	�Լ��� �⺻���� public static ����Ÿ�� �Լ���(�Ķ����){


public class FMain {
	public static void introduce() {

		System.out.println("�̰���");
		System.out.println("�۵�");
		System.out.println("����ö");

	}

//	public static ����Ÿ�� �Լ���(�ڷ��� ������, �ڷ��� ������, ...) {
//		����
//	}

//	����Ÿ�� : �ڷ��������ڸ�
//		�Լ��� ���� ����� �����°� ���� �����ڸ�
//	�Լ��� : ������� ��Ģ�� ����, ���罺���� ���̹�, ������ ��罺����

//	parameter, ���� : �Լ��� �� ����ִ���

	// �����ε�(overloading)
	// �⺻������ �Լ����� �ߺ����� �ʾƾ� �Ѵ�
	// �Ķ���Ͱ� �ٸ��� (�ڷ��� or ����) �Լ��� ���Ƶ� ��
	// ��Ŭ������ ȣ���Ҷ� ������ ����
	public static void main(String[] args) { // main �Լ�, JVM�� �����Լ��� �ҷ� �����Ѵ�.

		// 2. �ʿ��� �� ���� ������ ��� -> �Լ� ȣ��
		yaDambae();
		introduce();
		calculate(456, 123);
		calculate(23, 23);
		judgeOverweight(175, 60);
		calculate("dd", 2);

	}

	// ������ 2�� ������ ��Ģ���� ����� ����ϴ� �Լ�
	public static void calculate(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

	// Ű, �����Ը� ������ �񸸵��� ����ϴ� �Լ�
	public static void judgeOverweight(double c, double d) {

		double eWeight = ((c - 100) * 0.9);
		double bimando = (d / eWeight) * 100;
		System.out.println(bimando);

	}

	public static void calculate(String c, int d) {
		System.out.println(c + d);

	}

	// JVM�� main�Լ��� �ڵ����� �θ�

	// 1.���õ� �۾��� ��� ���� �س��� -> �Լ� ����
	public static void yaDambae() { // yaDambae �Լ�
		System.out.println("��Ӵ����� ���� 5000�� �޶��ؼ�");
		System.out.println("���ۿ� ����");
		System.out.println("���ܸ����� �Ѷ�� 1�� �޶� �ض�");
		System.out.println("���µ� �� ���� ��԰�");
		System.out.println("�Ѷ���� ������");

	}

}
