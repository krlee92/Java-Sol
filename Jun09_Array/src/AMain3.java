// Call by Value, Call by Reference
// ������ ������ Ư¡
public class AMain3 {
	public static void test(int a, int[] b) {
		System.out.println(a);
		System.out.println(b[0]);
		a = 20;
		b[0] = 20; // >> �������� �����͸� �ٲٴ� ��
		System.out.println(a);
		System.out.println(b[0]); 
		System.out.println("----------");
	}
	public static void main(String[] args) {
		int a = 10; // �⺻��
		int[] b = {10,20}; // �迭�� ������ ������
		test(a, b);
		System.out.println(a); // �⺻�� �����Ͱ� �Լ� �ȿ��� �ٲ�����Ƿ� ���ο��� �ݿ� x
		System.out.println(b[0]); // �Լ��ȿ��� ������ �����Ͱ� �ٲ�����Ƿ�, �ٲ� ������ �ݿ���.
		
	}

}
