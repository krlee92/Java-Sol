package LML;

// singleton pattern

// ��ü
//		�־���ϴ��� �����°� 
//		������� ����
//			�� : ��� �� -> �޼ҵ带 static ���
//			�� : �־�� ��
//					�ϳ� : singleton pattern
//					������ : factory pattern
public class LML {
	private static final LML LML = new LML("�̸��", 57, "�۵�");
	private String name;
	private int age;
	private String adress;

	private LML() {
		// TODO Auto-generated constructor stub
	}

	private LML(String name, int age, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

	public static LML getLml() {
		return LML;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adress);

	}

}
