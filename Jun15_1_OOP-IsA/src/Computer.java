// final 멤버변수 : 변수를 상수화
// final 메소드 : 오버라이딩 불가
// final 클래스 : 상속불가
public class Computer extends Product{
	
	String cpu;
	int ram;
	int hdd;
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		
	}

}
