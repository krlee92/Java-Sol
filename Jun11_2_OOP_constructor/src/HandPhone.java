
public class HandPhone {
	//클래스 생성시 규칙...
	// 1.멤버변수 배치
	String name;
	String no; // 숫자로서 의미(계산할거 아님)가 없다.
	int price;
	
	// 2.기본생성자 배치
	// ctrl + space : jsp/spring이 자동으로 이걸 써대서
	public HandPhone() {
		// TODO Auto-generated constructor stub
	}
	
	// 3.오버로딩된 생성자 배치
	// ctrl + shift + A(단축키 등록했음)
	public HandPhone(String name, String no, int price) {
		super();
		this.name = name;
		this.no = no;
		this.price = price;
	}
	
	// 4. 일반 메소드 배치
	public void print() {
		System.out.println(name);
		System.out.println(no);
		System.out.println(price);
	}
	
	
	

}
