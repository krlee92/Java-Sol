import java.util.Random;
import java.util.Scanner;

// Ȧ¦���� ��ǻ�Ͱ� 1~10�� ���� �����ϰ� ��������

// �� : 
// -----------
// ��ǻ�Ͱ� 5�� ����
// ����
// ===============================
// 1 ~ 10 ������ ���ڻ̱�
// �Է¹ޱ�
// �������� üũ

public class Ȧ¦ {
	


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r2 = new Random();
		int i2 = r2.nextInt(10) +1;
		System.out.print("��:") ;
		String a = keyboard.next();
		System.out.println("----------------------");
		System.out.printf("��ǻ�Ͱ� %s����\n", i2);
//		if (i2 % 2 == 0 && a.equals("¦")) {
//			System.out.println("����");
//		} else if (i2 % 2 == 1 && a.equals("Ȧ")) {
//			System.out.println("����");
//		} else {
//			System.out.println("��");
//		}
		
		String random = ((i2 % 2 == 0) && a.equals("¦") || (i2 % 2 == 1) && a.equals("Ȧ")) ? "����" : ("��");
		System.out.println(i2);
		// ���׿��꿡�� ����Ʈ�� ���Ѵ�. random�̶������� ���� �ִ°Ÿ� ����
		System.out.println(random);
		
		
	}

}
