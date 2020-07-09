import java.util.Scanner;

public class OMain4 {

	public static void main(String[] args) {

//		비만도 검사
//		이름	: xxx
//		키 	: yyy
//		몸무게: zzz
//		-----------------
//		표준체중	:aa.akg		<=(키-100)한거 90%
//		비만도	:aa.a%		<=(몸무게/표준체중)*100
//		xxx님은 ~~~입니다	<=비만도 120넘으면 비만, 아니면 정상
		
		Scanner keyboard = new Scanner(System.in);
			//JVM이 여기만 실행
			//앞으로 키보드 입력 받을거니까 준비
		
		//변수를 덜 씀 -> 메모리 요구량이 감소
		// 근데 변수를 안쓰면 소스 가독성이 안좋아짐
		// 요즘은 컴퓨터가 좋아서 -> 적당히 정리...

		System.out.print("이름  : ");
		String name = keyboard.next();
		System.out.print("키:");
		double tall = keyboard.nextDouble();
		System.out.print("몸무게:");
		double weight = keyboard.nextDouble();
		System.out.println("--------------------------");
		double stdweight = ((tall - 100) *0.9);
		double bimando = (weight / stdweight) *100;
		String result = (stdweight > 120) ? "비만입니다" : "정상체중입니다"; //변수설정
		System.out.printf("표준체중:%.1fkg\n", stdweight);
		System.out.printf("비만도:%.1f%%\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);
		
		System.out.print("아무거나 입력하면 종료됩니다");
		keyboard.next();
		
		//일반인들이 실행하기 편하게 실행파일 만들어주기
		//Runnable JAR File로 export
		//JAR = Java Archive(자바 압축파일)
		
//한국어 -> -개발 -> Java -컴파일-> 기계어   -실행->		
//				.Java		.class
//					컴파일된 소스(기계어상태를) 압축해놓은것
//					.jar파일은 명령어를 입력해서 실행해야 ->??
//					 윈도우 명령어를 내가 미리 써주기
//					메모장 :실행명령어 : java -jar 파일명
//					모든파일 형식으로 jar파일이 있는곳에 저장 :저장이름.bat로 저장
//					bat파일 실행
		
		
		
		//ctrl + f11 : 실행
		//f11 : 디버그(debug) -> 다음줄
		//콘솔창 정리하기 - ㅁ버튼 xx버튼
		
	
		
	}

}
