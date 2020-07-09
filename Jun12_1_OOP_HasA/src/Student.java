
public class Student {
	String name;
	int age;
	Pen pen;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, Pen pen) {
		super();
		this.name = name;
		this.age = age;
		this.pen = pen;
	}
	
	public void introduce() {
		System.out.println(name);
		System.out.println(age);
		if(pen != null) {
			pen.print();
		}
	}

}
