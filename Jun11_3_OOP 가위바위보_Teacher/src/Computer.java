import java.util.Random;

public class Computer {
	
Random brain; // �Ѹ��� �ٺ���� ������ ���� �� �ٺ��ΰ� �ƴϹǷ� static �Ⱦ�
	
	public Computer() { // ��ü�� ��������� ���� �ڵ�����.
		brain = new Random();
	}
	public int fire() {
		return brain.nextInt(3) + 1;
		
	}

}
