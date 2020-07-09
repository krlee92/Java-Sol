import java.util.Random;
import java.util.Scanner;

public class RSMain5 {
	// 0 ~ 10사이의 랜덤한 숫자를 뽑아내는 함수
	public static int pick() {
		Random r = new Random();
		int ans = r.nextInt(11);
		return ans;
	}
	
	public static int getInput() {
		Scanner k = new Scanner(System.in);
		System.out.println("뭐 : ");
		int ans = k.nextInt();
		return ans;
	}
	
	public static void main(String[] args) {
//		while문의 대중적인 형태 break사용.
//		continue;도 있다.
		
		// pick 이라는 함수의 결과를 gameAns에 저장
		int gameAns = 0;
		int myAns = 0;
		// 반복문 속에서 변수 만드는거 안하려고
		
		while (true) {
			gameAns = pick();
			myAns = getInput();
			
			System.out.printf("컴 : %d\n", gameAns);
			if (gameAns == myAns) {
				break;		//while이라는 반복문 안에서 브레이크 사용(반복그만)
			}
			System.out.println("땡");
			
		}
		
		
		
	}

}
