import java.util.Random;
import java.util.Scanner;

// 가위바위보
// 가위바위보--------
//	1.가위
//	2.바위
//	3.보
//	------------
//	뭐:1
//	나:가위
//	컴:
//	승
//	----------
//	뭐:2
//	나:바위
//	컴:
//	무
//	--------------질 때까지
//	3연승(연승횟수)

public class PPMain2 {
	
	//값 받기
	public static int getAns() {
		System.out.println("뭐:");
		Scanner k = new Scanner(System.in);
		int ans = k.nextInt();
		return ans;
	}
	// 받은값 숫자를 가위바위보로 변환
	public static String change(int a) {
		String ans = null;
		if (a == 1) {
			ans = "가위";
		} else if (a == 2) {
			ans = "바위";
		} else if (a == 3) {
			ans = "보";
		}
		return ans;
	}
	
	// 승패 판정
//           가  바 보
		//나  1  2  3
		//컴  1  2  3
	
	public static int judge(int myAns, int comAns) {
		int t = myAns - comAns;
		if (t == 0) {
			System.out.println("무");
			return 0;
		} else if(t == -1 || t == 2) {
			System.out.println("패"); //이외의 경우의수가 없다.
			return -394;
		} else {
			System.out.println("승");
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("가위바위보-----");
		System.out.println("1.가위");
		System.out.println("2.바위");
		System.out.println("3.보");
		System.out.println("---------------");
		int myAns = getAns();
		System.out.println("나:" + myAns);
		Random z = new Random();
		int comAns = z.nextInt(3)+1;
		System.out.println("컴:" +change(comAns));
		judge(myAns, comAns);
		
		
		
		for (int i = 0; i < 3; i++) {
			
		}
		
	}

}
