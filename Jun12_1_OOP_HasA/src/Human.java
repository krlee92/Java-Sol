
public class Human {
	
	String name;
	int age;
	House home;
	Chemical weapon;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		
		System.out.println(name);
		System.out.println(age);
		if (home != null) { // ���� ���� �������� ������ ���
			home.print();
		}
		if (weapon != null) { // ���� ���� �������� ������ ���
			weapon.print();
		}
	}

}
