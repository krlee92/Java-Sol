
public class FMain2 {

	public static int test(int x) { // void�� �ƴϰ� ���� ������ return
		int a = 20;
		System.out.println(a);
		System.out.println(x); // ������ ����  a=10��
		int b = a + x;
		return b; // �� �Լ��� ȣ���� ������ b�� �����ֱ�, �Լ� ��
		// return�� �Լ� ���̹Ƿ� �׵ڿ� �ƹ��͵� ����
				
		
	}
	
	//���� 2���� ������ �� ���� ����ϴ� �Լ�
	
	public static void printSum(int a, int b) {
		System.out.println(a + b);
		
	}
	
	//���� 2���� ������ ������ ���ϴ� �Լ� :�ؼ� ���ؾߵ�, ���� �ٸ�
	public static int getSum(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	//���� 2���� ������ �� �߿� �� ū ���ڸ� ã�Ƽ� 
	//�ű⿡ *1000�� ���� ���ϴ� �Լ�
	public static int getBigger1000(int a, int b) {
		int bigger = (a > b) ? a: b;
		int bigger1000 = bigger * 1000;
		return bigger1000;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//3, 1�߿� �� ū ���ڸ�ŭ ��ٷȴٰ� 
		int q2 = getBigger1000(3, 1);
		Thread.sleep(q2);
		
		//5, 7�߿� �� ū ���ڿ� *1000�Ȱ� ���
		int q1 = getBigger1000(5, 7);
		System.out.println(q1*1000);
			
		
		
		
		int hab = getSum(3000, 1000);
		Thread.sleep(hab); // �ڵ� ���߱�(1000���� 1�� ����)
		
		printSum(20,30);
		
		
		
		System.out.println("-------------");
		int a = 10;
		int b = test(a);
		System.out.println(b);

	}

}
