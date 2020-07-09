
public class RSMain2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + "," + j + "\t");
				
			}
			System.out.println();
		}
		// 	(i,j)
		//  せ (0.0)
		//  せせ(1.1)猿走
		//  せせせ(2.2)猿走
		//  せせせせ(3.3)猿走
		//  せせせせせ(4.4猿走)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		//  せせせせせ(4.4) 
		//  せせせせ(3.3)
		//  せせせ(2.2)
		//  せせ(1.1)
		//  せ(0.0)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
			//  せ(1.1)
			//    せ(2.2)
			//      せ(3.3)
			//        せ(4.4)
			//          せ(5.5)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("せ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
			//  せ(0.0)
			//	ぞぞぞ(1.2)
			//	せせせせせ(2.4)
			//	ぞぞぞぞぞぞぞ(3.6)
			//	せせせせせせせせせ(4.8)
		String c = null; // null : 凧繕莫痕呪拭 焼巷依亀 蒸陥.
		for (int i = 0; i < 5; i++) {
			c = (i % 2 == 0) ? "せ" : "ぞ";
			for (int j = 0; j <= i*2; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		

		

	}

}
