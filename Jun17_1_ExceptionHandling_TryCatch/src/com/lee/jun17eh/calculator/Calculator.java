package com.lee.jun17eh.calculator;


// ��ü�� �ʿ��Ѱ�? : ������� �ֳ�
//		�ʿ��ϴٸ� ���?
//		������ 0 ����

// ���ܻ�Ȳ(exception��) ���
// 1. �ٷ�ó��: try catch finally
// try(�ϴܽ���) ->  ���� ��Ȳ���� catch�� - finally(return������ ���°�, return���� ���� ����)
// 2. �̷�� : throws (exception��) - �޼��� ȣ���� ���ο��� ó���ϼ��� 
//		@$2���� ���� ����@$(�ڵ� �����Ҷ� ������ - ���ܻ�Ȳ ������� �޶����)

//
public class Calculator {
	
	public static void printResult(int x, int y) {
		try {
			// �ϴ� ���� ����
			int d = x/y;
			System.out.println(d);
			
			int[] ar = {123, 123, 12};
			System.out.println(ar[y]);
		} catch (/*java.lang.*/ArithmeticException e) { //���ܸ� 
			// try ���� �ϴٰ� ArithmeticException�� �߻��ϸ� �����
			System.out.println("y�� 0�� ���� ��ϳ� �Ӹ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ����");
		}
	}
		
	public static void printResult2(int x, int y) {	
		try {
			int d = x / y;
			System.out.println(d);
			
			int[] ar = {123, 123, 12};
			System.out.println(ar[y]);
			
		} catch (Exception e) { // ������ -> Exception�� ���� Ŭ������ �ϳ��� ��ġ��
			e.printStackTrace(); // �����ڿ� (���� ����)
			System.out.println("���� �Ӹ�");
		}
		// ���ܰ� �߻��ߵ� ���� ������ �����
		System.out.println("�� ��");
	}
		
		public static int divide(int x, int y) {
			try {
				int d = x / y;
				return d;
				
			} catch (Exception e) {
				System.out.println("������ 0�� ����� �Ӹ�");
				return -123; //return�� �޼ҵ� �����°���. �׹� �ڵ�� ���� x
			} finally { // return���� ���� �����ϴ°� 
				System.out.println("�� �� �޷γ�");
			}
		}
		// divide2�� �����ϴٰ� Arithmetic ������ divide2 ȣ���� �ʿ��� ó���ϼ�
		public static int divide2(int x, int y) throws ArithmeticException {
			int d = x / y;
			return d;
			
	}

}
