package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	public static void main(String[] args) {
		
		Connection con = null; // 닫아야함
		PreparedStatement pstmt = null; // 닫아야함
		ResultSet rs = null; // select 결과가 저장됨, 닫아야함
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("연결됨");
			
			String sql = "select * from jun25_menu";
			pstmt = con.prepareStatement(sql);
			
//			pstmt.executeUpdate(); - CUD전용(insert update delete)
//			pstmt.executeQuery(); - R(read 조회)
			
			rs = pstmt.executeQuery();
			
			// rs.next() : 다음 데이터로
//							다음 데이터가 없으면 false 리턴
			while (rs.next()) {
				// rs.getXXX("필드명") : 현재 커서위치의 그 필드 가져오기
				System.out.println( rs.getString("m_name"));
				System.out.println( rs.getInt("m_price"));
				// rs.getXXX(필드번호)
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
