import javax.swing.Spring;

//JVM�� ����
public class PrintMain { // ���������� �ʿ�
	public static void main(String[] args) {
		// ��� �ڹ� �ڵ�� �����
		System.out.println("w"); // �ܼ�â�� ���� ���+����
//		w : �ڹٹ��� "w" :���� ������
		System.out.println("wwwwwww");
		System.out.print("lol");
		System.out.print("cool"); // ln������ ������Ѵ�
		System.out.println();
		System.out.println("---------");
		System.out.println("�̸� :\tȫ�浿");
		System.out.println("Ű :\t180");
		System.out.println("������:\t80");
		// �ٸ���
		// \t : ��Ű \n :new line��(��)�ٲ�
		// ��Ű: �� ����Ʈ�� �־ ����Ʈ���� �̵�
		// \r : carrage return
		// \r\n : �ٹٲٱ� �ϼ�����
		// \b : backspace 1byte�����
		// C��� : �ѱ��ڰ� 1byte
		// JAVA : �ѱ��ڰ� 2byte
		// \" : �������
		// ����:"����" ���
		System.out.println("���� :\"����\""); 
		// C:\program Files ���
		System.out.println("C:\\Program Files"); 
		
		// ������� ���� printf

		// printf %d: ����������(�Ҽ������°�) ���� �ڸ�. decimal
		// �ڸ� ��ȣ : 2
		System.out.printf("��ȣ : %d��\n", 2);
		// %05d : 5�ڸ���
		System.out.printf("��ȣ : %03d��\n", 2);
		//printf %f :�Ǽ�������(�Ҽ���) ���� �ڸ� float
		//%.3f:�Ҽ��� �ڸ���
		System.out.printf("�÷� :%.3f\n", 1.5);
		//���� : 60.12% = printf ����� %�� ��� :%% 
		System.out.printf("���� : %.2f%%\n", 60.123456);
		System.out.println("%");
		// %s: ���� ������ ���� �ڸ� : string(���ڿ�)
		//ǰ��:���帶ī
		System.out.printf("ǰ��:%s","���帶ī");

	}
}
