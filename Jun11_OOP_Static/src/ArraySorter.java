/**
 * �迭 ������ �� ����
 * @author sundooedu     // �ּ��� �ް� project -> generate javadoc���� ���� ����
 *
 */
public class ArraySorter {
	// �迭�� ������ �������ִ� ���
	/**
	 * 
	 * @param ar int�迭 ������ ������
	 */
	
	public static void sort(int[] ar) {
		//���� ������ ã�Ƽ� �Ǿտ�
		int min = 0; 		// �ּҰ�
		int minIndex = 0; 	// �ּҰ��� ��ġ
		int t = 0; //�� �ٲܶ� ������
		// ar[0]
		// ar[1] 0���� 1�� �ڸ� ��Թٲܱ�?
//		t = ar[1];
//		ar[1] = ar[0];
//		ar[0] = t;
		
//		123, 23, 2, 11, 345
//
//		0 : ���� ������ ã�Ƽ� 0���̶� �ٲٱ�
//
//		2, 23 , 123, 11, 345
//
//		1 : �� ���� ������ ã�Ƽ� 1���̶� �ڸ��ٲٱ�
//
//		2, 11, 123, 23, 345
		
		for (int i = 0; i < ar.length -1; i++) {
			min = ar[i];
			minIndex = i;
			for (int j = i+1; j < ar.length; j++) {
				if(min > ar[j]) { 
					min = ar[j];
					minIndex = j;
				}
			}
			t = ar[minIndex];
			ar[minIndex] = ar[i];
			ar[i] = t;
		}
	}
}
