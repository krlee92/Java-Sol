package com.lee.cafe.cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lee.cafe.main.DBManager;

public class MenuDAO {
	
	public static String editMenu(Menu m) { // ī����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
	

		try {
			con = DBManager.connect();

			String sql = "update jun26_menu" + 
						"set m_name = ?, set m_price = ?,"
					+	"set m_bean = ?, set m_where = ?" 
					+	"where m_no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setInt(2, m.getPrice());
			pstmt.setString(3, m.getBean());
			pstmt.setInt(4, m.getWhere());
			pstmt.setInt(5, );
			

			if (pstmt.executeUpdate() == 1) {
				return "����";
			}
			return "����";

		} catch (Exception e) {
			e.printStackTrace();
			return "DB������ �̻���";
			
		} finally {

			DBManager.close(con, pstmt, rs);
		}
	
	
	public static ArrayList<Menu> getAllMenu() { //�޴���ü��ȸ
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();

			String sql = "select * from jun26_menu order by m_where, m_name";

			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			ArrayList<Menu> menus = new ArrayList<Menu>();
			
			Menu m = null;
			
			while (rs.next()) {
				m = new Menu(	
						rs.getInt("m_no"),
						rs.getString("m_name"),
						rs.getInt("m_price"),
						rs.getString("m_bean"),
						rs.getInt("m_where")
				);
				menus.add(m);
			}
			return menus;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}
		
	
	
	
	public static String regMenu(Menu m) { // ī����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
	

		try {
			con = DBManager.connect();

			String sql = "insert into jun26_menu values("
					+ "jun26_menu_seq.nextval, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setInt(2, m.getPrice());
			pstmt.setString(3, m.getBean());
			pstmt.setInt(4, m.getWhere());
			

			if (pstmt.executeUpdate() == 1) {
				return "����";
			}
			return "����";

		} catch (Exception e) {
			e.printStackTrace();
			return "DB������ �̻���";
			
		} finally {

			DBManager.close(con, pstmt, null);
		}
	}
}
