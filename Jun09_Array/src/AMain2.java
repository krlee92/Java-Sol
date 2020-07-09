import java.util.Scanner;

// 배열
//	만들때 사이즈 지정
//		만들때 사이즈 모르면? -> 사용 불가
//		사이즈 추가 불가능
//	=>	활용도가 떨어져서 안쓰는것
public class AMain2 {
	// 정수 두개 넣으면 그합을 출력하는 함수
	public static void printSum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
//	빈 배열 만들기
//	int[] a = new int[6]; //6칸짜리 빈배열
	int[] a = {0,0,0,0,0,0}; // 둘다똑같다.
	

//	정수 세개 넣으면 그합을 출력하는 함수
	public static void printSum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

//	 정수를 몇개 넣든지 그 곱을 출력하는 함수
	public static void printGob(int... is) { // int를 무제한으로 넣을 수 있다
		// 함수내에서 사용은 배열취급
		System.out.println(is[0]); //첫번째
		int a = 1;
		for (int i : is) { //printGob(11,22,32,232);에 있는 is값을 i에 차례대로 담는다.
			a *= i;
		}
		System.out.println(a);
		
//		for (int i = 0; i < is.length; i++) {
//			a *= is[i]; // a = a*is[i]
//		}
//		System.out.println(a);

	}

	public static void main(String[] args) {
		printGob(11,22,32,232);
		printSum(1,2);
		printSum(1,2,3);
		System.out.println("-------------");

		int[] kor = new int[5]; // 5칸짜리 빈 배열
		kor[0] = 100;
		kor[1] = 23;
		kor[2] = 33;
		kor[3] = 43;
		kor[4] = 53; // 배열입력 정식버전
		////////////
		int[] eng = { 12, 24, 32, 31, 45 }; // 배열입력 약식버전
//		kor[5] = 100;  점수 추가 불가
//		eng[5] = 100;  

		// 영어점수 평균
		int sum = 0;
		int studentCount = eng.length;
//		for-each문
//			i가 없음 -> 활용도 떨어짐
//			순서 조절안됨

		for (int e : eng) { //eng에 있는 int값을 e에 차례대로 담는다.
			sum += e;
		} System.out.println(sum);
		// Wi-Fi : 1 << 0 = 1
		// 주차장 : 1 << 1 = 2
		// 24시간 : 1 << 2 = 4
		// 흡연실 : 1 << 3 = 8

		int cafe = 8; // 13값은 8+4+1이므로, 주차장은 해당안돼는것을 출력하는것.
		String[] option = { "와이파이", "주차장", "24시간", "흡연실" };
		for (int i = option.length-1; i >= 0; i--) {
			if (cafe >= (1 << i)) {
				System.out.println(option[i]);
				cafe -= (1 << i);
		}
		}
		
		

	}

}
