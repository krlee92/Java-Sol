import java.util.Scanner;

public class RSMain6 {
	public static void main(String[] args) {
		// ���� :
		// ���� :
		// ���� :
		// ���� :
		// ���� :
		// ------
		// �� :
		Scanner k = new Scanner(System.in);
		int a = 0;
		int f = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("���� :");
			f = k.nextInt();
			a += f; // a = a+f// a�ʱⰪ�� 0, i=1�϶� a���� (������Է°�1)����. i=2�϶� a=������Է°�1+������Է°�2����...
		}
		System.out.println("-----------");
		System.out.printf("�� : %d\n", a);
		System.out.println("-----------");

//		 ���� :
//		 ���� :
//		..���� : ����(�ݺ���)
//		---------------
//		 ��:
		int b = 0;
		int c = 0;
		while (true) { //(true)�� ������ �ݺ� ����.
			System.out.print("���� :");
			b = k.nextInt();
			c += b;
			if (b < 0) { //�ݺ��� ������ ����
				break;
			}
		}
		System.out.println("-----------");
		System.out.printf("�� : %d\n", c);

	}
}
