package LML;

// singleton pattern

// 객체
//		있어야하는지 따지는것 
//		멤버변수 유무
//			무 : 없어도 됨 -> 메소드를 static 기반
//			유 : 있어야 함
//					하나 : singleton pattern
//					여러개 : factory pattern
public class LML {
	private static final LML LML = new LML("이명로", 57, "송도");
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
