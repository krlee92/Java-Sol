import java.util.Scanner;

public class User {
	Scanner brain; // �Ѹ��� �ٺ���� ������ ���� �� �ٺ��ΰ� �ƴϹǷ� static �Ⱦ�
	
	public User() { // ��ü�� ��������� ���� �ڵ�����.
		brain = new Scanner(System.in);
	}
	public int fire() {
		return brain.nextInt();
		
	}

}
