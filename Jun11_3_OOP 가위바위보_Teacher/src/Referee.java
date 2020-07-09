
// ���������� ��ȸ
// A
//		����
// B
//		����
// C
//		����

public class Referee {

//	�̹� ���ӿ� ������ ������̶� �ǹ̷� ������ �ְڴ�
//	computer c; 
//	User u;

	// "" : String�� �ִ°� -> �޸𸮻��
	// null: String�� ���°� -> �޸� �̻��
	static final String[] RULEBOOK = { null/* "" */, "����", "����", "��" }; // 0���� �Ⱦ��ϱ� nulló��
	
							// ���� �����Ҷ� ��������
	public static void start(/* Computer c2, User u2 */) {
		
		
//		���� �����ϸ� �÷��̾�� �θ���
//		callblueCorner()�� ����� blueCorner��� ������ �����ض�
		Computer redCorner = callRedCorner();// ���� c3����
		User blueCorner = callBlueCorner(); // ������ u3����
		readRuleBook();
		int bluePaper = 0;
		int redPaper = 0;
		int result = 0;
		int win = 0;
		//�ݺ��� ��ġ�ڸ�
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
		//�ݺ��� ��ġ�ڸ�
	}
	
	public static void bye(int win) {
		System.out.printf("%d����", win);
	}
	
	//				�Ķ���� �ڸ��� ������� x(����� ������ ����������)
	public static void sayWhat(int bp, int rp) {
		System.out.printf("�� : %s\n", RULEBOOK[bp]);
		System.out.printf("�� : %s\n", RULEBOOK[rp]);
		
	}
	
	public static int judge(int bp, int rp) {
		sayWhat(bp, rp);
		int t = bp - rp;
		if(t == 0) {
			
			System.out.println("��");
			return 0;
		} else if (t == -1 || t == 2) {
			System.out.println("��");
			return 234;
		}
		System.out.println("��");
		return 1;
		
	}
	
	public static int fireBlueCorner(User u) {
		System.out.print("�� :");
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
		System.out.println("����������");
		for (int i = 1; i < RULEBOOK.length; i++) {
			System.out.printf("%d. %s\n", i, RULEBOOK[i]);
			
		}
	}

}
