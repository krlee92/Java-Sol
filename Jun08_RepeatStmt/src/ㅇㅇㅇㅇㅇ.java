
public class ししししし {

	public static void main(String[] args) {
//		 (i,j)
				//  せ (0.0)
				//  せせ(1.1)猿走
				//  せせせ(2.2)猿走
				//  せせせせ(3.3)猿走
				//  せせせせせ(4.4猿走)
				for (int i = 0; i <= 4; i++) {
					for (int j = 0; j <= i ; j++) {
						System.out.print("せ");
					}
					System.out.println();
				}
				System.out.println("-----------");
			
			
			
			
				//  せせせせせ(4.4) 
				//  せせせせ(3.3)
				//  せせせ(2.2)
				//  せせ(1.1)
				//  せ(0.0)
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5-i; j++) {
						System.out.print("せ");
					}
					System.out.println();
				}
			
				System.out.println("----------");
				//  せ(1.1)
				//    せ(2.2)
				//      せ(3.3)
				//        せ(4.4)
				//          せ(5.5)
				String c;
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						c = (i == j) ? "せ" : "  ";
						System.out.print(c);
					}
					System.out.println();
					
				}
			
				//  せ(0.0)
				//	ぞぞぞ(1.2)
				//	せせせせせ(2.4)
				//	ぞぞぞぞぞぞぞ(3.6)
				//	せせせせせせせせせ(4.8)
				String d;
				for (int i = 1; i < 6; i++) {
					for (int j = 1; j < (i*2); j++) {
						d = (i % 2 == 0) ? "ぞ" : "せ";
						System.out.print(d);
					}
					System.out.println();
				}
			

	}

}
