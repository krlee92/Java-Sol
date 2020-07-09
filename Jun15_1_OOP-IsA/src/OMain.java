//  신발 is a 상품 => 상속

// 신발
//		모델명
//		가격
//		사이즈
//		정보출력
public class OMain {
	public static void main(String[] args) {
		Shoes s = new Shoes();
		s.name = "?";
		s.price = 0;
		s.size = 0;
		s.printInfo();
		System.out.println("------------");
		// 펜
		//		하이테크
		//		1000원
		//		빨강
		//		출력
		Pen p = new Pen();
		p.name = "하이테크";
		p.price = 1000;
		p.color = "빨강";
		p.printInfo();
		System.out.println("------------");
		// 농구화 = 신발
		//		이름 : 카이리6
		//		가격 : 100000
		//		사이즈 : 265
		//		포지션 : 포인트가드
		//		출력
		BasketBallShoes bbs = new BasketBallShoes();
		bbs.name = "카이리6";
		bbs.price = 1000000;
		bbs.size =  265;
		bbs.position = "PG";
		bbs.printInfo();
		System.out.println("------------");
		
		// 컴퓨터
		//		매직스테이션123
		//		cpu : i7-1234
		//		ram : 8
//				hdd : 500
//				가격 : 800000
//				출력
		Computer c = new Computer();
		c.name = "매직스테이션123";
		c.cpu = "i7-1234";
		c.ram = 8;
		c.hdd = 500;
		c.price = 800000;
		c.printInfo();
		System.out.println("------------");
		// 노트북
		//		센스123
//				cpu : i7-1111
//				ram : 8
//				hdd : 1000
//				가격 : 200000
//				무게 : 5kg
//				출력
		laptop l = new laptop();
		l.name ="센스123";
		l.cpu ="i7-1111";
		l.ram = 8;
		l.hdd = 1000;
		l.price = 200000;
		l.weight = 5;
		l.printInfo();
		System.out.println("------------");
//		랜덤 짝수를 뽑기 - 기존의 랜덤에 기능추가
		RandomMachine rm = new RandomMachine();
		int a = rm.nextInt(10);
		System.out.println(a);
		System.out.println("------------");
		
		Pen p2 = new Pen(); // Pen 생성-> product의 기본생성자를 호출함
//		Pen p3 = new Pen("ㅁ", 1); //생성자 상속안되니까 못씀
		Pen p3 = new Pen("모나미153", 300, "검정");
		p3.printInfo();
		System.out.println("----------");
		// 웰킵스123, 1000원짜리 마스크
		// 정보출력
		Mask m = new Mask("웰킵스123", 1000);
		m.printInfo();
		
	}

}
