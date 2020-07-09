import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

// �ζ� ��ȣ �ڵ� ������
//		1~45 ������ ������ ���� x6
//		�ߺ��� �ȳ��;���
//	0:	21
//	1:	�ϴ��� �̰�, 1���̶� ���ؼ� �ٸ��� ��, ������?
//	2:	�ϴ��� �̰�, 1,2���̶� ���ؼ� �ٸ��� ��, ������?
//	3:	....
//	4:	....
//	5:	....
//	�������� ����(�ɼ�)

//	1 ~ 6������ ���� 6�� �ߺ� �ȳ�������
//int[] a = {1,2,3,...45}
//a�迭�� ����6�� �̱�




public class lotto {
	
	// ���� �ϳ� �̴µ� ���õȰ� �����Ϸ���
	// ��ȣ�� �ϳ� �̾Ƴ��� �Լ�
	// 		������ �̾� �����͵� �ʿ�(�ߺ��˻�����)
	// 		����� �̴������� �ʿ�
	
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
		
		int[] lotto = new int[6]; // ��ȣ�� ���߿� üũ�ϱ� ���ϰ�, 6ĭ¥�� ���
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(lotto, i);
		
		}
		System.out.println("--------------");
		for (int l : lotto) {
			System.out.println(l);
		}
		
		
		
			
			
		}
		

	}


