import java.util.Scanner;

// �迭
//	���鶧 ������ ����
//		���鶧 ������ �𸣸�? -> ��� �Ұ�
//		������ �߰� �Ұ���
//	=>	Ȱ�뵵�� �������� �Ⱦ��°�
public class AMain2 {
	// ���� �ΰ� ������ ������ ����ϴ� �Լ�
	public static void printSum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
//	�� �迭 �����
//	int[] a = new int[6]; //6ĭ¥�� ��迭
	int[] a = {0,0,0,0,0,0}; // �ѴٶȰ���.
	

//	���� ���� ������ ������ ����ϴ� �Լ�
	public static void printSum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

//	 ������ � �ֵ��� �� ���� ����ϴ� �Լ�
	public static void printGob(int... is) { // int�� ���������� ���� �� �ִ�
		// �Լ������� ����� �迭���
		System.out.println(is[0]); //ù��°
		int a = 1;
		for (int i : is) { //printGob(11,22,32,232);�� �ִ� is���� i�� ���ʴ�� ��´�.
			a *= i;
		}
		System.out.println(a);
		
//		for (int i = 0; i < is.length; i++) {
//			a *= is[i]; // a = a*is[i]
//		}
//		System.out.println(a);

	}

	public static void main(String[] args) {
		printGob(11,22,32,232);
		printSum(1,2);
		printSum(1,2,3);
		System.out.println("-------------");

		int[] kor = new int[5]; // 5ĭ¥�� �� �迭
		kor[0] = 100;
		kor[1] = 23;
		kor[2] = 33;
		kor[3] = 43;
		kor[4] = 53; // �迭�Է� ���Ĺ���
		////////////
		int[] eng = { 12, 24, 32, 31, 45 }; // �迭�Է� ��Ĺ���
//		kor[5] = 100;  ���� �߰� �Ұ�
//		eng[5] = 100;  

		// �������� ���
		int sum = 0;
		int studentCount = eng.length;
//		for-each��
//			i�� ���� -> Ȱ�뵵 ������
//			���� �����ȵ�

		for (int e : eng) { //eng�� �ִ� int���� e�� ���ʴ�� ��´�.
			sum += e;
		} System.out.println(sum);
		// Wi-Fi : 1 << 0 = 1
		// ������ : 1 << 1 = 2
		// 24�ð� : 1 << 2 = 4
		// ���� : 1 << 3 = 8

		int cafe = 8; // 13���� 8+4+1�̹Ƿ�, �������� �ش�ȵŴ°��� ����ϴ°�.
		String[] option = { "��������", "������", "24�ð�", "����" };
		for (int i = option.length-1; i >= 0; i--) {
			if (cafe >= (1 << i)) {
				System.out.println(option[i]);
				cafe -= (1 << i);
		}
		}
		
		

	}

}
