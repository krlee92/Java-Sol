
// �Լ� ȣ�� : �ӵ� ����, �޸� ����
//	�Լ� ȣ���� ���� �������� ����ϴ°�
//	��깮�� -> �ݺ���

public class FMain5 {

	// ���ڸ� ������ 1 + 2 + 3...+ �װŸ� ���ϴ� �Լ�
	// 1 => 1
	// 2 => 1+2(1������ �� + 2)
	// 3 => 2������ �� + 3
	// 4 => 3������ �� + 4
	public static int getSum(int n) {
//		�Լ� �ӿ��� �ڱ��ڽ��� �� ȣ�� -> �ݺ�
//		�Լ� �����(recursive)ȣ��
		int ans = (n == 1) ? 1 : (getSum(n - 1) + n);
//		main���� int a = getSum(5); ȣ���
//		int n�� 5�� ���� �װ���� (getSum4+5)�ε� getSum4�� �ڱ��ڽ��� �� ȣ���ϹǷ�
//		getSum(4) = (getSum(3)+4)�̴�. n�� ������ 1�� �ƶ����� �ݺ��Ѵ�.
		return ans;
	}

	// ���ڸ� ������ ���丮�� ���ϴ� �Լ�
	public static int getF(int n) {
		int ans = (n == 1) ? 1 : (getF(n - 1) * n);
		return ans;
	}
	// �Ǻ���ġ ����
	// 1 : 1
	// 2 : 1
	// 3 : (1+1) = 2
	// 4 : (1+2) = 3
	// 5 : (2+3) = 5
	// 6 : (3+5) = 8
	// ���ڸ� ������ ����ġ�� �Ǻ���ġ���� �� ���ϴ� �Լ�
	// && and || or
	public static int getFibo(int n) {
//		int ans = (n <= 2) ? 1 : (getFibo(n-1)+getFibo(n-2)); �Ŵµ� ������ ��� �ȵŴϱ� ��� ������ �Ǵ�.
		int ans = (n < 0) || (n <= 2) ? 1 : (getFibo(n-1)+getFibo(n-2));
//		(0 < n <= 2)�� �ȉ´�.���̽㿡���� ����. �Ϸ��� ������ ���� �����.
//		int ans = ((n == 1) || (n == 2)) ? 1 : (getFibo(n-1)+getFibo(n-2)); �̰ŵ� ����.
		return ans;
	}
	
	//

	public static void main(String[] args) {
		int a = getSum(5);
		System.out.println(a);
		int b = getF(4);
		System.out.println(b);
		int c = getFibo(6);
		System.out.println(c);

	}

}
