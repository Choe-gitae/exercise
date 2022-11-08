package b_preparedStatement;

import java.sql.*;

public class InsertEmp {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";	// 127.0.0.1
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 성공");
			
			// -----입력갑
			String name = "본명";
			int sal = 10000;
			String job = "IT";
			
			// 3. SQL 문장
			String sql = "INSERT INTO emp(empno, ename, sal, job) VALUES(5555,?,?,?)";
			
			// 4. SQL 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, sal);
			ps.setString(3, job);
			
			// 5. SQL 전송
			//	- excuteQuery()		:  SELECT					return ResultSet
			//	- excuteUpdate()	:  INSERT/DELETE/UPDATE		return int
			int result = ps.executeUpdate();		// 이미 sql 연결함
			System.out.println(result+"행을 실행");
			
			// 6. 닫기
			ps.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("DB 실패 : "+e);
		}
		
	}

}
