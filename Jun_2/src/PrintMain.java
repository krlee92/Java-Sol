import javax.swing.Spring;

//JVM이 실행
public class PrintMain { // 문법적으로 필요
	public static void main(String[] args) {
		// 모든 자바 코드는 여기다
		System.out.println("w"); // 콘솔창에 글자 출력+개행
//		w : 자바문법 "w" :글자 데이터
		System.out.println("wwwwwww");
		System.out.print("lol");
		System.out.print("cool"); // ln없으면 개행안한다
		System.out.println();
		System.out.println("---------");
		System.out.println("이름 :\t홍길동");
		System.out.println("키 :\t180");
		System.out.println("몸무게:\t80");
		// 줄맞춤
		// \t : 탭키 \n :new line줄(만)바꿈
		// 탭키: 탭 포인트가 있어서 포인트까지 이동
		// \r : carrage return
		// \r\n : 줄바꾸기 완성버전
		// \b : backspace 1byte지우기
		// C언어 : 한글자가 1byte
		// JAVA : 한글자가 2byte
		// \" : 글자취급
		// 날씨:"맑음" 출력
		System.out.println("날씨 :\"맑음\""); 
		// C:\program Files 출력
		System.out.println("C:\\Program Files"); 
		
		// 출력형식 지정 printf

		// printf %d: 정수데이터(소수점없는거) 들어올 자리. decimal
		// 자리 번호 : 2
		System.out.printf("번호 : %d번\n", 2);
		// %05d : 5자리로
		System.out.printf("번호 : %03d번\n", 2);
		//printf %f :실수데이터(소수점) 들어올 자리 float
		//%.3f:소수점 자리수
		System.out.printf("시력 :%.3f\n", 1.5);
		//습도 : 60.12% = printf 사용중 %를 출력 :%% 
		System.out.printf("습도 : %.2f%%\n", 60.123456);
		System.out.println("%");
		// %s: 글자 데이터 들어올 자리 : string(문자열)
		//품명:보드마카
		System.out.printf("품명:%s","보드마카");

	}
}
