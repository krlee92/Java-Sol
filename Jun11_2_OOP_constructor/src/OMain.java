// ������(constructor) : ��ü�� ������� �� ���� �۾�
// 		������ �۾��� �������س�����
//		�������Ҷ� �ڹٰ� �˾Ƽ� �������

public class OMain {
	public static void main(String[] args) {
		// �𳪹�, 1000��, ���� ���帶ī
		// ���
		// Ŭ������ ������ = new ������;
		Dog d = new Dog("�߻�", 3); // �̸��� �߻߰� ���̰� 3���� ���� ����
		d.print();
		Dog d2 =new Dog("��",1);
		d2.print();
		System.out.println("------------");
		// ���� //////////////////////////////////
		// jsp, spring : ��ü�� �ڵ����� ���� �� �⺻������ ���
		BoardMarker bm = new BoardMarker(); // ���帶ī ����
		bm.maker = "�𳪹�"; // �� ���帶ī�� ����Ŀ�� �𳪹�
		bm.color = "red";
		bm.price = 1000;
		bm.showMarkerInfo();
		
//		int [] ar = {12, 31, 21};
//		ArraySorter.sort(ar);
//		for (int i : ar) {
//			System.out.println(i);
//		}
		HandPhone s = new HandPhone("������s7edge", "07039942516", 600000);
		s.print();
	}

}
