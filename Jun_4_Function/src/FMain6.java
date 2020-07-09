import java.util.Random;
import java.util.Scanner;

// 내가 설정한 조건이 됄때까지(나올때까지) 무한루프

public class FMain6 {
	//짝수를 입력받는 함수(홀수를 넣으면 다시넣어야하는)
	public static int getJjak() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("짝수 : ");
		int n = keyboard.nextInt();
		int ans = (n % 2 == 0) ? n : getJjak();
		return ans;
	}
	
	//동의하시겠습니까? : 동의를 써야 하는 함수.
	// ==연산자는 숫자만 비교.
	// 문자열은 equals를 사용한다.

	public static String agree() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("동의하시겠습니까?");
		String a = keyboard.next();
		String ans = (a.equals("동의")) ? a : agree();
		return ans;
	}
	
	// 0 ~ 10사이의 랜덤한 짝수를 출력
	public static int getRandJjak() {
		Random r2 = new Random();
		int i2 = r2.nextInt(11);
		int ans = (i2 % 2 == 0) ? i2 : getRandJjak();
		return ans;
//		메인영역에
//		int i2 = getRandJjak();
//		System.out.println(i2);

		
	}
				
	
	public static void main(String[] args) {
		int n = getJjak();
		System.out.println("-------------");
		System.out.println(n);
		String agree2 = agree();
		System.out.println(agree2 + "했네요");
		
		// 0 ~ 10사이의 랜덤한 숫자를 출력
		Random r = new Random();
		int i = r.nextInt(11); // 0~10까지임.
		
		System.out.println(i);
		
		int i2 = getRandJjak();
		System.out.println(i2);
		
		
		 
		
		
	}

}
