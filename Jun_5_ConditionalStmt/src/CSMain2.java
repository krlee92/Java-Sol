// Wi-Fi : 1 << 0	= 1
// ������ : 1 << 1	= 2
// 24�ð� : 1 << 2	= 4
// ���� : 1 << 3	= 8
public class CSMain2 {
	public static void main(String[] args) {
		int cafe = 13; // 13���� 8+4+1�̹Ƿ�, �������� �ش�ȵŴ°��� ����ϴ°�.
		if (cafe >= 8) {
			System.out.println("����");
			cafe -= 8; // cafe - 8; => -=������
		}
//		if (cafe >= (1 << 3)) {
//			System.out.println("����");
//			cafe -= (1 << 3)); // cafe - 8; => -=
//		} ����� ��ǻ�� ��Ű�°�.
		if (cafe >= 4) {
			System.out.println("24�ð�");
			cafe -= 4;
		}
//		if (cafe >= (1 << 2)) {
//			System.out.println("24�ð�");
//			cafe -= (1 << 2));
//		}
		if (cafe >= 2) {
			System.out.println("������");
			cafe -= 2;
		}
//		if (cafe >= ( 1 << 1)) {
//			System.out.println("������");
//			cafe -= (1 << 1);
//		}
		if (cafe >= 1) {
			System.out.println("��������");
			cafe -= 1;
		}
//		if (cafe >= (1 << 0) {
//			System.out.println("��������");
//			cafe -= (1 << 0);
//		}

	}

}
