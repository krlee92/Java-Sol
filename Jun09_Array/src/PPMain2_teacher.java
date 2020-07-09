import java.util.Random;
import java.util.Scanner;

public class PPMain2_teacher {
	
	public static void printHelp(String[] hand) {
		System.out.println("����������");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%d. %s\n", i , hand[i]);
		}
		System.out.println("----------");
	}
	
	public static int userFire() {
		System.out.println("�� :");
		int userHand = new Scanner(System.in).nextInt();
		return (userHand >= 1 && userHand <= 3) ? userHand : userFire();
	}
	
	public static int comFire() {
//		Random r = new Random();
//		int comHand = r.nextInt(3) + 1;
//		return comHand;
		return new Random().nextInt(3) + 1;
		
	}
	
	public static void printHand(int uh, int ch, String [] h) {
		System.out.printf("�� : %s\n", h[uh]);
		System.out.printf("�� : %s\n", h[ch]);
	}
	
	public static int judge(int uh, int ch) {
		//  �� �� ��
		//�� 1 2 3
		//�� 1 2 3
		int t = uh - ch; // ������ - �ļ���
		if (t == 0) {
			System.out.println("��");
			return 0;
		} else if(t == -1 || t == 2) {
			System.out.println("��"); //�̿��� ����Ǽ��� ����.
			return -394;
		} else {
			System.out.println("��");
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		// ����, ��� ���
		String[] hand = {"", "����", "����", "��"};
		printHelp(hand);
		int userHand = userFire();
		int comHand = comFire();
		printHand(userHand, comHand, hand);
		judge(userHand, comHand);
		userHand = 0;
		comHand = 0;
		int n = 0;
		int win = 0;
		while (true) {
			userHand = userFire();
			comHand = comFire();
			printHand(userHand, comHand, hand);
			n = judge(userHand, comHand);
			if (n == -394) {
				break;
			}
			win += n;
		}
		System.out.printf("%d����", win);
	}

}
