
public class Bug {
	String name;
	int size;
	
	public Bug() {
		// TODO Auto-generated constructor stub
	}

	public Bug(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public void print() {
		System.out.println(name);
//		System.out.println(size+"cm");
		System.out.printf("%dcm\n", size);
		
	}
	
	

}
