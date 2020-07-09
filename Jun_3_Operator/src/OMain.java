import java.util.Scanner;
//연산자(Operator)
//대입연산자  = : 우항에 있는거를 좌항에 넣어라 
//			(x == y) : xy가 같다.  
//모든 연사자 중 제일 늦게 함
//산술연산자 = - x * / %  => 계산후 큰쪽으로 맞춤
// + : String 붙이기 - 뭐든 String과 +시키면 =>String으로 형변환
// / : 자료형 체크
// 증감연산자 
//	+= -= *= /= %= 대입연산자+산술연산자
//	++ -- (** // 없다)
//10 + 101 => int + long => long
//% - 나눈 나머지

public class OMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("x:");
		int x = keyboard.nextInt();
		System.out.print("y:");
		int y = keyboard.nextInt();
		System.out.println("---------------------------");
		System.out.printf("x는%d, y는%d\n", x, y);
		
		int hab = x + y;
		int cha = x - y;
		int gob = x * y;
		int moks= x / y;
		int t = x % y; //나눈 나머지
		System.out.printf("x + y = %d\n", hab);
		System.out.printf("x - y = %d\n", cha);
		System.out.printf("x * y = %d\n", gob);
		System.out.printf("x / y = %d\n", moks);
		System.out.printf("x %% y = %d\n", t);
		
		//형변환(type casting) : 데이터의 자료형을 바꾸는것
		//변수의 자료형에 맞는것만 넣을 수 있음
		//(자료형)값
		// 자바가 판단해서 강제자동형변환해도 문제가 없다 싶으면  자동으로 형변환
		long l = 1234; // long에 int 넣어도 상관없다.
		double f = 123.123;
		int i = (int) 1234l;
//		어떤 데이터든 + String => String (+연산자를 형변환에 활용)
//		int -> String
		int ii = 10;
		String ss = ii + ""; //= String
		double dd = 123.123123;
		String sss = dd + "w";
		System.out.println(sss);
		
		System.out.println(1+1);
		System.out.println(1+"1");
		System.out.println("1"+"1");
		System.out.println((1+1)+"1");
		System.out.println(1+(1+"1"));
		
		//int / int => int
		//int / double => double
		
		double iii = x / (double)y;
		System.out.println(iii);
		
		x += 3; //x = x + 3; 
		System.out.println(x);
		
		y *= 5; // y= y * 5;
		System.out.println(y);
		
		x++; //x += 1; //x = x + 1; 셋다 같다.하나 올리기.

	}

}
