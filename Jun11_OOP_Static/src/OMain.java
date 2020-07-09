// static 잘쓰는게 OOP 잘하는것
// 세상의 모든 게장은 김수미가 만드는것 -> static 
//		static 멤버변수
//			공통속성 표현할때

public class OMain {

	public static void main(String[] args) {
		// 상품명 : 여름특선세트, 가격이 39900, 무게가5kg, 김수미가 만든 게장
		// 출력
		System.out.println(Gejang.maker);
		System.out.println("---------------");
		Gejang g = new Gejang();
		g.name = "여름 특선 세트";
		g.price = 39900;
		g.weight = 5;
		g.printProductInfo();
		System.out.println(g.maker); //생산자를 알고싶을때 
//		System.out.println(Gejang.maker); 공식코드명은 Gejang.maker이다.
		
		System.out.println("---------------");
		// 상품명 :간장게장세트, 29900, 3kg, 김수미가 만든 게장
		Gejang g2 = new Gejang();
		g2.name = "간장게장세트";
		g2.price = 29900;
		g2.weight = 3;
		g2.printProductInfo();
		System.out.println("---------------");
		g2.price = 29000000;
		g2.maker = "최수미"; //이시점에static 변화됨.
//		g2.madeIn = "중국산"; :못바꿈 영원히국산
		g.printProductInfo();
		
	}

}
