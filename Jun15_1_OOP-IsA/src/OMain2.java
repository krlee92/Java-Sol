import abcd.Scanner;

// Ŭ������ �ߺ�����?
// JAVAƯ¡ : ���� �۾��س����� �� Ȱ��
//				��Ű�������� �����Ѵ�
// ��Ű��
//		Ŭ����(��Ű���ӿ� �������)
public class OMain2 {
	public static void main(String[] args) {
//		Ŭ���� ���� : ��Ű����.Ŭ������ ������ = new ������;
		java.util.Scanner k = new java.util.Scanner(java.lang.System.in);
		
		// ĳ��1234, 500000��, 1�д� 100�� ��ĵ�ϴ� ��ĳ��
		// �������
		abcd.Scanner kk = new Scanner("ĳ��1234", 500000, 100); //abcd��Ű���� ��ĳ��
		kk.printInfo();
	}

}
 