import java.util.Scanner;

// 특정 조건시에만 작업
// 조건문 -if문
// 삼항연산자 ex) String (변수명) = (조건) ? "조건만족시" : "불만족시"; 
//자바의 변수는 만들고 값 안넣으면 안됨

public class CSMain {

	public static void main(String[] args) {
		// 국어 :
		// 영어 :
		// 수학 :
		// -------------
		// 평균점수 : <- 소수점 첫재짜리 까지만(잘틀림)
		Scanner keyboard = new Scanner(System.in);
		System.out.print("국어 :");
		int kor = keyboard.nextInt();
		System.out.print("영어 :");
		int eng = keyboard.nextInt();
		System.out.print("수학 :");
		int mat = keyboard.nextInt();
		double av = (kor + eng + mat) / 3.0; // int / int => int이므로, int / double을 하던가
		// 3.0을하던가, 처음부터 변수를 int말고 double로 하던가, (double)3으로 형변환을 한다.
		System.out.println("----------------");
		System.out.printf("평균점수 :%.1f점\n", av);

		// 평균점수가 80점 넘으면 잘했다 출력 if(조건){ 발동할것}
		// 안되면 나가 출력 => if문 괄호 닫힌곳 뒤에 else
		// 70점 넘겼으면(70 <= 점수 <80) 잠깐 일로와봐 출력
		if (av >= 80) {
			System.out.println("잘했다");

		} else {
			System.out.println("나가");
			if (av >= 70) { // (av >= 70 && av < 80)은 틀린것. 애초에 else범위이므로 80밑임.
				System.out.println("잠깐 일로와봐");
			}
		}
		/////////////////////////////////////////////
		// 국어 >= 90 : 수
		// 80 <= 국어 <90: 우
		// ..
		// 국어 < 60 : 가
		// 자바의 변수는 만들고 값 안넣으면 안됨
		
		if (kor >= 90) {
			System.out.println("수"); // 90이상
		} else if (kor >= 80) { //여러개있다고 무조건 else if가 아니라, if조건이 안됐을때 차선책으로 씀
			System.out.println("우"); // 90은 안됐지만 80이상
		} else if (kor >= 70) {
			System.out.println("미"); // 80은 안됐지만 70이상
		} else if (kor >= 60) {
			System.out.println("양"); // 70은 안됐지만 60이상
		} else {
			System.out.println("가");// 위에 조건들에 해당 없음
		}

	}

}
