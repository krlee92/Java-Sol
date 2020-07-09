// 반복문
public class RSMain {

	public static void main(String[] args) {
		//ㅋ를 5번출력
		for (int i = 0; i < 5; i++) {
			System.out.println("ㅋ");
		}
		System.out.println("-------------");
		// 0 1 2 3 4 를 출력
//		실행순서
//		1.i 변수선언 i=0  
//		2.i값 범위검사 i<5
//		3.조건만족시 i출력(System.out.println(i);
//		4.i값 1씩 늘려가기i++ 2씩 늘리는건 i +=2
//		5.위과정의 반복
//		for문 안에서 변수 선언하면 메모리 부담 커짐 - 자제
//		for문안에서 선언한 변수는 for문안에서만 이용가능하다.
	
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 1 ~ 8까지 출력
		for (int i = 1; i >= 8; i++) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 6 5 4 3 2 1까지 출력
		for (int i = 6; i >= 1 ; i--) {
			System.out.println(i);
		}
		System.out.println("-------------");
		// 1 3 5 7 9 출력
//		for (int i = 1; i < 6; i++) {
//			System.out.println((i*2) - 1);
//		}
		for (int i = 1; i <= 9; i+= 2) { // 중요! i+=2 2씩 늘리는것.
			System.out.println(i);
		}
		
		System.out.println("-------------");
		for (int i = 1; i <= 10; i++) {
//		int ans = (i % 2 == 0) ? "ㅋ" : i;
		System.out.println(i);
		if (i % 2 ==0 ) {
			System.out.println("ㅋ");
		} else {
			System.out.println();
		}
		}
		// 1 ~ 10까지 출력, 짝수는 ㅋ붙여서
		System.out.println("-------------");
		// 1 + 2 + 3 + ..... + 10 = ?
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			a += i;
			
		}
		System.out.println(a);
		System.out.println("-------------");
		// 11! = ?
		int b = 1;
		for (int i = 1; i <= 11; i++) {
			b *= i;
		}
		System.out.println(b);
		
		System.out.println("-------------");
		// 1 ~ 20까지 홀수만 다 더하면 얼마?
		int c = 0;
		for (int i = 1; i <= 20; i+= 2) { // i+=2 >>2씩늘림
			c += i;
		}
		System.out.println(c);


	}
}
