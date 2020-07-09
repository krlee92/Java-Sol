// Wi-Fi : 1 << 0	= 1
// 주차장 : 1 << 1	= 2
// 24시간 : 1 << 2	= 4
// 흡연실 : 1 << 3	= 8
public class CSMain2 {
	public static void main(String[] args) {
		int cafe = 13; // 13값은 8+4+1이므로, 주차장은 해당안돼는것을 출력하는것.
		if (cafe >= 8) {
			System.out.println("흡연실");
			cafe -= 8; // cafe - 8; => -=과같다
		}
//		if (cafe >= (1 << 3)) {
//			System.out.println("흡연실");
//			cafe -= (1 << 3)); // cafe - 8; => -=
//		} 계산은 컴퓨터 시키는것.
		if (cafe >= 4) {
			System.out.println("24시간");
			cafe -= 4;
		}
//		if (cafe >= (1 << 2)) {
//			System.out.println("24시간");
//			cafe -= (1 << 2));
//		}
		if (cafe >= 2) {
			System.out.println("주차장");
			cafe -= 2;
		}
//		if (cafe >= ( 1 << 1)) {
//			System.out.println("주차장");
//			cafe -= (1 << 1);
//		}
		if (cafe >= 1) {
			System.out.println("와이파이");
			cafe -= 1;
		}
//		if (cafe >= (1 << 0) {
//			System.out.println("와이파이");
//			cafe -= (1 << 0);
//		}

	}

}
