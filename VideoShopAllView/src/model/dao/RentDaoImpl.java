package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.RentDao;


public class RentDaoImpl implements RentDao{
	
	// 필드
	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	final static String USER 	= "choe";
	final static String PASS 	= "1234";
	
	
	
	public RentDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(DRIVER);
	}

	
	@Override
	public void rentVideo(String tel, int vnum) throws Exception {
		
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		PreparedStatement ps2 = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결
			
			// 대여 중인지 확인
			String sql2 = " SELECT vidno "
					+ " FROM rent r INNER JOIN video v "
					+ " ON r.vidno = v.vidno "
					+ " WHERE vidno = "+vnum+" AND RET = 'N' ";
			ps2 = con.prepareStatement(sql2);
			ResultSet rs = ps2.executeQuery();
			
			
			if (!rs.next()) {
				// 3. sql 문장 만들기
				String sql = " INSERT INTO rent(rentno, vidno, tel, ret) VALUES(seq_rent.nextval, ?, ?, 'N') ";

				// 4. sql 전송객체 (PreparedStatement)		
				ps = con.prepareStatement(sql);
				ps.setString(1, String.valueOf(vnum));
				ps.setString(2, tel);
				
				// 5. sql 전송
				ps.executeUpdate();
				ps.close();
				JOptionPane.showMessageDialog(null, "대여");
			}else if(rs.next()) {
				JOptionPane.showMessageDialog(null, "대여중인 비디오 입니다");
			}
			rs.close();

		} finally {
			// 6. 닫기 
			ps2.close();
			con.close();
		}

	}// rentVideo()

	
	@Override
	public void returnVideo(int vnum) throws Exception {
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = " UPDATE rent SET ret = 'Y' WHERE vidno = ? AND ret = 'N' ";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(vnum));

			// 5. sql 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}

	}// returnVideo()

	
	@Override
	public ArrayList selectList() throws Exception {
		ArrayList data = new ArrayList();

		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장
			String sql = " SELECT v.vidno vidno, vi.TIT tit, c.NAME name, c.TEL tel, r.RENTDATE+3 returndate, '미납' ret "
					+ "FROM CUST c INNER JOIN RENT r "
					+ "ON c.TEL = r.TEL "
					+ "INNER JOIN VIDEO v "
					+ "ON r.VIDNO = v.VIDNO "
					+ "INNER JOIN VID_INFO vi "
					+ "ON v.INFONO = vi.INFONO "
					+ "WHERE r.RET = 'N' ";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);

			// 5. 전송객체
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VIDNO"));
				temp.add(rs.getString("TIT"));
				temp.add(rs.getString("NAME"));
				temp.add(rs.getString("TEL"));
				temp.add(rs.getString("RETURNDATE"));
				temp.add(rs.getString("RET"));
				data.add(temp);
			}
			rs.close();

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
		return data;
	}
	
	
	@Override
	public String selectName(String tel) throws Exception {
		String name = null;
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = " SELECT name FROM cust WHERE tel = ? ";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. sql 전송
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				name = rs.getString("NAME");
			}
			return name;
			
		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}// try~catch
		
	}// selectName
	
}
