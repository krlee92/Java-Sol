import java.util.Random;
import java.util.Scanner;

// �ݺ���
//		�ݺ�Ƚ���� ��Ȯ : for(10���ݺ�)
//		�ݺ������� ��Ȯ : while, do-while(���Ͼ�ħ����)
//			while���� �˻縦 ���� �ϰ�(�ѹ��� �ݺ��� �� �ɼ��� �ִ�)
//			do-while���� �ϴ� �ݺ��ൿ�� �ϰ� �˻��Ѵ�(�ѹ��� �ݺ��� �����)
//			do-while �� �Ⱦ���

//		�ݺ����� ����Ҹ��Ѱ� break; continue;

public class RSMain4 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ....... + 50 = ?
		int c = 0;
		for (int i = 1; i <= 50; i++) {
			c += i;
			
		}
		System.out.println(c);
		System.out.println("-----------");
		
		// 1 + 2 + 3 + .... ? >= 1000
		// ? �ּҰ� --> �ݺ������� ��Ȯ
//		while���� if���� �ݺ�����
//		while(�ݺ��� ���ߴ� ����){
//			���Ǿȸ�����
//			�ݺ�
//	    }
		
		int b = 0;
		int i = 0;
		while (b < 1000) {
			i++;
			b += i;
		}
		System.out.println(i);
		System.out.println(b);
		System.out.println("---------------");
		// 0 ~ 100������ ������ ���� ���
		// 35 ������ �׸�
//		Random r = new Random();
//		int i = r.nextInt(11); // 0~10������.
		
		Random r = new Random();
		int d = r.nextInt(101);
		while (d !=35) {
			System.out.println(d);
			d = r.nextInt(101); // �ٽ� ���ڸ� �̾ƾ� ���ѷ��� �Ұ�. �̰� ������ �ȴ�
		}
		System.out.println(d);
		System.out.println("-----------");
		
		// ����� ���̸� ����ؼ� �Է¹���
		// -1���� �׸�
		Scanner k = new Scanner(System.in);
		System.out.println("���� :");
		int age = k.nextInt();
		while (age != -1) {
			System.out.println("�ȳ�");
			System.out.println("���� :");
			age = k.nextInt(); //���̸� �ٽ� �Է¹޾ƾ���. �ƴϸ� ó�� �Է°��� ���ѷ�����.
		}
		System.out.println("---------");
		// ����� Ű�� ����ؼ� �Է¹���
		// -1���� �׸�
		
//		do - while��
//		do { �ݺ��� �ൿ
//			
//		} while (�ݺ����ߴ�����);
//		
		System.out.println("Ű :");
		int height = k.nextInt();
		do {
			System.out.println("������");
			System.out.println("Ű :");
			height = k.nextInt();
		} while (height != -1);

		
		
		// 0~5���� �����̰� �����ϳ��Ἥ �װ� ������
		// ���� ������� �𸣴� while
		
		Random z = new Random();
		int u = 0; //�ѹ� u��� ������ �����ϸ�, �� �ڷδ� u������ ���Ѵ�(�ϸ鿡��)
		u = z.nextInt(6);
		// 0 ~ 5���� ���� �̰�
		System.out.println("�� :");
		int select = k.nextInt();
		System.out.printf("�� : %d\n", u);
		// ���� �ϳ� �Ἥ �װ� ������
		while (u != select) {
			System.out.println("��");
			System.out.println("�� :");
			u = z.nextInt(6);
			select = k.nextInt();
			System.out.printf("�� : %d\n", u);
			// ���� ���ö�����
		}

		
	}
}
