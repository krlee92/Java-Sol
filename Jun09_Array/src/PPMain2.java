import java.util.Random;
import java.util.Scanner;

// ����������
// ����������--------
//	1.����
//	2.����
//	3.��
//	------------
//	��:1
//	��:����
//	��:
//	��
//	----------
//	��:2
//	��:����
//	��:
//	��
//	--------------�� ������
//	3����(����Ƚ��)

public class PPMain2 {
	
	//�� �ޱ�
	public static int getAns() {
		System.out.println("��:");
		Scanner k = new Scanner(System.in);
		int ans = k.nextInt();
		return ans;
	}
	// ������ ���ڸ� ������������ ��ȯ
	public static String change(int a) {
		String ans = null;
		if (a == 1) {
			ans = "����";
		} else if (a == 2) {
			ans = "����";
		} else if (a == 3) {
			ans = "��";
		}
		return ans;
	}
	
	// ���� ����
//           ��  �� ��
		//��  1  2  3
		//��  1  2  3
	
	public static int judge(int myAns, int comAns) {
		int t = myAns - comAns;
		if (t == 0) {
			System.out.println("��");
			return 0;
		} else if(t == -1 || t == 2) {
			System.out.println("��"); //�̿��� ����Ǽ��� ����.
			return -394;
		} else {
			System.out.println("��");
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("����������-----");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.��");
		System.out.println("---------------");
		int myAns = getAns();
		System.out.println("��:" + myAns);
		Random z = new Random();
		int comAns = z.nextInt(3)+1;
		System.out.println("��:" +change(comAns));
		judge(myAns, comAns);
		
		
		
		for (int i = 0; i < 3; i++) {
			
		}
		
	}

}
