import java.util.Scanner;

public class Guest {
	
	// 멤버변수 : 클래스의 속성 : 자기소개할때 얘기할만한거
	String name;
	double height;
	double weight;
	Scanner mouth = new Scanner(System.in);
	double bmi;
	String status;
	
	// 메소드 : 액션
	// return은 한번에 하나씩만 가능하므로 3개 대답만듬.
	public String tellName() {
		System.out.println("이름 : ");
		String name = mouth.next();
		return name;
	}
	public double tellHeight() {
		System.out.println("키 : ");
		double height = mouth.nextDouble();
		return height;
	}
	public double tellWeight() {
		System.out.println("몸무게 : ");
		double weight = mouth.nextDouble();
		return weight;
	}

}
