// �ݺ���
public class RSMain {

	public static void main(String[] args) {
		//���� 5�����
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
		}
		System.out.println("-------------");
		// 0 1 2 3 4 �� ���
//		�������
//		1.i �������� i=0  
//		2.i�� �����˻� i<5
//		3.���Ǹ����� i���(System.out.println(i);
//		4.i�� 1�� �÷�����i++ 2�� �ø��°� i +=2
//		5.�������� �ݺ�
//		for�� �ȿ��� ���� �����ϸ� �޸� �δ� Ŀ�� - ����
//		for���ȿ��� ������ ������ for���ȿ����� �̿밡���ϴ�.
	
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 1 ~ 8���� ���
		for (int i = 1; i >= 8; i++) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 6 5 4 3 2 1���� ���
		for (int i = 6; i >= 1 ; i--) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 1 3 5 7 9 ���
//		for (int i = 1; i < 6; i++) {
//			System.out.println((i*2) - 1);
//		}
		for (int i = 1; i <= 9; i+= 2) { // �߿�! i+=2 2�� �ø��°�.
			System.out.println(i);
		}
		
		System.out.println("-------------");
		for (int i = 1; i <= 10; i++) {
//		int ans = (i % 2 == 0) ? "��" : i;
		System.out.println(i);
		if (i % 2 ==0 ) {
			System.out.println("��");
		} else {
			System.out.println();
		}
		}
		// 1 ~ 10���� ���, ¦���� ���ٿ���
		System.out.println("-------------");
		// 1 + 2 + 3 + ..... + 10 = ?
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			a += i;
			
		}
		System.out.println(a);
		System.out.println("-------------");
		// 11! = ?
		int b = 1;
		for (int i = 1; i <= 11; i++) {
			b *= i;
		}
		System.out.println(b);
		
		System.out.println("-------------");
		// 1 ~ 20���� Ȧ���� �� ���ϸ� ��?
		int c = 0;
		for (int i = 1; i <= 20; i+= 2) { // i+=2 >>2���ø�
			c += i;
		}
		System.out.println(c);


	}
}
