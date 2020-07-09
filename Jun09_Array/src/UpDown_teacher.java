import java.util.Random;
import java.util.Scanner;

public class UpDown_teacher {
	public static int think() {
		return new Random().nextInt(10000) + 1;
	}

	public static int guess() {
		System.out.print("뭐 : ");
		int myAns = new Scanner(System.in).nextInt();
		return (myAns >= 1 && myAns <= 10000) ? myAns : guess();
	}

	public static String judge(int myAns, int gameAns) {
		if (myAns == gameAns) {
			return "정답";
		} else if (myAns > gameAns) {
			return "작아";
		}
		return "커";
	}

	public static void main(String[] args) {
		int gameAns = think();
		System.out.println(gameAns);
		int myAns = 0;
		int turn = 0; // 반복횟수
		String result = null;
		for (turn = 1; true; turn++) { // for + while
//		while (true) {
//			turn++;
			myAns = guess();
			result = judge(myAns, gameAns);
			System.out.println(result);
			if(result.equals("정답")) {
				break;
			}
		}
		System.out.println(turn);
	}
}
