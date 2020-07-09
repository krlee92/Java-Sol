package com.lee.cafe.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB작업할때 공통적으로 쓰는거

public class DBManager {

	public static Connection connect() throws SQLException { // 연결
		String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
		return DriverManager.getConnection(addr, "krlee92", "1111");
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) { // 닫기
		
		try { // 닫는순서 중요함
			rs.close();

		} catch (Exception e) {

		}
		try {
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
