// 0. JVM이 OMain2.main(null);를 해줌
// 1. 소스(메소드)가 기계어로 번역된거 다 stack에 : R
// 2. static 멤버변수들이 static 영역에 : G
// 3. 16번줄 실행 시... : B


public class OMain2 {
	public static void main(String[] args) throws InterruptedException {
		// static 메소드 호출 : 메모리 0사용
		Gejang.printMaker();
		
		// 일반 메소드 호출  : 메모리 64bit + a사용
		Gejang gg = new Gejang();
		gg.printMaker();
		
		
		for (String s : args) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		System.out.println(Gejang.maker);
		System.out.println(Gejang.MADEIN);
		System.out.println("----------");
		Gejang.test();
		
		Gejang g = new Gejang();
		g.name = "양념게장특선";
		g.price = 39900;
		g.weight = 10;
		g.printProductInfo();

	}

}
