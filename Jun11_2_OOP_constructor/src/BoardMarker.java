// 생성자(constructor) : 객체가 만들어질 때 무언가 작업
//		리턴이 아예 없는, 메소드명이 클래스명과 같은 메소드
		// ctrl + space

// jsp, spring : 객체를 자동으로 만들 때 기본생성자 사용
//		기본생성자를 사용안하면 아예 안건들고
//		생성자 overloading을 사용할거면 기본생성자를 ctrl +space로 살려주자
/**
 * 보드마카 정보
 * @author sundooedu
 *
 */
public class BoardMarker {
	String maker;
	String color;
	int price;
	
	// ctrl + space
	public BoardMarker() {
		// TODO Auto-generated constructor stub
	}
	
/**
 * 마커정보 출력 : 가격 색상 메이커
 */
	public void showMarkerInfo() {
		System.out.println(maker);
		System.out.println(color);
		System.out.println(price);
		
	}

	public BoardMarker(String maker, String color, int price) {
		super();
		this.maker = maker;
		this.color = color;
		this.price = price;
	}
	

}
