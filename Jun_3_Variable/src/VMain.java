//변수 variable
//프로그램 진행하다 생기는 데이터를 임시 저장해야 할 때
//데이터 담는 그릇.
// 자바의 변수는 만들고 값 안넣으면 안됨
//1+1=2 계산하고 땡 =임시저장

//CPU : 연산장치-속도
//RAM : 저장장치 : 변수로, 프로그램 끄거나 재부팅하면 삭제\
//		?
//		stack : 그 공간을 활용하는 프로그램이 종료되면 자동 정리
//		heap  : 자동 정리가 안됨 > 개발자가 수동으로 정리
//			Garbage Collection(heap 자동정리)
//HDD : 저장장치 : 파일형태, 영구보관
//그래픽카드(그래픽 처리용 CPU+RAM+HDD)

//언제 - 
//언어
//		사람 나이 byte

//		인터넷 쇼핑몰 가격 int

//		통장 계좌 잔고 long 

//자료형(data type) : 그릇 종류
//		기본형 : 글자색 바뀌고 소문자로시작, 데이터를 stack에
//		 정수 :int(21억), long(??) int 아니면 long 둘중하나쓰기.
//		 실수 : double(10~)만쓰기
//		한글자 :char
//		논리형 :boolean(ox)
//		없음 : void

//		참조형(reference type) -색 안바뀌고 첫글자 대문자, 데이터를 heap에, 데이터가 있는 번지값을 stack에
//		문자열(한글자도 포함) : String : heap 저장. 문자열 데이터
//		기타

//		기본자료형 : 아무 처리도 안하고 데이터만 있을때 언어가 뭘로 인식?
//			100 : int
//			1.25: double[자바만,대부분 다른 언어는 float]

//변수명 : 그릇 이름 :자유
//자바 문법 x , 특수문자 x _정도사용, 숫자로 시작   x >>틀리면 에러 

//뜻이 통하게 작명, 소문자로 시작, 한글x, 띄어쓰기  x, =>저대로 안하면 시말서
//ex) 사람나이 int humanage 어제기온 int yesterday_Weather_Temperature

// 자료형 변수명;

public class VMain {
	public static void main(String[] args) {

		int a = 10; // 10이라는 데이터를 a라는 변수에 임시저장(4byte)
		String b = "ASD";
		System.out.println(a); // a에 저장된거 출력
//변수 만들기(선언) = RAM에 공간확보 
//변수에 값 넣기
//		변수명 = 값; >> = 같습니다 아니다
//		=(대입연산자) : 우항에 있는걸 좌항에 넣어라

		// 마스크 가격이 2000원
		int mask_Price2;// >>변수명은 선언할때 한번만 쓰고 그뒤로는 ctrl sp
		mask_Price2 = 2000;
		mask_Price2 = 3000;
		System.out.println(mask_Price2);
		System.out.printf("가격: %d원\n", mask_Price2);
//		*중요* 클래스명, 변수명 바꿀때 변수 블록지정-우클릭-Refactor-Rename=관련 변수,클래스 전부다바꿈

		// 마스크 무게가 100.123g
		float maskWeight2;
//		maskWeight2 = (float) 100.123; float라고 표시
//		maskWeight2 = 100.123f; double > float 형변환
		double mask_Weight; // double mask_Weight = 100.123; 한줄로도 가능
		mask_Weight = 100.123;
		System.out.printf("무게:%fg\n", mask_Weight);

		// 마스크 제조사가 웰킵스
		// " " : 문자열 데이터 표시
		String mask_Maker;
		mask_Maker = "웰킵스";  // String mask_Maker = "웰킵스"; 한줄로도 가능.
		
		// 마스크 색이 흰색
		// ' ' : 한 글자 데이터 표시
		char mask_Color = '백'; // 굳이 char 잘안씀
		String mask_Color2 = "백";
		
		// 마스크 줄이 끊어졌나 안끊어졌나
		String mask_LineOK2 = "끊김";
		boolean mask_LineOK = true; //false
		
		System.out.println(mask_LineOK);
		
		//먹은거 이름
		//지불한 돈
		//맛있었나
		//반장할래
		
		String food = "설렁탕";
		int money = 8000;
		boolean satisfy = true;
		boolean being_King_Of_The_Class = false;
		System.out.println("먹은음식:" + food);
		System.out.printf("가격:%dwon\n" , money);
		System.out.println(satisfy);
		System.out.println(being_King_Of_The_Class);

	}

}
