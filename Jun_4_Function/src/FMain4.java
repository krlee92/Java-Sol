import java.util.Scanner; // Scanner ������ �ʿ��Ѱ�
//	�Լ��� �⺻���� public static ����Ÿ�� �Լ���(�Ķ����){
//	�Ķ���� : �Լ� ���࿡ �ʿ��� ���
//	��������(local variable) - �Լ� �ӿ��� ������� ����
//		�� �Լ� �����ϴ� ���� �ӽ÷� �ʿ��� ������(�� �Լ������� ���� ����)

import javax.swing.JFrame;

public class FMain4 {

	// "--------"�� ��� �̼�.
	// public static ����Ÿ�� �Լ���(�Ķ����){
	// ����Ÿ�� : �Լ��ӿ��� �� ����ؼ� �� ����� main���� ������
	// �Լ���
	// �Ķ���� : main���� �Լ��� ������(�Լ� �����ϴµ� �ʿ��� ���)
	// void : ����� main���� ���� �ƴϰ�, main���� �޾ƿ��°ŵ� ����,-----��� ���̶�.
	public static void printLine() {
		System.out.println("---------");
	}

	// ���̸� ������ ����� ������ "���"(=,����ΰ��̹Ƿ�void)�ϴ� �Լ�
//	����� ������ �Ǵ��Ϸ��� main�� age ������ �޾ƿ;� �Ѵ� =>main�� age�� �������� �������Ѵ�.
//	public static ???? ????(????){
	public static void printAdultOrChild(int a) {
		String what = (a > 20) ? "�" : "��";
		System.out.println(what);
	}
	
//	���̸� ������, {������(����-1�� �Ѵ�)*10}�� �����ִ� �Լ�
//	public static ???? ????(????){
//	�� ���̸� ���ϴ°��̱⶧���� ���ڴϱ� ����Ÿ���� int
	public static int getManAge10(int a) { // int a(�ٸ� ���ú����� ���ĵ� ���x)�̵� b�̵� c�̵�
		int manAge = (a - 1)*10;
		return manAge; //main���� manAge��� ������ �����ϱ�, return���� ������. return�� ������ ��������.
		
	}
	
	

	public static void main(String[] args) { // main�Լ�, JVM�� �����Լ��� �θ���.

		// ����:��xx �� ĥ�� �ְ� �ϴ� �̼�.
		Scanner keyboard = new Scanner(System.in); // keyboard �� Ű�����Է°��� ����Ǵ� �����̴�.
		System.out.print("����  : ");
		// �ܼ�â�� �Է��� ���ڸ� �޾ƿͼ�
//		age��� ������ ����.(���߿� ������)
		int age = keyboard.nextInt();
//		keyboard.netxInt(); => Ű���忡 �Է¹��� �غ� �Ѱ�. = �����Ѱ� �ƴϴ�!. age��� ������ ������ ����.
		printLine();
		
		printAdultOrChild(age); //main���� ������ ���� age�� ����Ͽ� printAdultOrChild�Լ����� age�� a�� ����ִ´�.
		
//		printAdultOrChild(a); (�� ������ ������ ������ ���������� �����ֱ⶧����)main�� a��� ������ ����.
//		printAdultOrChild(printAdultOrChild); �Լ��� �ƴϴ�.
		int ma = getManAge10(age); // �Լ��� �Ἥ ���� �� ma�� ����.
//		getManAge10(age); ���� ��������, �ڵ����� x
		
		JFrame jf = new JFrame("w");
		jf.setSize(ma, ma);
		jf.setVisible(true);
		
		
	}

}
