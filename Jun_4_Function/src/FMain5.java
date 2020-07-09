
// 함수 호출 : 속도 저하, 메모리 낭비
//	함수 호출은 정리 차원에서 사용하는것
//	계산문제 -> 반복문

public class FMain5 {

	// 숫자를 넣으면 1 + 2 + 3...+ 그거를 구하는 함수
	// 1 => 1
	// 2 => 1+2(1까지의 합 + 2)
	// 3 => 2까지의 합 + 3
	// 4 => 3까지의 합 + 4
	public static int getSum(int n) {
//		함수 속에서 자기자신을 또 호출 -> 반복
//		함수 재귀적(recursive)호출
		int ans = (n == 1) ? 1 : (getSum(n - 1) + n);
//		main에서 int a = getSum(5); 호출시
//		int n에 5가 들어가고 그결과는 (getSum4+5)인데 getSum4는 자기자신을 또 호출하므로
//		getSum(4) = (getSum(3)+4)이다. n에 들어갈값이 1이 됄때까지 반복한다.
		return ans;
	}

	// 숫자를 넣으면 팩토리얼 구하는 함수
	public static int getF(int n) {
		int ans = (n == 1) ? 1 : (getF(n - 1) * n);
		return ans;
	}
	// 피보나치 수열
	// 1 : 1
	// 2 : 1
	// 3 : (1+1) = 2
	// 4 : (1+2) = 3
	// 5 : (2+3) = 5
	// 6 : (3+5) = 8
	// 숫자를 넣으면 그위치의 피보나치수열 값 구하는 함수
	// && and || or
	public static int getFibo(int n) {
//		int ans = (n <= 2) ? 1 : (getFibo(n-1)+getFibo(n-2)); 돼는데 음수일 경우 안돼니까 양수 조건을 건다.
		int ans = (n < 0) || (n <= 2) ? 1 : (getFibo(n-1)+getFibo(n-2));
//		(0 < n <= 2)는 안됀다.파이썬에서만 가능. 하려면 조건을 따로 써야함.
//		int ans = ((n == 1) || (n == 2)) ? 1 : (getFibo(n-1)+getFibo(n-2)); 이거도 가능.
		return ans;
	}
	
	//

	public static void main(String[] args) {
		int a = getSum(5);
		System.out.println(a);
		int b = getF(4);
		System.out.println(b);
		int c = getFibo(6);
		System.out.println(c);

	}

}
