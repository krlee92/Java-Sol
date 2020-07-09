 
public class OMain2 {
	
	public static void main(String[] args) {
		// 모나미, 500원, 검정색 펜
		// 출력
		Pen p = new Pen("모나미", 500, "검정색");
		p.print();
		System.out.println("--------------------");
		
		// 홍길동, 10살, 저 펜 주인인 학생
		// 학생 자기소개
		Student s = new Student("홍길동", 10, p);
		s.introduce();
		System.out.println("--------------------");
		
		// 강남고, 대치동, 홍길동 학생이 소속된 학교
		// 출력
		School sc = new School("강남고", "대치동", s);
		sc.showInfo();
		System.out.println("--------------------");
		// 강북고, 칠곡에, 권기웅, 18, 모나미, 300, 빨강색 => 학교
		School sc2 = new School("강북고", "칠곡", new Student("권기웅", 18, new Pen("모나미", 300, "빨강")));
		sc2.showInfo();
		
		// 강북고 다니는 학생 이름
		System.out.println(sc2.student.name);
		System.out.println("--------------------");
		//강북고 다니는 학생이 쓰는 볼펜 이름
		System.out.println(sc2.student.pen.maker);
		System.out.println("--------------------");
		//강북고 다니는 학생 정보 전체 출력
		sc2.student.introduce();
		
	}

}
