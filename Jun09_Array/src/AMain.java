// �迭(array) : ������ �ϳ�, �����ʹ� ������ �ִ°�.
//	����	:	������
// 	1		:	1
public class AMain {

	public static void main(String[] args) {
		// �л��� ���������� 50��
		int kor = 50;

		// �ٸ� �л��� ��� 70��
//		kor = 70; �� �л� ������ 50���� 70���� ����.
		int kor2 = 70;
		///////////////////
		// �л��� 5��
//		int[] eng; // int�� 
//		int eng[]; //eng�� �迭����. �����ϳ� ���
		int[] eng = { 12, 54, 56, 78, 21 }; // *����!*:��ȣ����: index : 0 1 2 3 4
		// �ι�°�л� �������� ���
		System.out.println(eng[1]);

		// �л� ��(�迭�� �� ��)
		System.out.println(eng.length);
		
		// �������л� ��������
		System.out.println(eng[eng.length - 1]); //�л����� 5���ε� eng.lenghth=5�̰� �������л��� 4��.
		
		// ��ü�л� ���
		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}

	}

}
