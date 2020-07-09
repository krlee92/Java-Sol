package com.lee.cafe.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lee.cafe.main.DBManager;

// DAO/DTO 패턴
//	DAO(Data Access Object)
//		M중에 D관련작업 전담
//	JavaBean/DTO(Data Trans/Temp Object)
//		DB관련 결과를 표현

public class CafeDAO {
	
	public static ArrayList<Cafe> getAllCafe() { //카페조회
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();

			String sql = "select * from jun26_cafe order by c_where, c_name";

			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			ArrayList<Cafe> cafes = new ArrayList<Cafe>();
			
			Cafe c = null;
			
			while (rs.next()) {
				c = new Cafe(	
						rs.getInt("c_no"),
						rs.getString("c_name"),
						rs.getString("c_where")
				);
				cafes.add(c);
			}
			return cafes;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}
	

	public static String regCafe(Cafe c) { // 카페등록
		Connection con = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;

		try {
			con = DBManager.connect();

			String sql = "insert into jun26_cafe " + "values(jun26_cafe_seq.nextval, ?, ?) ";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getWhere());

			if (pstmt.executeUpdate() == 1) {
				return "성공";
			}
			return "실패";

		} catch (Exception e) {
			e.printStackTrace();
			return "DB서버가 이상해";
			
		} finally {

			DBManager.close(con, pstmt, null);
		}
	}

}
