package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 	HTTP/HTTPS���
// Socket���

// OracleDB���
//	100% ���۾�
//	Oracle�翡�� ���۾����� ->
//		ojdbc14.jar : java1.4
//		ojdbc8.jar : java1.8�̻�
		

public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// ������ DB���� �ּ�(����Ŀ���� �� �ٸ�)
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			
			// ����õ� -> �ּҰ˻� -> ������ DB����Ŀ �Ǵ�
			// �ڵ����� �� ����Ŀ�� �´� Driver�� ã�Ƽ� ���
			
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("�����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close(); //���������� �ٽ� �ݱ�
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
	}

}
