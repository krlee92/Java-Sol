package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		
//		ã�� ����� : �� <- '��'�ڰ� ����ִ� ������ �޴� �� ����
//		--------------------------------------
//		����
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("�����");
			
			Scanner k = new Scanner(System.in);
			System.out.println("ã�� ����� :");
			String n = k.next();
			
			String sql = "delete from jun25_menu "
					+ "where m_where in (" // subquery ������� 1�̻󳪿ü� �����Ƿ�  in ���
					+ "		select r_no "
					+ "		from jun25_restaurant "
					+ "		where r_name like '%'||?||'%' "
					+ ")";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
			
			int row = pstmt.executeUpdate();
			if (row >= 1) { //������ ����� �ϳ� �̻��� �ü������Ƿ�
				System.out.println("���� ����");
			}
					
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
