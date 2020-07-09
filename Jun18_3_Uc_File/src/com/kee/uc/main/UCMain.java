package com.kee.uc.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// ������
//		CPU : ������ġ
//		RAM : ������ϸ� �� �������� ������ġ ->����
//			static/stack : ���α׷� ������ ������ �ڵ�����
//			heap : ������ �ƴѵ� (�ڹ�,���̽���)GarbageCollection -> ���α׷� ������ ������ �ڵ�����
//		HDD : ���� ������ġ -> ����
//		GPU (�׷��� ó���� CPU+RAM+HDD)

// Ȯ���� : MS Windows���� ����(��� �����������)
// 
// ���ϸ�.Ȯ����
// �������� - x 
//	.xls => �������� ���� �� ������ ����(���� ��������-x)
// �޸������� - x
//	.txt
// �׸������� - x
//	.bmp

// Comma Separated value - csv���� => �������� �� ����, �޸��忡���� �߿���
// A,B,C,... ,�� �����ϴ�����
public class UCMain {
	public static void main(String[] args) {
		// �̸� :
		// �������(yyyyMMdd)
		// ����:
		// ����:
		// ����:
		//--------------------
		// �̸� :
		// �������(yyyyMMdd)
		// ����:
		// ����:
		// ����:
		//....
		// �̸�: ���̶�� ���� �׸��ϰ�
		
		// �� ������ �� �����ϰ� �����.
		
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("D:/JAVA/student.csv", true);
			bw = new BufferedWriter(fw);
			String data = null;
			Scanner k = new Scanner(System.in);
			String name = null;
			String br = null;
			int kor = 0;
			int eng = 0;
			int mat = 0;
			while (true) {
				System.out.println("�̸� :");
				 name = k.next();
				 if (name.equals("��")) {
					break;
				}
				System.out.println("�������(yyyyMMdd) :");
				 br = k.next();
				System.out.println("���� :");
				 kor = k.nextInt();
				System.out.println("���� :");
				 eng= k.nextInt();
				System.out.println("���� :");
				 mat = k.nextInt();
				 
				 data = String.format("%s,%s,%d,%d,%d\r\n", name,br,kor,eng,mat);
				 bw.write(data);
				 bw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
