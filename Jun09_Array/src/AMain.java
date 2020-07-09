// 배열(array) : 변수는 하나, 데이터는 여러개 넣는것.
//	변수	:	데이터
// 	1		:	1
public class AMain {

	public static void main(String[] args) {
		// 학생의 국어점수가 50점
		int kor = 50;

		// 다른 학생의 국어가 70점
//		kor = 70; 위 학생 점수를 50에서 70으로 수정.
		int kor2 = 70;
		///////////////////
		// 학생이 5명
//		int[] eng; // int들 
//		int eng[]; //eng가 배열변수. 둘중하나 사용
		int[] eng = { 12, 54, 56, 78, 21 }; // *주의!*:번호순서: index : 0 1 2 3 4
		// 두번째학생 영어점수 출력
		System.out.println(eng[1]);

		// 학생 수(배열에 몇 개)
		System.out.println(eng.length);
		
		// 마지막학생 영어점수
		System.out.println(eng[eng.length - 1]); //학생수는 5명인데 eng.lenghth=5이고 마지막학생은 4번.
		
		// 전체학생 출력
		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}

	}

}
