import java.util.Scanner;

public class OMain4 {

	public static void main(String[] args) {

//		�񸸵� �˻�
//		�̸�	: xxx
//		Ű 	: yyy
//		������: zzz
//		-----------------
//		ǥ��ü��	:aa.akg		<=(Ű-100)�Ѱ� 90%
//		�񸸵�	:aa.a%		<=(������/ǥ��ü��)*100
//		xxx���� ~~~�Դϴ�	<=�񸸵� 120������ ��, �ƴϸ� ����
		
		Scanner keyboard = new Scanner(System.in);
			//JVM�� ���⸸ ����
			//������ Ű���� �Է� �����Ŵϱ� �غ�
		
		//������ �� �� -> �޸� �䱸���� ����
		// �ٵ� ������ �Ⱦ��� �ҽ� �������� ��������
		// ������ ��ǻ�Ͱ� ���Ƽ� -> ������ ����...

		System.out.print("�̸�  : ");
		String name = keyboard.next();
		System.out.print("Ű:");
		double tall = keyboard.nextDouble();
		System.out.print("������:");
		double weight = keyboard.nextDouble();
		System.out.println("--------------------------");
		double stdweight = ((tall - 100) *0.9);
		double bimando = (weight / stdweight) *100;
		String result = (stdweight > 120) ? "���Դϴ�" : "����ü���Դϴ�"; //��������
		System.out.printf("ǥ��ü��:%.1fkg\n", stdweight);
		System.out.printf("�񸸵�:%.1f%%\n", bimando);
		System.out.printf("%s���� %s\n", name, result);
		
		System.out.print("�ƹ��ų� �Է��ϸ� ����˴ϴ�");
		keyboard.next();
		
		//�Ϲ��ε��� �����ϱ� ���ϰ� �������� ������ֱ�
		//Runnable JAR File�� export
		//JAR = Java Archive(�ڹ� ��������)
		
//�ѱ��� -> -���� -> Java -������-> ����   -����->		
//				.Java		.class
//					�����ϵ� �ҽ�(������¸�) �����س�����
//					.jar������ ��ɾ �Է��ؼ� �����ؾ� ->??
//					 ������ ��ɾ ���� �̸� ���ֱ�
//					�޸��� :�����ɾ� : java -jar ���ϸ�
//					������� �������� jar������ �ִ°��� ���� :�����̸�.bat�� ����
//					bat���� ����
		
		
		
		//ctrl + f11 : ����
		//f11 : �����(debug) -> ������
		//�ܼ�â �����ϱ� - ����ư xx��ư
		
	
		
	}

}
