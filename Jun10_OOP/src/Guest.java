import java.util.Scanner;

public class Guest {
	
	// ������� : Ŭ������ �Ӽ� : �ڱ�Ұ��Ҷ� ����Ҹ��Ѱ�
	String name;
	double height;
	double weight;
	Scanner mouth = new Scanner(System.in);
	double bmi;
	String status;
	
	// �޼ҵ� : �׼�
	// return�� �ѹ��� �ϳ����� �����ϹǷ� 3�� ��丸��.
	public String tellName() {
		System.out.println("�̸� : ");
		String name = mouth.next();
		return name;
	}
	public double tellHeight() {
		System.out.println("Ű : ");
		double height = mouth.nextDouble();
		return height;
	}
	public double tellWeight() {
		System.out.println("������ : ");
		double weight = mouth.nextDouble();
		return weight;
	}

}
