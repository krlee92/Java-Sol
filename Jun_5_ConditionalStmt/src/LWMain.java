import java.util.Random;
import java.util.Scanner;

public class LWMain {
	// 1 ~ 10 ������ ���ڻ̱�
	public static int shake() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// �Է¹ޱ�
	public static String say() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� : ");
		String myAns = k.next();
		if (myAns.equals("Ȧ") || myAns.equals("¦")) {
			return myAns;
		} 
		return say();
	}
	
	// �����ϰ� �̾Ƴ� ���ڰ� Ȧ���� ¦���� ����
	public static String judgeOddOrEven(int asdf) {
		String ans = (asdf % 2 == 0) ? "¦" : "Ȧ";
		return ans;
	}
	
	// ��������
	public static String judge(String myAns, String gameAns) {
		String result = myAns.equals(gameAns) ? "����" : "��";
		return result;
	}
	
	// ������
	public static void printResult(int c, String r) {
		System.out.printf("���� : %d��\n", c);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		int coinHahaha = shake();	// shake()�Լ��� ����� coinHahaha�� ����
		String myAnsHaha = say();
		String ansHaha = judgeOddOrEven(coinHahaha);
		String resultHaha = judge(myAnsHaha, ansHaha);
		printResult(coinHahaha, resultHaha);
	}
}
