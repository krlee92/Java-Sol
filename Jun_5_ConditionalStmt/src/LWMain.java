import java.util.Random;
import java.util.Scanner;

public class LWMain {
	// 1 ~ 10 랜덤한 숫자뽑기
	public static int shake() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// 입력받기
	public static String say() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 : ");
		String myAns = k.next();
		if (myAns.equals("홀") || myAns.equals("짝")) {
			return myAns;
		} 
		return say();
	}
	
	// 랜덤하게 뽑아낸 숫자가 홀인지 짝인지 판정
	public static String judgeOddOrEven(int asdf) {
		String ans = (asdf % 2 == 0) ? "짝" : "홀";
		return ans;
	}
	
	// 최종판정
	public static String judge(String myAns, String gameAns) {
		String result = myAns.equals(gameAns) ? "정답" : "땡";
		return result;
	}
	
	// 결과출력
	public static void printResult(int c, String r) {
		System.out.printf("동전 : %d개\n", c);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		int coinHahaha = shake();	// shake()함수의 결과를 coinHahaha에 저장
		String myAnsHaha = say();
		String ansHaha = judgeOddOrEven(coinHahaha);
		String resultHaha = judge(myAnsHaha, ansHaha);
		printResult(coinHahaha, resultHaha);
	}
}
