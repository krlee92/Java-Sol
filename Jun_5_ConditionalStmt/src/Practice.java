import java.util.Scanner;

public class Practice {
	//�����ϳ� ������ �� ���� ����ϴ� �Լ�
	
	public static void print(int d) {
		System.out.println(d);
	}
	
	// �����ϳ� ������ �װ��� �ι踦 ���ϴ� �Լ�
	public static int getDouble(int c) {
		int ans = (c * 2);
		return ans;
		
	}

	public static void main(String[] args) {
		int xxx = 100;
		// print �Լ� ȣ��. xxx�� ����Ǿ��ִ� 100�� d�ڸ��� �־
		print(xxx); 
		
		// xxx�� �� �踦 ���
		// getDouble �Լ� ȣ�� xxx�� ����Ǿ��ִ� 100�� getDouble�� �־
		// ���� 200�� dd�� �����Ѵ�.
		int dd = getDouble(xxx);
//		System.out.println(dd);
		print(dd);
		
		


	}

}
