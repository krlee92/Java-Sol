import java.util.Scanner;
//swich case 조건문.
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

//	눈치보기 = 8
//	관등성명 = 4
//	훈련	 = 2
//  잠		 = 1

// a 가 10이면 ㅋ
// a 가 20이면 ㅎ 출력
// 일반적으로는 if문 사용한다.

// swich case 조건문
//		조건식 불가 case a > 10
//		break 만날때까지 계속 진행한다.
//		권한설정 할 때 사용한다 : switch - case


public class CSMain {
	public static void main(String[] args) {
		
		

		Scanner k = new Scanner(System.in);
		System.out.println("군인계급 :");
		String level = k.next();
		System.out.println("--------------");
		System.out.println(level);
		
		
		// 계급이 이병이면서 일병일수 있나?
		// 아니므로 else if, 맞으면 따로 단독if
		// 동시에 검사를 해야 : if분리
		// 동시검사 x 일반적 : else if 활용
		if (level.contentEquals("이병")) {
			System.out.println("눈치보기");
			System.out.println("관등성명");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (level.equals("일병")) {
			System.out.println("관등성명");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (level.equals("상병")) {
			System.out.println("훈련");
			System.out.println("잠");
		} else if (level.equals("병장")) {
			System.out.println("잠");
		}
		
//		일병인경우 일병부터시작하기때문에 관등성명 훈련 잠
		switch (level) {
		case "이병":
			System.out.println("눈치보기");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
//
//		default:
//			break;
		}
		
// DBA(dmin)
//		전원관리
//		백업/복구
//		데이터 다루기
//		서비스 활용
// DBP(rogrammer)
//		데이터 다루기
//		서비스 활용
// DBU(ser)
//		서비스 활용		
		
		
		String role = "DBP";
		switch (role) {
		case "DBA": //할일이 제일 많은 사람을 위쪽에
			System.out.println("전원관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("데이터 다루기");
		case "DBU":
			System.out.println("서비스 활용");
		default:
			break;
		}
		
//		==================
		int a = 10;

		switch (a) {
		case 10:
			System.out.println("ㅋ");
			break;
		case 20:
			System.out.println("ㅎ");
			break;

		default: // else같은것 10도아니고 20도아닐때
			System.out.println("?");
			break;
		}
		
	}
}
