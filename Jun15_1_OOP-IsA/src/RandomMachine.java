import java.util.Random;
//���� ¦���� �̱� - ������ ������ ����߰�
public class RandomMachine extends Random{ // ������� Ȯ��
	
	@Override
	public int nextInt(int bound) {
		int n = super.nextInt(bound);
		return (n % 2 == 0) ? n: nextInt(bound);
	}

}
