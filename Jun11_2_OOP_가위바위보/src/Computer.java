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
			System.out.println("�� : ����");
		} else if (a == 2) {
			System.out.println("�� : ����");
		} else {
			System.out.println("�� : ��");
		}
		return a;
	}
	
	

}
