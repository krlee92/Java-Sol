
// 가위바위보 대회
// A
//		심판
// B
//		심판
// C
//		심판

public class Referee {

//	이번 게임에 입장한 사람들이란 의미로 쓸수는 있겠다
//	computer c; 
//	User u;

	// "" : String이 있는거 -> 메모리사용
	// null: String이 없는거 -> 메모리 미사용
	static final String[] RULEBOOK = { null/* "" */, "가위", "바위", "보" }; // 0번은 안쓰니까 null처리
	
							// 게임 시작할때 데려오기
	public static void start(/* Computer c2, User u2 */) {
		
		
//		게임 시작하면 플레이어들 부르기
//		callblueCorner()의 결과를 blueCorner라는 변수에 저장해라
		Computer redCorner = callRedCorner();// 컴팀 c3입장
		User blueCorner = callBlueCorner(); // 유저팀 u3입장
		readRuleBook();
		int bluePaper = 0;
		int redPaper = 0;
		int result = 0;
		int win = 0;
		//반복문 위치자리
		while (true) {
			bluePaper = fireBlueCorner(blueCorner);
			redPaper = fireRedCorner(redCorner);
			result = judge(bluePaper, redPaper);
			if (result == 234) {
				break;
			}
			win += result;
		}
		bye(win);
		//반복문 위치자리
	}
	
	public static void bye(int win) {
		System.out.printf("%d연승", win);
	}
	
	//				파라메터 자리에 멤버변수 x(룰북은 심판이 가지고있음)
	public static void sayWhat(int bp, int rp) {
		System.out.printf("너 : %s\n", RULEBOOK[bp]);
		System.out.printf("컴 : %s\n", RULEBOOK[rp]);
		
	}
	
	public static int judge(int bp, int rp) {
		sayWhat(bp, rp);
		int t = bp - rp;
		if(t == 0) {
			
			System.out.println("무");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("패");
			return 234;
		}
		System.out.println("승");
		return 1;
		
	}
	
	public static int fireBlueCorner(User u) {
		System.out.print("뭐 :");
		int paper = u.fire();
		if (paper < 1 || paper > 3) {
			return fireBlueCorner(u);
			
		}
		return paper;
	}
	
	public static int fireRedCorner(Computer c) {
		return c.fire();
		
	}

	public static Computer callRedCorner() {
		return new Computer();
	}

	public static User callBlueCorner() {
		return new User();
	}

	public static void readRuleBook() {
		System.out.println("가위바위보");
		for (int i = 1; i < RULEBOOK.length; i++) {
			System.out.printf("%d. %s\n", i, RULEBOOK[i]);
			
		}
	}

}
