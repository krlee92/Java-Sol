import java.util.Scanner;

//JVM은 무조건 메인부터 시작한다.(실행버튼)
//함수의 기본형은 public static 리턴타입 함수명(파라메터){

public class FMain3 {
	public static String getName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("이름  : ");
		String name = keyboard.next();
		return name;
	}

	public static double getTall() { // 이름이 tallGet 보다 좋은점은 정렬시 getName과 같이 위치하기때문에 더 좋다.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("키:");
		double tall = keyboard.nextDouble();
		return tall;
	}

	public static double getWeight() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("몸무게:");
		double weight = keyboard.nextDouble();
		return weight;
	}

	public static double calculateStWeight(double tall) {
		double stdweight = (tall - 100) * 0.9;
		return stdweight;
	}

	public static double calculateBimando(double weight, double stdweight) {
		double bimando = (weight / stdweight) * 100;
		return bimando;
	}
	
	public static String calculateResult(double bimando) {
		String result = (bimando > 120) ? "비만" : "정상";
		return result;
	}
	
	public static void printResult(double stdW, double bmd, String n, String r) {
		System.out.printf("표준체중:%.1fkg\n", stdW);
		System.out.printf("비만도:%.1f%%\n", bmd);
		System.out.printf("%s씨는 %s\n", n, r);
	}

	public static void main(String[] args) {
		String name = getName(); //name 이라는 변수에 getName함수 값을 저장한다. 그후 밑의 printResult 에서 name값을 출력한다.
		double tall = getTall(); //tall이라는 변수에 getTall함수 값을 저장한다.
		double weight = getWeight(); // weight라는 변수에 getWeight라는 함수값을 저장한다.
		System.out.println("---------");
		double stdWeight = calculateStWeight(tall); 
		double bimando = calculateBimando(weight, stdWeight);
		String result = calculateResult(bimando);
		printResult(stdWeight, bimando, name, result);
		
		

	}

}
