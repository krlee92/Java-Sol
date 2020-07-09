import java.util.Random;
import java.util.Scanner;

// 반복문
//		반복횟수가 명확 : for(10번반복)
//		반복조건이 명확 : while, do-while(내일아침까지)
//			while문은 검사를 먼저 하고(한번도 반복이 안 될수도 있다)
//			do-while문은 일단 반복행동을 하고 검사한다(한번은 반복이 보장됨)
//			do-while 잘 안쓴다

//		반복문에 사용할만한것 break; continue;

public class RSMain4 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ....... + 50 = ?
		int c = 0;
		for (int i = 1; i <= 50; i++) {
			c += i;
			
		}
		System.out.println(c);
		System.out.println("-----------");
		
		// 1 + 2 + 3 + .... ? >= 1000
		// ? 최소값 --> 반복조건이 명확
//		while문은 if문의 반복버전
//		while(반복을 멈추는 조건){
//			조건안맞을시
//			반복
//	    }
		
		int b = 0;
		int i = 0;
		while (b < 1000) {
			i++;
			b += i;
		}
		System.out.println(i);
		System.out.println(b);
		System.out.println("---------------");
		// 0 ~ 100사이의 랜덤한 숫자 출력
		// 35 나오면 그만
//		Random r = new Random();
//		int i = r.nextInt(11); // 0~10까지임.
		
		Random r = new Random();
		int d = r.nextInt(101);
		while (d !=35) {
			System.out.println(d);
			d = r.nextInt(101); // 다시 숫자를 뽑아야 무한루프 할것. 이게 없으면 안댐
		}
		System.out.println(d);
		System.out.println("-----------");
		
		// 사람들 나이를 계속해서 입력받자
		// -1쓰면 그만
		Scanner k = new Scanner(System.in);
		System.out.println("나이 :");
		int age = k.nextInt();
		while (age != -1) {
			System.out.println("안녕");
			System.out.println("나이 :");
			age = k.nextInt(); //나이를 다시 입력받아야함. 아니면 처음 입력값이 무한루프함.
		}
		System.out.println("---------");
		// 사람들 키를 계속해서 입력받자
		// -1쓰면 그만
		
//		do - while문
//		do { 반복할 행동
//			
//		} while (반복멈추는조건);
//		
		System.out.println("키 :");
		int height = k.nextInt();
		do {
			System.out.println("ㅎㅎㅎ");
			System.out.println("키 :");
			height = k.nextInt();
		} while (height != -1);

		
		
		// 0~5사이 랜덤뽑고 숫자하나써서 그거 맞히기
		// 언제 답뽑을지 모르니 while
		
		Random z = new Random();
		int u = 0; //한번 u라는 변수를 선언하면, 그 뒤로는 u선언을 안한다(하면에러)
		u = z.nextInt(6);
		// 0 ~ 5사이 랜덤 뽑고
		System.out.println("뭐 :");
		int select = k.nextInt();
		System.out.printf("컴 : %d\n", u);
		// 숫자 하나 써서 그거 맞히기
		while (u != select) {
			System.out.println("땡");
			System.out.println("뭐 :");
			u = z.nextInt(6);
			select = k.nextInt();
			System.out.printf("컴 : %d\n", u);
			// 정답 나올때까지
		}

		
	}
}
