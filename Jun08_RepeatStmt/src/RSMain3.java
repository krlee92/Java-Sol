
public class RSMain3 {

	public static void main(String[] args) {
		//2단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 x %d = %d\n", i, i*2);
		}
		System.out.println("---------");
		// 2단~9단(세로) : 2x1 = 2 > 2x2= 4 > 2x3=6
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
		}
		System.out.println("-----------------");
		// 2단 ~ 9단 (표 형태) : 2x1=2 -> 3x1=3 -> 4x1=4 .... 9x1=9
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
	}
}
