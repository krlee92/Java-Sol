//������ : stack ���
//String�� heap ����. 
//String�� heap ����. equals ���.

//�������� : �����  true/false
//	>	(�ʰ�)
//	>=	(�̻�)
//	==	(����)
//	!=	(�ٸ���)
//	<=	(����)
//	<	(�̸�)

//�����տ����� *!�߿�!* ȿ������ ���� ¥��.
//	&&(�˻�Ƚ�� 2��), &(�˻�Ƚ��1��)	(~�� and)
//	||(�˻�Ƚ�� 2��), |(�˻�Ƚ�� 1��)	(~�ų� or)
//	^	(Exclusive OR ���� �ٸ��� true = XOR)
//	!	(����� �����´� =not : true-> false false -> true)

//	XOR ��
//	O O -> X
//	O X -> O
//	X O -> O
//	X X -> X

//���� &&(and)�� Ȯ�� ������ ������ ��ġ.
//���� ||: Ȯ�� ������ ������ ��ġ.
import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("�̸�:");
		String name = keyboard.next();
		System.out.print("Ű:");
		double tall = keyboard.nextInt();
		System.out.print("����:");
		int age = keyboard.nextInt();

//		System.out.println("--------------------------");
//		System.out.printf("�̸� :%s\n", name);
//		System.out.printf("Ű :%.3f\n", tall);
//		System.out.printf("���� :%d\n", age);
		System.out.printf("%s, %.3f, %d,", name, tall, age);

		// Ű�� 150������ Ÿ��
		boolean b1 = tall > 150;
		System.out.println(b1);

		// ���� 10������� Ż���ְ�.
		boolean b2 = (age <= 10);
		System.out.println(b2);
		// ���̰� 10���̸� Ÿ��
		boolean b3 = (age == 10);
		System.out.println(b3);
		// Ű�� 180�� �ƴϸ� Ÿ��

		boolean b4 = (tall != 180);
		System.out.println(b4);

		// �̸��� ȫ�浿�̸� Ÿ��
		// boolean b5 = name == "ȫ�浿"; #1 == "ȫ�浿"
		boolean b5 = name.equals("ȫ�浿"); // ���� ���� ��
		System.out.println(b5);
		// String�� heap ����. equals ���.

		// Ű�� 150�̻��̰�, ���̵� 5�� �Ѿ�� Ż���ִ�.

		boolean b6 = (tall >= 150) && (age > 5);
		System.out.println(b6);
		
		//Ű�� 150 �Ѱų�, ���̰� 2�� ������ Ż���ִ�.
		boolean b7 = (tall > 150) || (age > 2);
		System.out.println(b7);
		
		// ���̰� 2�� �Ѱ�(�׷� ����� ���� Ȯ�� ����), Ű�� 200 ������ Ż���ִ�(�̷� ����� ���� Ȯ�� �۴�)
		// !!�߿�!! &&(and) a and b => a�˻��� ���� �����ϸ� b�� �˻��ϱ� ������ Ȯ�� �������� �տ� ��ġ�ϸ� �˻縦 1���ϰ� ����. ȿ����
		// ���� &&(and)�� Ȯ�� ������ ������ ��ġ.
		boolean b8 = (tall > 200) && (age > 2); //=��ȿ��(�˻�1��) (age > 2) &&(tall > 200) =�˻�2��
		System.out.println(b8);
		
		//Ű�� 210 �Ѱų� ���̰� 3�� ������ Ż���ִ� => Ű��210�Ѵ´�(Ȯ������) ���̰�3��Ѵ´�(Ȯ������)
		// ||(or) a b �����ϳ��� �����ϸ�true a or b =>a���� �����ϸ�  b�� �˻����.
		// ���� ||(or): Ȯ�� ������ ������ ��ġ.
		boolean b9 = (tall > 210) || (age > 3);//�˻�Ƚ�� 2��  (age > 3) || (tall > 210) �˻�Ƚ�� 1��
		System.out.println(b9);
		
		//Ű�� 100 �Ѱ�, Ű�� 150 ������ Ż���ְ�
		boolean b10 = (tall >150);
		System.out.println(b10);
		
		
		//���̰� 2�� �Ѱų�, ���̰� 5�� ������ Ż���ְ�
		boolean b11 = (age > 2);
		System.out.println(b11);
		
		//���̰� 3�� �ѵ���, Ű�� 100 �ѵ��� �ϳ��� ����(�Ѵٸ����ϸ� false)
		// 4  150 -> x  4 80 -> o 
		boolean b12 = (age > 3) ^ (tall > 100);
		
		// b12�� �ݴ�
		boolean b13 = !b12;
		System.out.println(b13);
		

	}

}
