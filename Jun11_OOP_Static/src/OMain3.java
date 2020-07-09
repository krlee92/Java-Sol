// 다 삼성컴퓨터
public class OMain3 {
	public static void main(String[] args) {
		// CPU가 i7-1234, ram 8g hdd 500, 삼성거 컴퓨터
		// 전체 정보 출력
		Computer c1 = new Computer();
		c1.cpu = "i7-1234";
		c1.ram = 8;
		c1.hdd = 500;
		c1.showComInfo();
		System.out.println("---------");
		// CPU가 i5-1234, ram 4g hdd 250, 삼성거 컴퓨터
		// 전체 정보 출력
		Computer c2 = new Computer();
		c2.cpu = "i5-1234";
		c2.ram = 4;
		c2.hdd = 250;
		c2.showComInfo();
		System.out.println("---------");
		// 계산기
		// 정수를 2개 넣으면 그합을 출력하는 기능
		// 그걸로 20,34 계산
		// 계산기는 멤버변수가 없다 => 저장할게 없다.
		Calculator.printHab(20, 34);
//		Calculator c = new Calculator(); //64bit메모리낭비
//		c.printHab(20, 34);
		System.out.println("--------------");
		// 정렬기
		// 배열을 넣으면 정렬해주는 기능
		int[] ar = { 123, 23, 256, 11, 345, };
		ArraySorter.sort(ar);
		for (int i : ar) { //ar에 있는 int값을 i에 차례대로 담는다.
			
			System.out.println(i);
			
		}
		System.out.println("-------");
	}

}
