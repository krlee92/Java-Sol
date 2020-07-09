package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		
//		찾을 매장명 : 무 <- '무'자가 들어있는 매장의 메뉴 다 삭제
//		--------------------------------------
//		성공
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("연결됨");
			
			Scanner k = new Scanner(System.in);
			System.out.println("찾을 매장명 :");
			String n = k.next();
			
			String sql = "delete from jun25_menu "
					+ "where m_where in (" // subquery 실행과가 1이상나올수 있으므로  in 사용
					+ "		select r_no "
					+ "		from jun25_restaurant "
					+ "		where r_name like '%'||?||'%' "
					+ ")";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, n);
			
			int row = pstmt.executeUpdate();
			if (row >= 1) { //삭제의 결과는 하나 이상이 올수있으므로
				System.out.println("삭제 성공");
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
