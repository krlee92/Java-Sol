// 수업 놓치거나 빠지거나
// \\192.168.0.81 - workspace
// ctrl shift / 함수 접기
// ctrl shift * 함수 펼치기
// ctrl (함수를)클릭 : 함수로 이동
// ctrl z : 실행취소
// 함수 Function
//		관련된 작업을 묶어서 정리 해놓고, 필요할 때마다 가져다 사용 
//	함수의 기본형은 public static 리턴타입 함수명(파라메터){


public class FMain {
	public static void introduce() {

		System.out.println("이강산");
		System.out.println("송도");
		System.out.println("지하철");

	}

//	public static 리턴타입 함수명(자료형 변수명, 자료형 변수명, ...) {
//		내용
//	}

//	리턴타입 : 자료형쓰는자리
//		함수의 실행 결과로 나오는게 뭔지 쓰는자리
//	함수명 : 변수명과 규칙이 같다, 동사스러운 네이밍, 변수는 명사스럽다

//	parameter, 인자 : 함수에 뭘 집어넣는지

	// 오버로딩(overloading)
	// 기본적으로 함수명은 중복되지 않아야 한다
	// 파라메터가 다르면 (자료형 or 갯수) 함수명 같아도 됨
	// 이클립스가 호출할때 구별을 해줌
	public static void main(String[] args) { // main 함수, JVM은 메인함수를 불러 실행한다.

		// 2. 필요할 때 마다 가져다 사용 -> 함수 호출
		yaDambae();
		introduce();
		calculate(456, 123);
		calculate(23, 23);
		judgeOverweight(175, 60);
		calculate("dd", 2);

	}

	// 정수를 2개 넣으면 사칙연산 결과를 출력하는 함수
	public static void calculate(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

	// 키, 몸무게를 넣으면 비만도를 출력하는 함수
	public static void judgeOverweight(double c, double d) {

		double eWeight = ((c - 100) * 0.9);
		double bimando = (d / eWeight) * 100;
		System.out.println(bimando);

	}

	public static void calculate(String c, int d) {
		System.out.println(c + d);

	}

	// JVM은 main함수를 자동으로 부름

	// 1.관련된 작업을 묶어서 정리 해놓고 -> 함수 정의
	public static void yaDambae() { // yaDambae 함수
		System.out.println("어머니한테 가서 5000원 달라해서");
		System.out.println("슈퍼에 가서");
		System.out.println("아줌마한테 한라산 1갑 달라 해라");
		System.out.println("남는돈 너 과자 사먹고");
		System.out.println("한라산은 가져와");

	}

}
