import java.util.Scanner;

//JVM�� ������ ���κ��� �����Ѵ�.(�����ư)
//�Լ��� �⺻���� public static ����Ÿ�� �Լ���(�Ķ����){

public class FMain3 {
	public static String getName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�̸�  : ");
		String name = keyboard.next();
		return name;
	}

	public static double getTall() { // �̸��� tallGet ���� �������� ���Ľ� getName�� ���� ��ġ�ϱ⶧���� �� ����.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ű:");
		double tall = keyboard.nextDouble();
		return tall;
	}

	public static double getWeight() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("������:");
		double weight = keyboard.nextDouble();
		return weight;
	}

	public static double calculateStWeight(double tall) {
		double stdweight = (tall - 100) * 0.9;
		return stdweight;
	}

	public static double calculateBimando(double weight, double stdweight) {
		double bimando = (weight / stdweight) * 100;
		return bimando;
	}
	
	public static String calculateResult(double bimando) {
		String result = (bimando > 120) ? "��" : "����";
		return result;
	}
	
	public static void printResult(double stdW, double bmd, String n, String r) {
		System.out.printf("ǥ��ü��:%.1fkg\n", stdW);
		System.out.printf("�񸸵�:%.1f%%\n", bmd);
		System.out.printf("%s���� %s\n", n, r);
	}

	public static void main(String[] args) {
		String name = getName(); //name �̶�� ������ getName�Լ� ���� �����Ѵ�. ���� ���� printResult ���� name���� ����Ѵ�.
		double tall = getTall(); //tall�̶�� ������ getTall�Լ� ���� �����Ѵ�.
		double weight = getWeight(); // weight��� ������ getWeight��� �Լ����� �����Ѵ�.
		System.out.println("---------");
		double stdWeight = calculateStWeight(tall); 
		double bimando = calculateBimando(weight, stdWeight);
		String result = calculateResult(bimando);
		printResult(stdWeight, bimando, name, result);
		
		

	}

}
