package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 	HTTP/HTTPS통신
// Socket통신

// OracleDB통신
//	100% 수작업
//	Oracle사에서 수작업해준 ->
//		ojdbc14.jar : java1.4
//		ojdbc8.jar : java1.8이상
		

public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// 연결할 DB서버 주소(메이커마다 다 다름)
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			
			// 연결시도 -> 주소검사 -> 연결할 DB메이커 판단
			// 자동으로 그 메이커에 맞는 Driver를 찾아서 사용
			
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("연결됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close(); //연결했으면 다시 닫기
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
	}

}
