//	객체간 관계(Has A 관계)
// 		Has A
//			House Has A Bug
// 		Is A
//			House Is A Bug(x)
public class OMain {
	public static void main(String[] args) {
		// 개포주공1단지, 1층에 있는 집
		// 출력
		House h = new House("개포주공1단지", 1);
//		h.print();
		System.out.println("-------");
		// 바퀴벌레, 3cm 벌레
		// 출력
		Bug b = new Bug("바퀴벌레", 3);
		b.print();
		System.out.println("-------");
		
		h.bug = b; // h란집에 b라는 벌레가 나온다는 표현.
		h.print();
		System.out.println("================");
		// 매화주공4단지, 9층인 집
		House h2 = new House("매화주공4단지",9);
		h2.print();
		System.out.println("================");
		
		// 이름이 권기웅, 나이가 29인 사람
		// 그 사람이 저 바퀴벌레 나오는 개포주공1단지에 산다.
		Human k = new Human("권기웅", 29);
		k.home = h;
		k.introduce();
		System.out.println("================");
		
		// 갤럭시s4, 01031544435, 은색 핸드폰
		// 핸드폰 주인이 (바퀴벌레나오는 개포주공1단지에 사는 권기웅)
		// 전화기 정보출력
		Phone p = new Phone("갤럭시s4", "01031544435", "silver");
		p.owner = k;
		p.print();
		System.out.println("================");
		
		// 판데스, 3000원, 약
		// 권기웅의 무기가 판데스
		// 자기소개
		Chemical c = new Chemical("판데스", 3000);
		k.weapon = c;
		k.introduce();
		System.out.println("=========");
//		Has A 관계
		// 권기웅의 무기 가격만 알고싶을때
		System.out.println(k.weapon.price);
		System.out.println("=========");
		
		// 권기웅의 집은 몇층에
		System.out.println(k.home.floor);
		System.out.println("=========");
		
		// 권기웅의 집에서 나오는 벌레 이름
		System.out.println(k.home.bug.name);
		System.out.println("=========");
		
		//갤럭시s4의 주인의 집에서 나오는 벌레 사이즈
		System.out.println(p.owner.home.bug.size);
		System.out.println("=========");
		
		// 권기웅 집에서 나오는 벌레 정보 전체 출력
		k.home.bug.print();
	}

}
