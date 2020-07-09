//연산자 : stack 대상
//String은 heap 저장. 
//String은 heap 저장. equals 사용.

//논리연산자 : 결과로  true/false
//	>	(초과)
//	>=	(이상)
//	==	(같다)
//	!=	(다르다)
//	<=	(이하)
//	<	(미만)

//논리결합연산자 *!중요!* 효율적인 식을 짜자.
//	&&(검사횟수 2번), &(검사횟수1번)	(~고 and)
//	||(검사횟수 2번), |(검사횟수 1번)	(~거나 or)
//	^	(Exclusive OR 둘이 다를때 true = XOR)
//	!	(결과를 뒤집는다 =not : true-> false false -> true)

//	XOR 예
//	O O -> X
//	O X -> O
//	X O -> O
//	X X -> X

//따라서 &&(and)는 확률 낮은걸 앞으로 배치.
//따라서 ||: 확률 높은걸 앞으로 배치.
import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("이름:");
		String name = keyboard.next();
		System.out.print("키:");
		double tall = keyboard.nextInt();
		System.out.print("나이:");
		int age = keyboard.nextInt();

//		System.out.println("--------------------------");
//		System.out.printf("이름 :%s\n", name);
//		System.out.printf("키 :%.3f\n", tall);
//		System.out.printf("나이 :%d\n", age);
		System.out.printf("%s, %.3f, %d,", name, tall, age);

		// 키가 150넘으면 타게
		boolean b1 = tall > 150;
		System.out.println(b1);

		// 나이 10살까지만 탈수있게.
		boolean b2 = (age <= 10);
		System.out.println(b2);
		// 나이가 10살이면 타게
		boolean b3 = (age == 10);
		System.out.println(b3);
		// 키가 180만 아니면 타게

		boolean b4 = (tall != 180);
		System.out.println(b4);

		// 이름이 홍길동이면 타게
		// boolean b5 = name == "홍길동"; #1 == "홍길동"
		boolean b5 = name.equals("홍길동"); // 글자 비교할 때
		System.out.println(b5);
		// String은 heap 저장. equals 사용.

		// 키가 150이상이고, 나이도 5살 넘어야 탈수있다.

		boolean b6 = (tall >= 150) && (age > 5);
		System.out.println(b6);
		
		//키가 150 넘거나, 나이가 2살 넘으면 탈수있다.
		boolean b7 = (tall > 150) || (age > 2);
		System.out.println(b7);
		
		// 나이가 2살 넘고(그런 사람이 있을 확률 많다), 키가 200 넘으면 탈수있다(이런 사람이 있을 확률 작다)
		// !!중요!! &&(and) a and b => a검사후 조건 만족하면 b도 검사하기 때문에 확률 낮은것을 앞에 배치하면 검사를 1번하고 끝남. 효율적
		// 따라서 &&(and)는 확률 낮은걸 앞으로 배치.
		boolean b8 = (tall > 200) && (age > 2); //=고효율(검사1번) (age > 2) &&(tall > 200) =검사2번
		System.out.println(b8);
		
		//키가 210 넘거나 나이가 3살 넘으면 탈수있다 => 키가210넘는다(확률낮음) 나이가3살넘는다(확률높음)
		// ||(or) a b 둘중하나만 만족하면true a or b =>a에서 만족하면  b는 검사안함.
		// 따라서 ||(or): 확률 높은걸 앞으로 배치.
		boolean b9 = (tall > 210) || (age > 3);//검사횟수 2번  (age > 3) || (tall > 210) 검사횟수 1번
		System.out.println(b9);
		
		//키가 100 넘고, 키가 150 넘으면 탈수있게
		boolean b10 = (tall >150);
		System.out.println(b10);
		
		
		//나이가 2살 넘거나, 나이가 5살 넘으면 탈수있게
		boolean b11 = (age > 2);
		System.out.println(b11);
		
		//나이가 3살 넘든지, 키가 100 넘든지 하나만 만족(둘다만족하면 false)
		// 4  150 -> x  4 80 -> o 
		boolean b12 = (age > 3) ^ (tall > 100);
		
		// b12의 반대
		boolean b13 = !b12;
		System.out.println(b13);
		

	}

}
