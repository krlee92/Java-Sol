// House Has A Bug
public class House {
	
	String name; // �Ӽ� : �� ���� �Ұ��� �� �Ҹ��� ��
	int floor;
	Bug bug; //������ �ִ°��� ���� ������ ���� ����
	
	public House() {
		// TODO Auto-generated constructor stub
	}

	public House(String name, int floor) {
		super();
		this.name = name;
		this.floor = floor;
	}
	
	public void print() {
		System.out.println(name);
		System.out.printf("%d��\n",floor);
		if(bug != null) { // �������� null�� �ƴҶ�����, bug.print();���
			bug.print();
		}
	}

}
