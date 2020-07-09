package com.lee.cafe.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lee.cafe.bean.Bean;
import com.lee.cafe.main.DBManager;

public class BeanDAO {
	
	public static ArrayList<Bean> getAllBean() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();

			String sql = "select * from jun26_bean order by b_name";

			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			ArrayList<Bean> beans = new ArrayList<Bean>();
			
			Bean b = null;
			
			while (rs.next()) {
				b = new Bean(	
						rs.getString("b_name"),
						rs.getString("b_taste")
				);
				beans.add(b);
			}
			return beans;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}
	
	
	public static String regBean(Bean b) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect();
			
			String sql = "insert into jun26_bean values(?, ?)";  
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getName());
			pstmt.setString(2, b.getTaste());
			
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
