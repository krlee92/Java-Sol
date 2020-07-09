import java.util.Scanner;

// 비만도 검사 2차

// 이름	:
// 키		:
// 몸무게	:
//-------------------
//BMI : 	소수점 두자리까지, BMI= 몸무게/키*키(키의 단위가 미터이다)
//xxx씨는 yyy요
//아무거나 입력하면 종료됩니다
//실행파일까지

//이상한 데이터 넣으면 해당하는 데이터 넣을때까지 무한반복

//고도 비만 : 40 이상
//중등도 비만 (2단계 비만) : 35 - 39.9
//경도 비만 (1단계 비만) : 30 - 34.9
//과체중 : 25 - 29.9
//정상 : 18.5 - 22.9
//저체중 : 18.5 미만

//// 계산
// public static double calcBMI(double height, double weight) {
//	 double bmi = weight / (height * height);
//	 return bmi;
// }
// // 계산+출력
// public static double calcBMI(double height, double weight) {
//	 double bmi = weight / (height * height);
//	 System.out.println("");
//	 return bmi;
 
 

public class CSMain3 {
	public static String getName() { // main에 다 때려박아도 문제없지만 함수를 쓰는이유는
		// 깔끔하니까, 나중에 찾기 편하니까
		Scanner keyboard = new Scanner(System.in);
		System.out.print("이름	: ");
		String name = keyboard.next();
		return name;
	}

	public static Double getTall() { // 깔끔하니까, 나중에 찾기 편하니까
		Scanner keyboard = new Scanner(System.in);
		System.out.print("키(cm)	: ");
		double tall = keyboard.nextDouble();
		double ans = (tall > 250) ? getTall() : tall; // 키를 250 넘게쓰면 다시 키를 입력하게 하기.
		ans /= 100; //bmi는 미터단위이므로 cm로받은 데이터값을 미터로 전환시키기
		return ans;
	}

	public static Double getWeight() { // 깔끔하니까, 나중에 찾기 편하니까
		Scanner keyboard = new Scanner(System.in);
		System.out.print("몸무게	: ");
		double weight = keyboard.nextDouble();
		double ans = (weight < 0) ? (weight * -1) : weight; // 몸무게를 음수로 쓰면 -1을 곱해서 양수로 해주기.
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name = getName(); //name변수에 getName함수값을 저장
		Double tall = getTall(); //tall변수에 getTall함수값을 저장
		Double weight = getWeight(); //weight변수에 getWeight함수값을 저장
		double bmi = (weight / (tall * tall));
		System.out.println("--------------------------");
		System.out.printf("BMI	:%.1f\n", bmi);
		System.out.print(name + "씨는 ");
		if (bmi >= 40) {
			System.out.println("고도비만 입니다");
		} else if (bmi >= 35) {
			System.out.println("중등도 비만 입니다");
		} else if (bmi >= 30) {
			System.out.println("경도 비만 입니다");
		} else if (bmi >= 25) {
			System.out.println("과체중 입니다");
		} else if (bmi >= 18.5) {
			System.out.println("정상체중 입니다");
		} else {
			System.out.println("저체중 입니다");
		}
		System.out.print("아무거나 입력하면 종료됩니다");
		keyboard.next();

	}

}
