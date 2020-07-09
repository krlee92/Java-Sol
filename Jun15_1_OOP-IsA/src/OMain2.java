import abcd.Scanner;

// 클래스명 중복나면?
// JAVA특징 : 남이 작업해놓은거 잘 활용
//				패키지명으로 구분한다
// 패키지
//		클래스(패키지속에 들어있음)
public class OMain2 {
	public static void main(String[] args) {
//		클래스 생성 : 패키지명.클래스명 변수명 = new 생성자;
		java.util.Scanner k = new java.util.Scanner(java.lang.System.in);
		
		// 캐논1234, 500000원, 1분당 100장 스캔하는 스캐너
		// 정보출력
		abcd.Scanner kk = new Scanner("캐논1234", 500000, 100); //abcd패키지의 스캐너
		kk.printInfo();
	}

}
 