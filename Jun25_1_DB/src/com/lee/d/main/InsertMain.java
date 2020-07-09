package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// �Է��Ѱ͵� DB������ �����ϴ°� ��ǥ
// DB������ ���� ������ ������� -> ������ǥ�޼��Ұ�

public class InsertMain {
	public static void main(String[] args) {
//		------------------------------
		Connection con = null;
		PreparedStatement pstmt = null; // DB���� �۾� �� å����(DB������ ����, SQL����, ��� �޾ƿ���)
		
		try {
			// ������ DB���� �ּ�(����Ŀ���� �� �ٸ�)
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			
			// ����õ� -> �ּҰ˻� -> ������ DB����Ŀ �Ǵ�
			// �ڵ����� �� ����Ŀ�� �´� Driver�� ã�Ƽ� ���
			
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("�����");
//			���� ���������� ���� �Է�
			Scanner k = new Scanner(System.in);
			System.out.println("�޴��� :");
			String n = k.next();
			System.out.println("���� :");
			int p  =k.nextInt();
			System.out.println("�Ĵ� �Ĵ� ��ȣ :");
			int no = k.nextInt();
			
			// DB������ ������ SQL��ɾ String����..
			// �ڹٺ������� ���ڸ��� ?��
			// ;����
			// ���� �� �����
			String sql = "insert into jun25_menu "
					+ "values(jun25_menu_seq.nextval, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql); 
			// ? ä���
			
			pstmt.setString(1, n); //(����ǥ��ȣ, ��) => 1������ǥ���� n����
			pstmt.setInt(2, p);
			pstmt.setInt(3, no);
			
			// ���� & ����
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("��ϼ���");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close(); //���������� �ݾ��ֱ�
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pstmt.close(); // ����� �ݾ������
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
