import java.util.Scanner;

// ���α׷� : �Է¹ޱ�
public class VMain3 {
	// �ڵ��� �𵨸� ����
			//��� ����� ����
			//���ְ� ����� ����
			//ȭ�� ����ġ
			//�Һ� ���ҳ�
	public static void main(String[] args) {
		//�ܼ�â�� Ű���� �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in); //JDK1.5�߰�
		
		System.out.print("�𵨸� : ");
		
		// �ڵ��� �𵨸�
		String name = keyboard.next(); //�Է��� String ������ �ҷ�����
		
		System.out.print("��� :");
		String address = keyboard.next();
		System.out.print("���� :");
		int price = keyboard.nextInt(); //�Է��� int ������ �ҷ�����
		System.out.print("ȭ��:");
		double inch2 = keyboard.nextDouble(); //�Է��� double ������ �ҷ�����
		System.out.print("�Һ� ���ҳ�:");
		boolean loan = keyboard.nextBoolean(); //�Է��� boolean ������ �ҷ�����
		
		
		System.out.println("----------------------------------------------------------");
		System.out.printf("�� : %s\n", name);
		System.out.printf("%s���� ��\n", address);
		System.out.printf("%d�ְ� ��\n", price);
		System.out.printf("%.2f��ġ\n", inch2);
		System.out.printf("�Һ� ���ҳ� : ");
		System.out.println(loan);
		

			
	}

}
