import java.util.Scanner;

public class �񸸵��˻� {
	public static String getName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�̸�:");
		String name = keyboard.next();
		return name;
	}
	public static double getTall() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ű:");
		double height = keyboard.nextDouble();
		double ans = (height > 250) ? getTall() : height;
		ans /= 100;
		return ans;
	}
	public static double getWeight() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("������:");
		double weight = keyboard.nextDouble();
		double ans = (0 > weight) ? weight * -1 : weight;
		return ans;

	}
	
	
	
	public static void main(String[] args) {
		String name = getName();
		double tall = getTall();
		double weight = getWeight();
		System.out.println("----------");
		double bmi = weight / (tall * tall);
		System.out.printf("BMI :%.1f\n" , bmi);
		System.out.println(name +"���¿� ");
		
		if (bmi >= 40) {
			System.out.println("���� �Դϴ�");
		} else if (bmi > 35) {
			System.out.println("�ߵ �� �Դϴ�");
		} else if (bmi > 30) {
			System.out.println("�浵 �� �Դϴ�");
		} else if (bmi > 25) {
			System.out.println("��ü�� �Դϴ�");
		} else if (bmi > 18.5) {
			System.out.println("����ü�� �Դϴ�");
		} else {
			System.out.println("��ü�� �Դϴ�");
		} 
		
		
	}

}
//�񸸵� �˻� 2��

//�̸�	:
//Ű		:
//������	:
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