import java.util.Scanner;

public class RSMain7 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
//				break;		// 반복 끝
				continue;	// 턴 종료(이경우 i=홀수일시 if조건만족, i프린트 안하고 i=2로 넘어간다) 
			}
			System.out.println(i);
		}
//이병
//		눈치보기
//		관등성명
//		훈련
//		잠
//일병
//		관등성명
//		훈련
//		잠
//상병
//		훈련
//		잠
//병장
//		잠
//간부  :종료되게. 간부라고 쓸때까지 반복
		

//		switch (level) {
//		case "이병":
//			System.out.println("눈치보기");
//		case "일병":
//			System.out.println("관등성명");
//		case "상병":
//			System.out.println("훈련");
//		case "병장":
//			System.out.println("잠");
//
//		default:
//			break;
//		}
		Scanner k = new Scanner(System.in);
		String g = null;
		h : while (true) { //(true) 무조건 반복하는것
			System.out.print("계급 :");
			g = k.next();
			System.out.println("-----------");
//			if (g.equals("간부")) { //반복을
//				break;
//			}
			
			switch (g) {
			case "간부":
				break h;
			case "이병":
				System.out.println("눈치보기");
			case "일병":
				System.out.println("관등성명");
			case "상병":
				System.out.println("훈련");
			case "병장":
				System.out.println("잠");
//				break; - switch case 반복문 끝내는것.
//			default: //없어도 무관
//				break;
		}
			
	}
		
		
	}
}
