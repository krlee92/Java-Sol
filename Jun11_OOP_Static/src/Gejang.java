// 세상의 모든 게장은 김수미가 만드는것 -> static 
//		static 멤버변수
//			공통속성 표현할때
//			static 영역에 하나만 만들어짐(게장수만큼x)
//			프로그램 시작하자마자 static 영역에 공간확보
//			-> 메모리절약
//			-> 객체 없을때에도 사용가능한 데이터
//	static final 멤버변수
//		static 특성 포함
//		수정불가 -> 상수화
//		((!중요!))변수명을 다 대문자로
//		->Math.PI = Math라는 클래스 안에는 PI라는 속성이있는데 static final 멤버변수인것.

//	static 메소드(소스)
//		-> 메모리 절약이 약간..(메인에서 호출시)
//		-> 객체 없을때에도 사용가능한 메소드
//		(잘틀림)static 메소드에서 static이 아닌거 사용불가(Static 메소드의 안에서 쓰는 변수도 Static변수만)
//  메인메소드의 (String[] args) : jar파일 실행시(.bat) (메모장에?)명령어 삽입되는 자리.

public class Gejang {
	
	String name; // 게장이 만들어지면 그 때 heap에 영역확보
	// 일반에서만 사용(static안붙은 메소드)
	double weight;
	int price;
	//static,일반 둘다 사용(static이 붙었기때문에)
	static String maker = "김수미"; //메모리상 스태틱영역에 김수미 하나만저장(게장 수만큼 x)
//		프로그램 시작하자마자 static 영역에 공간확보
//	String maker = "김수미" : 쓰레기코드
	static final String MADEIN = "국산";
	
	public static void printMaker() {
		System.out.println(maker);
	}
	
	public void printProductInfo() {
		System.out.println("상품명 :" + this.name);
		System.out.println("생산자 :" + maker);
		System.out.println(weight +"kg");
		System.out.println("가격 :" + price);
		System.out.println(MADEIN);
	}
	
	public static void test() {
		System.out.println("ㅋ");
//		System.out.println(name); // ?
		System.out.println(maker);
		
	}
}
