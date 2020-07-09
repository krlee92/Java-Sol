
public class Phone {
	String name;
	String number;
	String color;
	Human owner;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, String number, String color) {
		super();
		this.name = name;
		this.number = number;
		this.color = color;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(number);
		System.out.println(color);
		if (owner != null) {
			owner.introduce();
		}
		
	}


}
