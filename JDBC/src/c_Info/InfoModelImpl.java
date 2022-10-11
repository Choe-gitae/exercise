package c_Info;

import java.sql.*;
import java.util.*;

public class InfoModelImpl implements InfoModel {
	
	// 필드
	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	final static String USER 	= "scott";
	final static String PASS 	= "tiger";
	
	// 생성자
	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER);
		System.out.println("드라이버 로딩 성공");
	}
	
	
	/*
	 * 함수명 : insertInfo
	 * 인자	: VO
	 * 리턴값	: 입력된 행 수
	 * 역할	: 사용자 입력값(InfoVO)을 받아서 DB에 저장하는 역할
	 */
	@Override
	public int insertInfo(InfoVO vo) throws SQLException {
		
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		int ret = 0;					// 입력된 행 수
		
		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			String sql = " INSERT INTO info_tab(name, jumin, tel, gender, age, home) "
					+ " VALUES(?,?,?,?,?,?) ";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getGender());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());

			// 5. 전송객체
			ret = ps.executeUpdate();
			
			return ret;
			
		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}// try~finally
		
	}// insertInfo()
	
	
	/*
	 * 함수명 : selectAll
	 * 인자	: 없음
	 * 리턴값	: ArrayList<InfoVO>
	 * 역할	: DB 테이블 데이터 ArrayList<InfoVO>에 저장
	 */
	@Override
	public ArrayList<InfoVO> selectAll() throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		ArrayList<InfoVO> list = new ArrayList<InfoVO>();	// VO 리스트
		
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			
			// 3. sql 문장
			String sql = " SELECT * FROM info_tab ";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			
			// 5. 전송객체
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
				
				list.add(vo);
			}// while
			rs.close();
			return list;
			
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}// try~finally
		
	}// selectAll()
	
	
	/*
	 * 함수명 : selectByTel
	 * 인자	: 전화번호
	 * 리턴값	: VO
	 * 역할	: 전화번호를 넘겨받아서 해당하는 사람의 정보를 검색
	 */
	@Override
	public InfoVO selectByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		InfoVO vo = new InfoVO();		// VO

		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			String sql = " SELECT * FROM info_tab WHERE tel=? ";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송객체
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setGender(rs.getString("Gender"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setHome(rs.getString("HOME"));
				vo.setAge(rs.getInt("AGE"));
			}
			rs.close();
			
			return vo;

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}// try~finally
		
	}// selectByTel()
	
	
	/*
	 * 함수명 : deleteByTel
	 * 인자	: 전화번호
	 * 리턴값	: 삭제한 행 수
	 * 역할	: 전화번호를 넘겨받아서 해당하는 사람의 레코드를 삭제
	 */
	@Override
	public int deleteByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		int ret = 0;					// 삭제한 행 수

		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			String sql = " DELETE FROM info_tab WHERE tel=? ";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송객체
			ret = ps.executeUpdate();
			
			return ret;

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}// try~finally
		
	}// deleteByTel()
	
	
	/*
	 * 함수명 : edit
	 * 인자	: VO
	 * 리턴값	: int
	 * 역할	: 텍스트필드값 DB에 업데이트
	 */
	@Override
	public int edit(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		int ret = 0;					// 업데이트한 행 수
		
		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			String sql = " UPDATE info_tab SET NAME=?, JUMIN=?, TEL=?, GENDER=?, HOME=?, AGE=? WHERE TEL=? ";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getGender());
			ps.setString(5, vo.getHome());
			ps.setInt(6, vo.getAge());
			ps.setString(7, vo.getTel());

			// 5. 전송객체
			ret = ps.executeUpdate();
			
			return ret;
			
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}// try~finally
		
	}// edit()
}
