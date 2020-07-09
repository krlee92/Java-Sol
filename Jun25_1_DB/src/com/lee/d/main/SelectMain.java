package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	public static void main(String[] args) {
		
		Connection con = null; // �ݾƾ���
		PreparedStatement pstmt = null; // �ݾƾ���
		ResultSet rs = null; // select ����� �����, �ݾƾ���
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("�����");
			
			String sql = "select * from jun25_menu";
			pstmt = con.prepareStatement(sql);
			
//			pstmt.executeUpdate(); - CUD����(insert update delete)
//			pstmt.executeQuery(); - R(read ��ȸ)
			
			rs = pstmt.executeQuery();
			
			// rs.next() : ���� �����ͷ�
//							���� �����Ͱ� ������ false ����
			while (rs.next()) {
				// rs.getXXX("�ʵ��") : ���� Ŀ����ġ�� �� �ʵ� ��������
				System.out.println( rs.getString("m_name"));
				System.out.println( rs.getInt("m_price"));
				// rs.getXXX(�ʵ��ȣ)
				System.out.println( rs.getInt(4) );
				System.out.println("-------");
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
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
