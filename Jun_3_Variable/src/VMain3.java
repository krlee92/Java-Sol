import java.util.Scanner;

// 프로그램 : 입력받기
public class VMain3 {
	// 핸드폰 모델명 저장
			//어디서 샀는지 저장
			//얼마주고 샀는지 저장
			//화면 몇인치
			//할부 남았나
	public static void main(String[] args) {
		//콘솔창에 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in); //JDK1.5추가
		
		System.out.print("모델명 : ");
		
		// 핸드폰 모델명
		String name = keyboard.next(); //입력한 String 데이터 불러오기
		
		System.out.print("어디서 :");
		String address = keyboard.next();
		System.out.print("가격 :");
		int price = keyboard.nextInt(); //입력한 int 데이터 불러오기
		System.out.print("화면:");
		double inch2 = keyboard.nextDouble(); //입력한 double 데이터 불러오기
		System.out.print("할부 남았나:");
		boolean loan = keyboard.nextBoolean(); //입력한 boolean 데이터 불러오기
		
		
		System.out.println("----------------------------------------------------------");
		System.out.printf("모델 : %s\n", name);
		System.out.printf("%s에서 삼\n", address);
		System.out.printf("%d주고 삼\n", price);
		System.out.printf("%.2f인치\n", inch2);
		System.out.printf("할부 남았나 : ");
		System.out.println(loan);
		

			
	}

}
