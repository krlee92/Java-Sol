import java.util.Scanner;

// �񸸵� �˻� 2��

// �̸�	:
// Ű		:
// ������	:
//-------------------
//BMI : 	�Ҽ��� ���ڸ�����, BMI= ������/Ű*Ű(Ű�� ������ �����̴�)
//xxx���� yyy��
//�ƹ��ų� �Է��ϸ� ����˴ϴ�
//�������ϱ���

//�̻��� ������ ������ �ش��ϴ� ������ ���������� ���ѹݺ�

//�� �� : 40 �̻�
//�ߵ �� (2�ܰ� ��) : 35 - 39.9
//�浵 �� (1�ܰ� ��) : 30 - 34.9
//��ü�� : 25 - 29.9
//���� : 18.5 - 22.9
//��ü�� : 18.5 �̸�

//// ���
// public static double calcBMI(double height, double weight) {
//	 double bmi = weight / (height * height);
//	 return bmi;
// }
// // ���+���
// public static double calcBMI(double height, double weight) {
//	 double bmi = weight / (height * height);
//	 System.out.println("");
//	 return bmi;
 
 

public class CSMain3 {
	public static String getName() { // main�� �� �����ھƵ� ���������� �Լ��� ����������
		// ����ϴϱ�, ���߿� ã�� ���ϴϱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�̸�	: ");
		String name = keyboard.next();
		return name;
	}

	public static Double getTall() { // ����ϴϱ�, ���߿� ã�� ���ϴϱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ű(cm)	: ");
		double tall = keyboard.nextDouble();
		double ans = (tall > 250) ? getTall() : tall; // Ű�� 250 �ѰԾ��� �ٽ� Ű�� �Է��ϰ� �ϱ�.
		ans /= 100; //bmi�� ���ʹ����̹Ƿ� cm�ι��� �����Ͱ��� ���ͷ� ��ȯ��Ű��
		return ans;
	}

	public static Double getWeight() { // ����ϴϱ�, ���߿� ã�� ���ϴϱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("������	: ");
		double weight = keyboard.nextDouble();
		double ans = (weight < 0) ? (weight * -1) : weight; // �����Ը� ������ ���� -1�� ���ؼ� ����� ���ֱ�.
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name = getName(); //name������ getName�Լ����� ����
		Double tall = getTall(); //tall������ getTall�Լ����� ����
		Double weight = getWeight(); //weight������ getWeight�Լ����� ����
		double bmi = (weight / (tall * tall));
		System.out.println("--------------------------");
		System.out.printf("BMI	:%.1f\n", bmi);
		System.out.print(name + "���� ");
		if (bmi >= 40) {
			System.out.println("���� �Դϴ�");
		} else if (bmi >= 35) {
			System.out.println("�ߵ �� �Դϴ�");
		} else if (bmi >= 30) {
			System.out.println("�浵 �� �Դϴ�");
		} else if (bmi >= 25) {
			System.out.println("��ü�� �Դϴ�");
		} else if (bmi >= 18.5) {
			System.out.println("����ü�� �Դϴ�");
		} else {
			System.out.println("��ü�� �Դϴ�");
		}
		System.out.print("�ƹ��ų� �Է��ϸ� ����˴ϴ�");
		keyboard.next();

	}

}
