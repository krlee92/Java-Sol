package com.lee.cafe.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB�۾��Ҷ� ���������� ���°�

public class DBManager {

	public static Connection connect() throws SQLException { // ����
		String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
		return DriverManager.getConnection(addr, "krlee92", "1111");
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) { // �ݱ�
		
		try { // �ݴ¼��� �߿���
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
