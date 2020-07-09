//	지역변수
//		메소드(함수가아닌데..함수) 속에서 만든 변수
//		초기화를 하고 써야(기본값 없음)
//		그 메소드 진행중에 임시도 필요한거
//		그 행동을 하는 중요만 쓰는거

//	파라메터
//		그 메소드 진행하는데 필요한 재료
		
//	멤버변수
//		그 객체(클래스)의 속성 : 자기소개할떄 얘기할만한거
//		기본값 있음(자동 초기화)

public class Doctor {
	// 멤버변수 : 필요없는듯?
//	Guest g1; // 의사 속성에 손님 정보가 들어가면 이상함..
	
	public void start() {
		Guest g = callGuest();
//		Guest g;
//		g = callGuest();  // 업무보는동안에만 손님을 활용
		ask(g);
		calculate(g);
		tellResult(g);
		
	}
	
	
	public Guest callGuest() {
		return new Guest();
		
		
	}
	
	public void ask(Guest g) { //손님이 이써야 물어볼수있음
		g.name = g.tellName();
		g.height = g.tellHeight();
		g.weight = g.tellWeight();
	}
	
	public void calculate(Guest g) {
		double hm = g.height / 100;
		g.bmi = g.weight / (hm * hm);
		
		if (g.bmi >= 40) {
			g.status = ("고도비만 입니다");
		} else if (g.bmi > 35) {
			g.status = ("중등도 비만 입니다");
		} else if (g.bmi > 30) {
			g.status = ("경도 비만 입니다");
		} else if (g.bmi > 25) {
			g.status = ("과체중 입니다");
		} else if (g.bmi > 18.5) {
			g.status = ("정상체중 입니다");
		} else {
			g.status = ("저체중 입니다");
		} 
		
		
	}
	
	public void tellResult(Guest g) {
		System.out.printf("BMI : %.1f\n", g.bmi);
		System.out.printf("%s씨는 %s\n", g.name, g.status);
	}
	
	

}
