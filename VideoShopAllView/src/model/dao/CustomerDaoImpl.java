package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.CustomerDao;
import model.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao{

	// 필드
	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@192.168.0.164:1521:xe";
	final static String USER 	= "BKjeon";
	final static String PASS 	= "jeon";

	// 생성자
	public CustomerDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버 로딩 성공");
	}

	
	/*
	 * 함수명 : insertCustomer
	 * 인자	: 텍스트 필드에 입력한 고객정보
	 * 리턴값	: 없음
	 * 역할	: 사용자가 입력한 고객정보를 받아서 DB에 저장
	 */
	@Override
	public void insertCustomer(CustomerVO vo) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = "INSERT INTO cust(tel, addtel, name, addr, email) VALUES(?,?,?,?,?) ";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTel());
			ps.setString(2, vo.getAddTel());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getAddr());
			ps.setString(5, vo.getEmail());

			// 5. sql 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}// try~finally

	}// insertCustomer()


	/*
	 * 함수명 : selectByTel
	 * 인자	: 검색 할 전화번호
	 * 리턴값	: 전화번호 검색에 따른 고객정보
	 * 역할	: 사용자가 입력한 전화번호를 받아서 해당하는 고객정보를 리턴
	 */
	@Override
	public CustomerVO selectByTel(String tel) throws Exception{

		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		CustomerVO dao = new CustomerVO();	// VO

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = "SELECT * FROM cust WHERE tel=?";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. sql 전송
			ResultSet rs =  ps.executeQuery();

			// 6. VO에 결과 저장
			if(rs.next()) {
				dao.setTel(rs.getString("TEL"));
				dao.setAddTel(rs.getString("ADDTEL"));
				dao.setName(rs.getString("NAME"));
				dao.setAddr(rs.getString("ADDR"));
				dao.setEmail(rs.getString("EMAIL"));
			}

		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}// try~finally
		return dao;

	}// selectByTel()

	
	/*
	 * 함수명 : selectByName
	 * 인자	: 검색 할 이름
	 * 리턴값	: 이름 검색에 따른 고객정보
	 * 역할	: 사용자가 입력한 이름를 받아서 해당하는 고객정보를 리턴
	 */
	@Override
	public ArrayList<String> selectByName(String name) throws Exception {
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		ArrayList<String> list = new ArrayList<String>();

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = "SELECT tel FROM cust WHERE name=?";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, name);

			// 5. sql 전송
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				list.add(rs.getString("TEL"));
			}
			return list;
			
		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}// try~finally
		
	}
	
	@Override
	public CustomerVO selectByNameVo(String name) throws Exception {
		// 2. Connection 연결객체 얻어오기
				Connection con = null;			// 연결객체
				PreparedStatement ps = null;	// 전송객체
				CustomerVO vo = new CustomerVO();	// VO

				try {
					con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

					// 3. sql 문장 만들기
					String sql = "SELECT * FROM cust WHERE name=?";

					// 4. sql 전송객체 (PreparedStatement)		
					ps = con.prepareStatement(sql);
					ps.setString(1, name);

					// 5. sql 전송
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						vo.setAddr(rs.getString("ADDR"));
						vo.setTel(rs.getString("TEL"));
						vo.setAddTel(rs.getString("ADDTEL"));
						vo.setEmail(rs.getString("EMAIL"));
						vo.setName(rs.getString("NAME"));
					}
					return vo;
					
				} finally {
					// 6. 닫기 
					ps.close();
					con.close();
				}// try~finally
				
	}
	

	/*
	 * 함수명 : updateCustomer
	 * 인자	: 고객정보
	 * 리턴값	: 수행한 행 수
	 * 역할	: 사용자가 입력한 고객정보를 받아서 DB에 업데이트하고 수항한 행 수 리턴
	 */
	@Override
	public int updateCustomer(CustomerVO vo) throws Exception{

		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		int result = 0;					// 업데이트한 행 수

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql = "UPDATE cust SET TEL=?, ADDTEL=?, NAME=?, ADDR=?, EMAIL=? WHERE tel=?";

			// 4. sql 전송객체 (PreparedStatement)		
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTel());
			ps.setString(2, vo.getAddTel());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getAddr());
			ps.setString(5, vo.getEmail());
			ps.setString(6, vo.getTel());

			// 5. sql 전송
			result = ps.executeUpdate();

		} finally {
			// 6. 닫기 
			ps.close();
			con.close();
		}// try~finally
		return result;
		
	}// updateCustomer()
}
