import java.util.Random;
import java.util.Scanner;

//UpDown����--------------
//��ǻ�Ͱ� 1 ~ 10000������ �����Ѱ� �̾Ƴ���
//------------------------------------------
//�� : 5000
//up
//------------------------------------------
//�� : 8000
//down
//------------------------------------------
//...
//�� : 7500
//5������ ����
public class UpDown {
	
	//�� �ޱ�
		public static int getAns() {
			System.out.println("��:");
			int myAns = new Scanner(System.in).nextInt();
//			Scanner k = new Scanner(System.in);
//			int myAns = k.nextInt();
			return (myAns < 0 && myAns > 10001) ? getAns() : myAns;
//			return myAns;
		}
		//��ǻ�� ���� ����
		public static int comAns() {
			int ans = new Random().nextInt(9999)+1;
			System.out.println(ans);
			return ans;
		}
		
		// ���ٿ� ����
		public static int judge(int myAns, int com) {
			
			if (myAns == com) {
				System.out.println("����");
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
		System.out.printf("%d��", count);
	
		
	}

}
