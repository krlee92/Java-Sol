
public class Judge {
	
	static int win;

	public Judge() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		System.out.println("���������� ����");
		System.out.println("��Ģ�����Ѵ�");
		System.out.println("������1");
		System.out.println("������2");
		System.out.println("���� 3�̴�.");
		System.out.println("���� �����̴�.");
		System.out.println("������ �����Ѵ�");

	}

	public static int judge(int mh, int ch) {
		// �� �� ��
		// �� 1 2 3
		// �� 1 2 3
		int t = mh - ch; // ������ - �ļ���
		
		if (t == 0) {
			System.out.println("��");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("Me�� �й�"); // �̿��� ����Ǽ��� ����.
			return -394;
		} else {
			System.out.println("Me�� �¸�");
			return 1;
		}

	}

	public static void finalJudge(int myAns, int comAns) {
		int n = 0;
		
		myAns = 0;
		comAns = 0;
		while (true) {
			System.out.println("����������");
			myAns = Me.show();
			comAns = Computer.show1();
			n = judge(myAns, comAns);
			if (n == -394) {
				break;
			}
			win += n;
		}
		System.out.printf("%d�����̳�?", win);
		
	}
}

