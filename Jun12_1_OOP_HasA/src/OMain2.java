 
public class OMain2 {
	
	public static void main(String[] args) {
		// �𳪹�, 500��, ������ ��
		// ���
		Pen p = new Pen("�𳪹�", 500, "������");
		p.print();
		System.out.println("--------------------");
		
		// ȫ�浿, 10��, �� �� ������ �л�
		// �л� �ڱ�Ұ�
		Student s = new Student("ȫ�浿", 10, p);
		s.introduce();
		System.out.println("--------------------");
		
		// ������, ��ġ��, ȫ�浿 �л��� �Ҽӵ� �б�
		// ���
		School sc = new School("������", "��ġ��", s);
		sc.showInfo();
		System.out.println("--------------------");
		// ���ϰ�, ĥ�, �Ǳ��, 18, �𳪹�, 300, ������ => �б�
		School sc2 = new School("���ϰ�", "ĥ��", new Student("�Ǳ��", 18, new Pen("�𳪹�", 300, "����")));
		sc2.showInfo();
		
		// ���ϰ� �ٴϴ� �л� �̸�
		System.out.println(sc2.student.name);
		System.out.println("--------------------");
		//���ϰ� �ٴϴ� �л��� ���� ���� �̸�
		System.out.println(sc2.student.pen.maker);
		System.out.println("--------------------");
		//���ϰ� �ٴϴ� �л� ���� ��ü ���
		sc2.student.introduce();
		
	}

}
