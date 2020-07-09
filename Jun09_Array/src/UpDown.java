import java.util.Random;
import java.util.Scanner;

//UpDown게임--------------
//컴퓨터가 1 ~ 10000사이의 랜덤한거 뽑아놓고
//------------------------------------------
//뭐 : 5000
//up
//------------------------------------------
//뭐 : 8000
//down
//------------------------------------------
//...
//뭐 : 7500
//5번만에 정답
public class UpDown {
	
	//값 받기
		public static int getAns() {
			System.out.println("뭐:");
			int myAns = new Scanner(System.in).nextInt();
//			Scanner k = new Scanner(System.in);
//			int myAns = k.nextInt();
			return (myAns < 0 && myAns > 10001) ? getAns() : myAns;
//			return myAns;
		}
		//컴퓨터 랜덤 추출
		public static int comAns() {
			int ans = new Random().nextInt(9999)+1;
			System.out.println(ans);
			return ans;
		}
		
		// 업다운 판정
		public static int judge(int myAns, int com) {
			
			if (myAns == com) {
				System.out.println("정답");
				return 500;
			} else if (myAns < com) {
				System.out.println("up");
				return 1;
			} else {
				System.out.println("down");
				return 1;
			}
			
		}
	
	public static void main(String[] args) {
		
		int myAns = 0;
		int comAns = comAns();
		
		int n = 0;
		int count = 1;
		while (true) {
			myAns = getAns();
			n = judge(myAns, comAns);
				if (n == 500) {
					break;
				}
				count += n;

		}
		System.out.printf("%d턴", count);
	
		
	}

}
