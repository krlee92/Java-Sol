// 신발 is a 상품 => 상속 extends =>확장

//@XXX : annotation - 자동으로 뭔가를 해주는것
public class Shoes extends Product{
	// product에 있는 속성들이 다 상속됨
	int size;
	
	// product로부터 물려받아온 printInfo()는 이름, 가격출력 기능만
	// printInfo()를 했을때 이름, 가격, 사이즈까지 출력했으면
	// => 물려받아온 printInfo()기능 좀 개조(기능추가)하고 싶음
	// overriding
	
	@Override // 바로 밑에 overriding메소드가 있어야
//				-> 소스를 보면 바로 알게 표시용(오버라이딩 한줄알게)
	public void printInfo() {
		super.printInfo(); // spuer(상위클래스,부모클래스) = Product
								// Product에 있는 printInfo() 호출
		System.out.println(size);
		
	}
	
	
}
