
public class School {
	String name;
	String adress;
	Student student;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String name, String place, Student student) {
		super();
		this.name = name;
		this.adress = place;
		this.student = student;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(adress);
		if (student != null) {
			student.introduce();
		}
	}

}
