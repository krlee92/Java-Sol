import java.util.Scanner;

// Ư�� ���ǽÿ��� �۾�
// ���ǹ� -if��
// ���׿����� ex) String (������) = (����) ? "���Ǹ�����" : "�Ҹ�����"; 
//�ڹ��� ������ ����� �� �ȳ����� �ȵ�

public class CSMain {

	public static void main(String[] args) {
		// ���� :
		// ���� :
		// ���� :
		// -------------
		// ������� : <- �Ҽ��� ù��¥�� ������(��Ʋ��)
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� :");
		int kor = keyboard.nextInt();
		System.out.print("���� :");
		int eng = keyboard.nextInt();
		System.out.print("���� :");
		int mat = keyboard.nextInt();
		double av = (kor + eng + mat) / 3.0; // int / int => int�̹Ƿ�, int / double�� �ϴ���
		// 3.0���ϴ���, ó������ ������ int���� double�� �ϴ���, (double)3���� ����ȯ�� �Ѵ�.
		System.out.println("----------------");
		System.out.printf("������� :%.1f��\n", av);

		// ��������� 80�� ������ ���ߴ� ��� if(����){ �ߵ��Ұ�}
		// �ȵǸ� ���� ��� => if�� ��ȣ ������ �ڿ� else
		// 70�� �Ѱ�����(70 <= ���� <80) ��� �Ϸοͺ� ���
		if (av >= 80) {
			System.out.println("���ߴ�");

		} else {
			System.out.println("����");
			if (av >= 70) { // (av >= 70 && av < 80)�� Ʋ����. ���ʿ� else�����̹Ƿ� 80����.
				System.out.println("��� �Ϸοͺ�");
			}
		}
		/////////////////////////////////////////////
		// ���� >= 90 : ��
		// 80 <= ���� <90: ��
		// ..
		// ���� < 60 : ��
		// �ڹ��� ������ ����� �� �ȳ����� �ȵ�
		
		if (kor >= 90) {
			System.out.println("��"); // 90�̻�
		} else if (kor >= 80) { //�������ִٰ� ������ else if�� �ƴ϶�, if������ �ȵ����� ����å���� ��
			System.out.println("��"); // 90�� �ȵ����� 80�̻�
		} else if (kor >= 70) {
			System.out.println("��"); // 80�� �ȵ����� 70�̻�
		} else if (kor >= 60) {
			System.out.println("��"); // 70�� �ȵ����� 60�̻�
		} else {
			System.out.println("��");// ���� ���ǵ鿡 �ش� ����
		}

	}

}
