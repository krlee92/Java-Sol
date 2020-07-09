
public class FMain2 {

	public static int test(int x) { // void가 아니고 딴걸 넣으면 return
		int a = 20;
		System.out.println(a);
		System.out.println(x); // 메인의 변수  a=10임
		int b = a + x;
		return b; // 이 함수를 호출한 곳으로 b값 보내주기, 함수 끝
		// return이 함수 끝이므로 그뒤에 아무것도 못옴
				
		
	}
	
	//정수 2개를 넣으면 그 합을 출력하는 함수
	
	public static void printSum(int a, int b) {
		System.out.println(a + b);
		
	}
	
	//정수 2개를 넣으면 그합을 구하는 함수 :해석 잘해야됨, 위와 다름
	public static int getSum(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	//정수 2개를 넣으면 그 중에 더 큰 숫자를 찾아서 
	//거기에 *1000한 값을 구하는 함수
	public static int getBigger1000(int a, int b) {
		int bigger = (a > b) ? a: b;
		int bigger1000 = bigger * 1000;
		return bigger1000;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//3, 1중에 더 큰 숫자만큼 기다렸다가 
		int q2 = getBigger1000(3, 1);
		Thread.sleep(q2);
		
		//5, 7중에 더 큰 숫자에 *1000된거 출력
		int q1 = getBigger1000(5, 7);
		System.out.println(q1*1000);
			
		
		
		
		int hab = getSum(3000, 1000);
		Thread.sleep(hab); // 코드 멈추기(1000분의 1초 단위)
		
		printSum(20,30);
		
		
		
		System.out.println("-------------");
		int a = 10;
		int b = test(a);
		System.out.println(b);

	}

}
