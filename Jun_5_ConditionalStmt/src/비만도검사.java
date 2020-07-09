import java.util.Scanner;

public class 비만도검사 {
	public static String getName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("이름:");
		String name = keyboard.next();
		return name;
	}
	public static double getTall() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("키:");
		double height = keyboard.nextDouble();
		double ans = (height > 250) ? getTall() : height;
		ans /= 100;
		return ans;
	}
	public static double getWeight() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("몸무게:");
		double weight = keyboard.nextDouble();
		double ans = (0 > weight) ? weight * -1 : weight;
		return ans;

	}
	
	
	
	public static void main(String[] args) {
		String name = getName();
		double tall = getTall();
		double weight = getWeight();
		System.out.println("----------");
		double bmi = weight / (tall * tall);
		System.out.printf("BMI :%.1f\n" , bmi);
		System.out.println(name +"씨는요 ");
		
		if (bmi >= 40) {
			System.out.println("고도비만 입니다");
		} else if (bmi > 35) {
			System.out.println("중등도 비만 입니다");
		} else if (bmi > 30) {
			System.out.println("경도 비만 입니다");
		} else if (bmi > 25) {
			System.out.println("과체중 입니다");
		} else if (bmi > 18.5) {
			System.out.println("정상체중 입니다");
		} else {
			System.out.println("저체중 입니다");
		} 
		
		
	}

}
//비만도 검사 2차

//이름	:
//키		:
//몸무게	:
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