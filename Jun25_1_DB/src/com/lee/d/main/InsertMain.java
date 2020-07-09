package com.lee.d.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// 입력한것들 DB서버에 저장하는게 목표
// DB서버에 뭔가 문제가 생길수도 -> 최종목표달성불가

public class InsertMain {
	public static void main(String[] args) {
//		------------------------------
		Connection con = null;
		PreparedStatement pstmt = null; // DB관련 작업 총 책임자(DB서버로 전송, SQL실행, 결과 받아오기)
		
		try {
			// 연결할 DB서버 주소(메이커마다 다 다름)
			String addr = "jdbc:oracle:thin:@192.168.0.88:1521:xe";
			
			// 연결시도 -> 주소검사 -> 연결할 DB메이커 판단
			// 자동으로 그 메이커에 맞는 Driver를 찾아서 사용
			
			con = DriverManager.getConnection(addr, "krlee92", "1111");
			System.out.println("연결됨");
//			연결 성공했으면 정보 입력
			Scanner k = new Scanner(System.in);
			System.out.println("메뉴명 :");
			String n = k.next();
			System.out.println("가격 :");
			int p  =k.nextInt();
			System.out.println("파는 식당 번호 :");
			int no = k.nextInt();
			
			// DB서버로 전송할 SQL명령어를 String으로..
			// 자바변수값이 들어갈자리는 ?로
			// ;없이
			// 띄어쓰기 잘 만들기
			String sql = "insert into jun25_menu "
					+ "values(jun25_menu_seq.nextval, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql); 
			// ? 채우기
			
			pstmt.setString(1, n); //(물음표번호, 값) => 1번물음표값에 n넣음
			pstmt.setInt(2, p);
			pstmt.setInt(3, no);
			
			// 전송 & 실행
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("등록성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close(); //연결했으면 닫아주귀
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pstmt.close(); // 사람도 닫아줘야함
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
