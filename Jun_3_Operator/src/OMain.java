import java.util.Scanner;
//������(Operator)
//���Կ�����  = : ���׿� �ִ°Ÿ� ���׿� �־�� 
//			(x == y) : xy�� ����.  
//��� ������ �� ���� �ʰ� ��
//��������� = - x * / %  => ����� ū������ ����
// + : String ���̱� - ���� String�� +��Ű�� =>String���� ����ȯ
// / : �ڷ��� üũ
// ���������� 
//	+= -= *= /= %= ���Կ�����+���������
//	++ -- (** // ����)
//10 + 101 => int + long => long
//% - ���� ������

public class OMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("x:");
		int x = keyboard.nextInt();
		System.out.print("y:");
		int y = keyboard.nextInt();
		System.out.println("---------------------------");
		System.out.printf("x��%d, y��%d\n", x, y);
		
		int hab = x + y;
		int cha = x - y;
		int gob = x * y;
		int moks= x / y;
		int t = x % y; //���� ������
		System.out.printf("x + y = %d\n", hab);
		System.out.printf("x - y = %d\n", cha);
		System.out.printf("x * y = %d\n", gob);
		System.out.printf("x / y = %d\n", moks);
		System.out.printf("x %% y = %d\n", t);
		
		//����ȯ(type casting) : �������� �ڷ����� �ٲٴ°�
		//������ �ڷ����� �´°͸� ���� �� ����
		//(�ڷ���)��
		// �ڹٰ� �Ǵ��ؼ� �����ڵ�����ȯ�ص� ������ ���� ������  �ڵ����� ����ȯ
		long l = 1234; // long�� int �־ �������.
		double f = 123.123;
		int i = (int) 1234l;
//		� �����͵� + String => String (+�����ڸ� ����ȯ�� Ȱ��)
//		int -> String
		int ii = 10;
		String ss = ii + ""; //= String
		double dd = 123.123123;
		String sss = dd + "w";
		System.out.println(sss);
		
		System.out.println(1+1);
		System.out.println(1+"1");
		System.out.println("1"+"1");
		System.out.println((1+1)+"1");
		System.out.println(1+(1+"1"));
		
		//int / int => int
		//int / double => double
		
		double iii = x / (double)y;
		System.out.println(iii);
		
		x += 3; //x = x + 3; 
		System.out.println(x);
		
		y *= 5; // y= y * 5;
		System.out.println(y);
		
		x++; //x += 1; //x = x + 1; �´� ����.�ϳ� �ø���.

	}

}
