// ������(constructor) : ��ü�� ������� �� ���� �۾�
//		������ �ƿ� ����, �޼ҵ���� Ŭ������� ���� �޼ҵ�
		// ctrl + space

// jsp, spring : ��ü�� �ڵ����� ���� �� �⺻������ ���
//		�⺻�����ڸ� �����ϸ� �ƿ� �Ȱǵ��
//		������ overloading�� ����ҰŸ� �⺻�����ڸ� ctrl +space�� �������
/**
 * ���帶ī ����
 * @author sundooedu
 *
 */
public class BoardMarker {
	String maker;
	String color;
	int price;
	
	// ctrl + space
	public BoardMarker() {
		// TODO Auto-generated constructor stub
	}
	
/**
 * ��Ŀ���� ��� : ���� ���� ����Ŀ
 */
	public void showMarkerInfo() {
		System.out.println(maker);
		System.out.println(color);
		System.out.println(price);
		
	}

	public BoardMarker(String maker, String color, int price) {
		super();
		this.maker = maker;
		this.color = color;
		this.price = price;
	}
	

}
