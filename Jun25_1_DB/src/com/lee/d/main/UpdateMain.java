package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		// 찾을메뉴명 : 
		// 얼마로수정 :
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("연결됨");
			
			Scanner k = new Scanner(System.in);
			System.out.println("찾을 메뉴명 :");
			String n = k.next();
			System.out.println("얼마로 수정 :");
			int p = k.nextInt();
			
			// 그냥검색
			String sql = "update jun25_menu "
					+ "set m_price = ? "
					+ "where m_name = ?";
			
			// 포함검색
			String sql2 = "update jun25_menu "
					+ "set m_price = ? "
					+ "where m_name like '%'||?||'%' ";
						
			pstmt = con.prepareStatement(sql2);
			
			pstmt.setInt(1, p);
			pstmt.setString(2, n);
			
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("수정성공");
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
