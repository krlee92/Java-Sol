package com.lee.mvc.main;

// ���� �ϳ��� �� ����� �����°� �۾��ϱ� ����

// ������, �����̳�, ��, PM, ....

// MVC����
//		� ������ �ϳ� ������ M/V/C�߿� �ϳ��� ���Ҹ�

// Model : ����Ͻ� ����(���� ���) - ������ + ��
// View : �������� ����(�Է�, ���) - �����̳� 
// Controller : ���� ������
//		��ȯ�Ǵ��ؼ� M�� �ʿ��ϸ� M ��ȯ, V�� �ʿ��ϸ� V��ȯ


public class C {

	public static void main(String[] args) {
		Result r = V.getInput();
		M.calculate(r);
		V.printResult(r);
		

	}

}
