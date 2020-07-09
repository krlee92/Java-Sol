
public class Judge {
	
	static int win;

	public Judge() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		System.out.println("가위바위보 시작");
		System.out.println("규칙설명한다");
		System.out.println("가위는1");
		System.out.println("바위는2");
		System.out.println("보는 3이다.");
		System.out.println("형이 심판이다.");
		System.out.println("판정도 형이한다");

	}

	public static int judge(int mh, int ch) {
		// 가 바 보
		// 나 1 2 3
		// 컴 1 2 3
		int t = mh - ch; // 내숫자 - 컴숫자
		
		if (t == 0) {
			System.out.println("무");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("Me의 패배"); // 이외의 경우의수가 없다.
			return -394;
		} else {
			System.out.println("Me의 승리");
			return 1;
		}

	}

	public static void finalJudge(int myAns, int comAns) {
		int n = 0;
		
		myAns = 0;
		comAns = 0;
		while (true) {
			System.out.println("가위바위보");
			myAns = Me.show();
			comAns = Computer.show1();
			n = judge(myAns, comAns);
			if (n == -394) {
				break;
			}
			win += n;
		}
		System.out.printf("%d연승이네?", win);
		
	}
}

