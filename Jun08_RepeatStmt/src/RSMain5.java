import java.util.Random;
import java.util.Scanner;

public class RSMain5 {
	// 0 ~ 10������ ������ ���ڸ� �̾Ƴ��� �Լ�
	public static int pick() {
		Random r = new Random();
		int ans = r.nextInt(11);
		return ans;
	}
	
	public static int getInput() {
		Scanner k = new Scanner(System.in);
		System.out.println("�� : ");
		int ans = k.nextInt();
		return ans;
	}
	
	public static void main(String[] args) {
//		while���� �������� ���� break���.
//		continue;�� �ִ�.
		
		// pick �̶�� �Լ��� ����� gameAns�� ����
		int gameAns = 0;
		int myAns = 0;
		// �ݺ��� �ӿ��� ���� ����°� ���Ϸ���
		
		while (true) {
			gameAns = pick();
			myAns = getInput();
			
			System.out.printf("�� : %d\n", gameAns);
			if (gameAns == myAns) {
				break;		//while�̶�� �ݺ��� �ȿ��� �극��ũ ���(�ݺ��׸�)
			}
			System.out.println("��");
			
		}
		
		
		
	}

}
