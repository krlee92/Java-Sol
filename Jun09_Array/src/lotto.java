import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

// 로또 번호 자동 생성기
//		1~45 사이의 랜덤한 숫자 x6
//		중복이 안나와야함
//	0:	21
//	1:	일단은 뽑고, 1번이랑 비교해서 다르면 끝, 같으면?
//	2:	일단은 뽑고, 1,2번이랑 비교해서 다르면 끝, 같으면?
//	3:	....
//	4:	....
//	5:	....
//	오름차순 정렬(옵션)

//	1 ~ 6사이의 랜덤 6개 중복 안나오는지
//int[] a = {1,2,3,...45}
//a배열중 랜덤6개 뽑기




public class lotto {
	
	// 숫자 하나 뽑는데 관련된거 정리하려고
	// 번호를 하나 뽑아내는 함수
	// 		기존에 뽑아 놨던것들 필요(중복검사위해)
	// 		몇번공 뽑는중인지 필요
	
	public static int pick(int[] lotto, int ballNo) {
		Random r = new Random();
		int ball = r.nextInt(45) + 1;
		for (int i = 0; i < ballNo; i++) {
			if (ball == lotto[i]) {
				return pick(lotto, ballNo);
			}
		}
		
		return ball;
		
	}

	
	public static void main(String[] args) {
		
		int[] lotto = new int[6]; // 번호들 나중에 체크하기 편하게, 6칸짜리 빈거
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(lotto, i);
		
		}
		System.out.println("--------------");
		for (int l : lotto) {
			System.out.println(l);
		}
		
		
		
			
			
		}
		

	}


