package com.lee.jun17eh.calculator;


// 객체가 필요한가? : 멤버변수 있나
//		필요하다면 몇개나?
//		나누기 0 못씀

// 예외상황(exception류) 대비
// 1. 바로처리: try catch finally
// try(일단실행) ->  예외 상황마다 catch로 - finally(return있을때 쓰는것, return보다 먼저 실행)
// 2. 미루기 : throws (exception명) - 메서드 호출한 메인에서 처리하세요 
//		@$2번을 많이 쓴다@$(코드 재사용할때 유용함 - 예외상황 대응방식 달라야함)

//
public class Calculator {
	
	public static void printResult(int x, int y) {
		try {
			// 일단 여기 실행
			int d = x/y;
			System.out.println(d);
			
			int[] ar = {123, 123, 12};
			System.out.println(ar[y]);
		} catch (/*java.lang.*/ArithmeticException e) { //예외명 
			// try 속을 하다가 ArithmeticException이 발생하면 여기로
			System.out.println("y에 0을 쓰면 어떡하냐 임마");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 없음");
		}
	}
		
	public static void printResult2(int x, int y) {	
		try {
			int d = x / y;
			System.out.println(d);
			
			int[] ar = {123, 123, 12};
			System.out.println(ar[y]);
			
		} catch (Exception e) { // 다형성 -> Exception이 상위 클래스라 하나로 퉁치기
			e.printStackTrace(); // 개발자용 (원인 추적)
			System.out.println("뭐냐 임마");
		}
		// 예외가 발생했든 말든 무조건 실행됨
		System.out.println("밥 사");
	}
		
		public static int divide(int x, int y) {
			try {
				int d = x / y;
				return d;
				
			} catch (Exception e) {
				System.out.println("나누기 0이 어딨냐 임마");
				return -123; //return이 메소드 끝나는곳임. 그밑 코드는 실행 x
			} finally { // return보다 먼저 실행하는것 
				System.out.println("올 때 메로나");
			}
		}
		// divide2를 실행하다가 Arithmetic 터지면 divide2 호출한 쪽에서 처리하쇼
		public static int divide2(int x, int y) throws ArithmeticException {
			int d = x / y;
			return d;
			
	}

}
