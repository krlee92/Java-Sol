// �� �Ｚ��ǻ��
public class OMain3 {
	public static void main(String[] args) {
		// CPU�� i7-1234, ram 8g hdd 500, �Ｚ�� ��ǻ��
		// ��ü ���� ���
		Computer c1 = new Computer();
		c1.cpu = "i7-1234";
		c1.ram = 8;
		c1.hdd = 500;
		c1.showComInfo();
		System.out.println("---------");
		// CPU�� i5-1234, ram 4g hdd 250, �Ｚ�� ��ǻ��
		// ��ü ���� ���
		Computer c2 = new Computer();
		c2.cpu = "i5-1234";
		c2.ram = 4;
		c2.hdd = 250;
		c2.showComInfo();
		System.out.println("---------");
		// ����
		// ������ 2�� ������ ������ ����ϴ� ���
		// �װɷ� 20,34 ���
		// ����� ��������� ���� => �����Ұ� ����.
		Calculator.printHab(20, 34);
//		Calculator c = new Calculator(); //64bit�޸𸮳���
//		c.printHab(20, 34);
		System.out.println("--------------");
		// ���ı�
		// �迭�� ������ �������ִ� ���
		int[] ar = { 123, 23, 256, 11, 345, };
		ArraySorter.sort(ar);
		for (int i : ar) { //ar�� �ִ� int���� i�� ���ʴ�� ��´�.
			
			System.out.println(i);
			
		}
		System.out.println("-------");
	}

}
