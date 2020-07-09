// Call by Value, Call by Reference
// 참조형 데이터 특징
public class AMain3 {
	public static void test(int a, int[] b) {
		System.out.println(a);
		System.out.println(b[0]);
		a = 20;
		b[0] = 20; // >> 참조형의 데이터를 바꾸는 것
		System.out.println(a);
		System.out.println(b[0]); 
		System.out.println("----------");
	}
	public static void main(String[] args) {
		int a = 10; // 기본형
		int[] b = {10,20}; // 배열은 무적권 참조형
		test(a, b);
		System.out.println(a); // 기본형 데이터가 함수 안에서 바뀌었으므로 메인에는 반영 x
		System.out.println(b[0]); // 함수안에서 참조형 데이터가 바뀌었으므로, 바뀐 데이터 반영됨.
		
	}

}
