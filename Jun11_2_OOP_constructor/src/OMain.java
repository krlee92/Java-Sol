// 생성자(constructor) : 객체가 만들어질 때 무언가 작업
// 		생성자 작업을 전혀안해놓으면
//		컴파일할때 자바가 알아서 만들어줌

public class OMain {
	public static void main(String[] args) {
		// 모나미, 1000원, 빨간 보드마카
		// 출력
		// 클래스명 변수명 = new 생성자;
		Dog d = new Dog("삐삐", 3); // 이름이 삐삐고 나이가 3살인 개를 생성
		d.print();
		Dog d2 =new Dog("쫑",1);
		d2.print();
		System.out.println("------------");
		// 구식 //////////////////////////////////
		// jsp, spring : 객체를 자동으로 만들 때 기본생성자 사용
		BoardMarker bm = new BoardMarker(); // 보드마카 생성
		bm.maker = "모나미"; // 그 보드마카의 메이커는 모나미
		bm.color = "red";
		bm.price = 1000;
		bm.showMarkerInfo();
		
//		int [] ar = {12, 31, 21};
//		ArraySorter.sort(ar);
//		for (int i : ar) {
//			System.out.println(i);
//		}
		HandPhone s = new HandPhone("갤럭시s7edge", "07039942516", 600000);
		s.print();
	}

}
