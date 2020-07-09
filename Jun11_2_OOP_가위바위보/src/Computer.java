import java.util.Random;
import java.util.Scanner;

public class Computer {
	
	static int comHand;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public static int show1() {
		int a = new Random().nextInt(3) + 1;
		if (a == 1) {
			System.out.println("컴 : 가위");
		} else if (a == 2) {
			System.out.println("컴 : 바위");
		} else {
			System.out.println("컴 : 보");
		}
		return a;
	}
	
	

}
