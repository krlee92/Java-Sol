import java.util.Random;
import java.util.Scanner;

// ���� ������ ������ �ƶ�����(���ö�����) ���ѷ���

public class FMain6 {
	//¦���� �Է¹޴� �Լ�(Ȧ���� ������ �ٽó־���ϴ�)
	public static int getJjak() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("¦�� : ");
		int n = keyboard.nextInt();
		int ans = (n % 2 == 0) ? n : getJjak();
		return ans;
	}
	
	//�����Ͻðڽ��ϱ�? : ���Ǹ� ��� �ϴ� �Լ�.
	// ==�����ڴ� ���ڸ� ��.
	// ���ڿ��� equals�� ����Ѵ�.

	public static String agree() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("�����Ͻðڽ��ϱ�?");
		String a = keyboard.next();
		String ans = (a.equals("����")) ? a : agree();
		return ans;
	}
	
	// 0 ~ 10������ ������ ¦���� ���
	public static int getRandJjak() {
		Random r2 = new Random();
		int i2 = r2.nextInt(11);
		int ans = (i2 % 2 == 0) ? i2 : getRandJjak();
		return ans;
//		���ο�����
//		int i2 = getRandJjak();
//		System.out.println(i2);

		
	}
				
	
	public static void main(String[] args) {
		int n = getJjak();
		System.out.println("-------------");
		System.out.println(n);
		String agree2 = agree();
		System.out.println(agree2 + "�߳׿�");
		
		// 0 ~ 10������ ������ ���ڸ� ���
		Random r = new Random();
		int i = r.nextInt(11); // 0~10������.
		
		System.out.println(i);
		
		int i2 = getRandJjak();
		System.out.println(i2);
		
		
		 
		
		
	}

}
