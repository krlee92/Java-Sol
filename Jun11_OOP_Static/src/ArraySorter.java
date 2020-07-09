/**
 * 배열 정렬할 때 쓰쇼
 * @author sundooedu     // 주석다 달고 project -> generate javadoc으로 설명서 생성
 *
 */
public class ArraySorter {
	// 배열을 넣으면 정렬해주는 기능
	/**
	 * 
	 * @param ar int배열 통으로 넣으쇼
	 */
	
	public static void sort(int[] ar) {
		//제일 작은거 찾아서 맨앞에
		int min = 0; 		// 최소값
		int minIndex = 0; 	// 최소값의 위치
		int t = 0; //값 바꿀때 쓰려고
		// ar[0]
		// ar[1] 0번과 1번 자리 어떻게바꿀까?
//		t = ar[1];
//		ar[1] = ar[0];
//		ar[0] = t;
		
//		123, 23, 2, 11, 345
//
//		0 : 제일 작은거 찾아서 0번이랑 바꾸기
//
//		2, 23 , 123, 11, 345
//
//		1 : 그 다음 작은거 찾아서 1번이랑 자리바꾸기
//
//		2, 11, 123, 23, 345
		
		for (int i = 0; i < ar.length -1; i++) {
			min = ar[i];
			minIndex = i;
			for (int j = i+1; j < ar.length; j++) {
				if(min > ar[j]) { 
					min = ar[j];
					minIndex = j;
				}
			}
			t = ar[minIndex];
			ar[minIndex] = ar[i];
			ar[i] = t;
		}
	}
}
