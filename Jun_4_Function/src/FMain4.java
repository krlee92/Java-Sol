import java.util.Scanner; // Scanner 쓰려면 필요한거
//	함수의 기본형은 public static 리턴타입 함수명(파라메터){
//	파라메터 : 함수 실행에 필요한 재료
//	지역변수(local variable) - 함수 속에서 만들어진 변수
//		그 함수 실행하는 동안 임시로 필요한 데이터(그 함수에서만 쓰는 변수)

import javax.swing.JFrame;

public class FMain4 {

	// "--------"만 찍는 미션.
	// public static 리턴타입 함수명(파라메터){
	// 리턴타입 : 함수속에서 뭘 계산해서 그 결과를 main으로 보낼때
	// 함수명
	// 파라메터 : main에서 함수로 보낼때(함수 실행하는데 필요한 재료)
	// void : 결과가 main으로 갈거 아니고, main에서 받아오는거도 없고,-----찍고 끝이라서.
	public static void printLine() {
		System.out.println("---------");
	}

	// 나이를 넣으면 어른인지 애인지 "출력"(=,찍고끝인것이므로void)하는 함수
//	어른인지 애인지 판단하려면 main의 age 변수를 받아와야 한다 =>main의 age를 이쪽으로 보내야한다.
//	public static ???? ????(????){
	public static void printAdultOrChild(int a) {
		String what = (a > 20) ? "어른" : "애";
		System.out.println(what);
	}
	
//	나이를 넣으면, {만나이(나이-1로 한다)*10}를 구해주는 함수
//	public static ???? ????(????){
//	만 나이를 구하는것이기때문에 숫자니까 리턴타입은 int
	public static int getManAge10(int a) { // int a(다른 로컬변수랑 겹쳐도 상관x)이든 b이든 c이든
		int manAge = (a - 1)*10;
		return manAge; //main에서 manAge라는 변수를 못쓰니까, return으로 보낸다. return이 없으면 못보낸다.
		
	}
	
	

	public static void main(String[] args) { // main함수, JVM이 메인함수를 부른다.

		// 나이:에xx 만 칠수 있게 하는 미션.
		Scanner keyboard = new Scanner(System.in); // keyboard 는 키보드입력값이 저장되는 변수이다.
		System.out.print("나이  : ");
		// 콘솔창에 입력한 숫자를 받아와서
//		age라는 변수에 저장.(나중에 쓰려고)
		int age = keyboard.nextInt();
//		keyboard.netxInt(); => 키보드에 입력받을 준비를 한것. = 저장한건 아니다!. age라는 변수를 만들어야 저장.
		printLine();
		
		printAdultOrChild(age); //main에서 저장한 변수 age를 사용하여 printAdultOrChild함수에서 age를 a에 집어넣는다.
		
//		printAdultOrChild(a); (각 변수는 선언한 각각의 영역에서만 쓸수있기때문에)main에 a라는 변수가 없다.
//		printAdultOrChild(printAdultOrChild); 함수명 아니다.
		int ma = getManAge10(age); // 함수를 써서 구한 값 ma에 저장.
//		getManAge10(age); 값을 구했으나, 자동저장 x
		
		JFrame jf = new JFrame("w");
		jf.setSize(ma, ma);
		jf.setVisible(true);
		
		
	}

}
