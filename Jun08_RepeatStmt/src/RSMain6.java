import java.util.Scanner;

public class RSMain6 {
	public static void main(String[] args) {
		// 숫자 :
		// 숫자 :
		// 숫자 :
		// 숫자 :
		// 숫자 :
		// ------
		// 합 :
		Scanner k = new Scanner(System.in);
		int a = 0;
		int f = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자 :");
			f = k.nextInt();
			a += f; // a = a+f// a초기값은 0, i=1일때 a값에 (사용자입력값1)저장. i=2일때 a=사용자입력값1+사용자입력값2저장...
		}
		System.out.println("-----------");
		System.out.printf("합 : %d\n", a);
		System.out.println("-----------");

//		 숫자 :
//		 숫자 :
//		..숫자 : 음수(반복끝)
//		---------------
//		 합:
		int b = 0;
		int c = 0;
		while (true) { //(true)는 무조건 반복 돌림.
			System.out.print("숫자 :");
			b = k.nextInt();
			c += b;
			if (b < 0) { //반복을 끝내는 조건
				break;
			}
		}
		System.out.println("-----------");
		System.out.printf("합 : %d\n", c);

	}
}
