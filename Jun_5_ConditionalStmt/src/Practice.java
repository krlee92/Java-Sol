import java.util.Scanner;

public class Practice {
	//정수하나 넣으면 그 값을 출력하는 함수
	
	public static void print(int d) {
		System.out.println(d);
	}
	
	// 정수하나 넣으면 그값의 두배를 구하는 함수
	public static int getDouble(int c) {
		int ans = (c * 2);
		return ans;
		
	}

	public static void main(String[] args) {
		int xxx = 100;
		// print 함수 호출. xxx에 저장되어있는 100을 d자리에 넣어서
		print(xxx); 
		
		// xxx의 두 배를 출력
		// getDouble 함수 호출 xxx에 저장되어있는 100을 getDouble에 넣어서
		// 구한 200을 dd에 저장한다.
		int dd = getDouble(xxx);
//		System.out.println(dd);
		print(dd);
		
		


	}

}
