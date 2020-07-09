package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		// ã���޴��� : 
		// �󸶷μ��� :
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("�����");
			
			Scanner k = new Scanner(System.in);
			System.out.println("ã�� �޴��� :");
			String n = k.next();
			System.out.println("�󸶷� ���� :");
			int p = k.nextInt();
			
			// �׳ɰ˻�
			String sql = "update jun25_menu "
					+ "set m_price = ? "
					+ "where m_name = ?";
			
			// ���԰˻�
			String sql2 = "update jun25_menu "
					+ "set m_price = ? "
					+ "where m_name like '%'||?||'%' ";
						
			pstmt = con.prepareStatement(sql2);
			
			pstmt.setInt(1, p);
			pstmt.setString(2, n);
			
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("��������");
			}
		} catch (Exception e) {
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
