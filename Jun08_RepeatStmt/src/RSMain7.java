import java.util.Scanner;

public class RSMain7 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
//				break;		// �ݺ� ��
				continue;	// �� ����(�̰�� i=Ȧ���Ͻ� if���Ǹ���, i����Ʈ ���ϰ� i=2�� �Ѿ��) 
			}
			System.out.println(i);
		}
//�̺�
//		��ġ����
//		�����
//		�Ʒ�
//		��
//�Ϻ�
//		�����
//		�Ʒ�
//		��
//��
//		�Ʒ�
//		��
//����
//		��
//����  :����ǰ�. ���ζ�� �������� �ݺ�
		

//		switch (level) {
//		case "�̺�":
//			System.out.println("��ġ����");
//		case "�Ϻ�":
//			System.out.println("�����");
//		case "��":
//			System.out.println("�Ʒ�");
//		case "����":
//			System.out.println("��");
//
//		default:
//			break;
//		}
		Scanner k = new Scanner(System.in);
		String g = null;
		h : while (true) { //(true) ������ �ݺ��ϴ°�
			System.out.print("��� :");
			g = k.next();
			System.out.println("-----------");
//			if (g.equals("����")) { //�ݺ���
//				break;
//			}
			
			switch (g) {
			case "����":
				break h;
			case "�̺�":
				System.out.println("��ġ����");
			case "�Ϻ�":
				System.out.println("�����");
			case "��":
				System.out.println("�Ʒ�");
			case "����":
				System.out.println("��");
//				break; - switch case �ݺ��� �����°�.
//			default: //��� ����
//				break;
		}
			
	}
		
		
	}
}
