// 쉬프트 연산자 <<(shift) : 다중선택할때 
//		1 << 2 : 1을 2진수로 바꿔서 왼쪽으로 2번 밀고 0 채우기 => 100(2진수) => 4

// 사용법 : 특성값 정하기
// 와이파이 : 1 << 0 = 1
// 주차장	: 1 << 1 = 2
// 흡연실	: 1 << 2 = 4
// 24시간	: 1 << 3 = 8
// A(흡연실):4
// B(24시간):8
// C(주차장+흡연실):6(2+4)
// D(와이파이+주차장+흡연실):7(1 + 2 + 4)
// E(와이파이+흡연실+24시간):13(1 + 4+ 8)

//조건 따져서 값 대입
//*!중요!*삼항연산자(값이 3개 들어가는) (if else 쓰지말고 이거쓰자) 
//		조건 ? 조건만족시 값: 조건만족못했을시 값 ;
//		예) String (변수명) = (age > 20) ? "어서오세요" : "나가";

import java.util.Scanner;

public class OMain3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //JDK1.5추가
		
		// 나이:
		//----------
		// ()살
		System.out.print("나이");
		int age = keyboard.nextInt();
		System.out.println("--------------------------");
		System.out.printf("%d살\n", age);
		//나이가 20살 넘으면 어서오세요,
		//안되면 나가
		//삼항연산
		String say = (age > 20) ? "어서오세요" : "나가";
		System.out.println(say);


	}

}
