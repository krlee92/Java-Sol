import java.util.Scanner;
//swich case ���ǹ�.
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

//	��ġ���� = 8
//	����� = 4
//	�Ʒ�	 = 2
//  ��		 = 1

// a �� 10�̸� ��
// a �� 20�̸� �� ���
// �Ϲ������δ� if�� ����Ѵ�.

// swich case ���ǹ�
//		���ǽ� �Ұ� case a > 10
//		break ���������� ��� �����Ѵ�.
//		���Ѽ��� �� �� ����Ѵ� : switch - case


public class CSMain {
	public static void main(String[] args) {
		
		

		Scanner k = new Scanner(System.in);
		System.out.println("���ΰ�� :");
		String level = k.next();
		System.out.println("--------------");
		System.out.println(level);
		
		
		// ����� �̺��̸鼭 �Ϻ��ϼ� �ֳ�?
		// �ƴϹǷ� else if, ������ ���� �ܵ�if
		// ���ÿ� �˻縦 �ؾ� : if�и�
		// ���ð˻� x �Ϲ��� : else if Ȱ��
		if (level.contentEquals("�̺�")) {
			System.out.println("��ġ����");
			System.out.println("�����");
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (level.equals("�Ϻ�")) {
			System.out.println("�����");
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (level.equals("��")) {
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (level.equals("����")) {
			System.out.println("��");
		}
		
//		�Ϻ��ΰ�� �Ϻ����ͽ����ϱ⶧���� ����� �Ʒ� ��
		switch (level) {
		case "�̺�":
			System.out.println("��ġ����");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		case "����":
			System.out.println("��");
//
//		default:
//			break;
		}
		
// DBA(dmin)
//		��������
//		���/����
//		������ �ٷ��
//		���� Ȱ��
// DBP(rogrammer)
//		������ �ٷ��
//		���� Ȱ��
// DBU(ser)
//		���� Ȱ��		
		
		
		String role = "DBP";
		switch (role) {
		case "DBA": //������ ���� ���� ����� ���ʿ�
			System.out.println("��������");
			System.out.println("���/����");
		case "DBP":
			System.out.println("������ �ٷ��");
		case "DBU":
			System.out.println("���� Ȱ��");
		default:
			break;
		}
		
//		==================
		int a = 10;

		switch (a) {
		case 10:
			System.out.println("��");
			break;
		case 20:
			System.out.println("��");
			break;

		default: // else������ 10���ƴϰ� 20���ƴҶ�
			System.out.println("?");
			break;
		}
		
	}
}
