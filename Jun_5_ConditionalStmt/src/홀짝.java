import java.util.Random;
import java.util.Scanner;

// 홀짝게임 컴퓨터가 1~10개 사이 랜덤하게 동전개수

// 뭐 : 
// -----------
// 컴퓨터가 5개 냈음
// 정답
// ===============================
// 1 ~ 10 랜덤한 숫자뽑기
// 입력받기
// 정답인지 체크

public class 홀짝 {
	


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r2 = new Random();
		int i2 = r2.nextInt(10) +1;
		System.out.print("뭐:") ;
		String a = keyboard.next();
		System.out.println("----------------------");
		System.out.printf("컴퓨터가 %s냈음\n", i2);
//		if (i2 % 2 == 0 && a.equals("짝")) {
//			System.out.println("정답");
//		} else if (i2 % 2 == 1 && a.equals("홀")) {
//			System.out.println("정답");
//		} else {
//			System.out.println("땡");
//		}
		
		String random = ((i2 % 2 == 0) && a.equals("짝") || (i2 % 2 == 1) && a.equals("홀")) ? "정답" : ("땡");
		System.out.println(i2);
		// 삼항연산에서 프린트는 못한다. random이란변수에 값을 넣는거만 가능
		System.out.println(random);
		
		
	}

}
