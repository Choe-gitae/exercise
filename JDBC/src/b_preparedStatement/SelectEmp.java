package b_preparedStatement;

import java.sql.*;

public class SelectEmp {

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
			
			// 3. SQL 문장
			String sql = "SELECT empno, ename, sal, job FROM emp";
			
			// 4. SQL 전송객체
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. SQL 전송
			//	- excuteQuery()		:  SELECT					return ResultSet
			//	- excuteUpdate()	:  INSERT/DELETE/UPDATE		return int
			ResultSet rs = ps.executeQuery();		// 이미 sql 연결함
			while (rs.next()) {
				int empno 		= rs.getInt("EMPNO");
				String ename 	= rs.getString("ENAME");
				int sal			= rs.getInt("SAL");
				String job 		= rs.getString("JOB");
				System.out.println(empno+"/"+ename+"/"+sal+"/"+job);
			}
			
			// 6. 닫기
			ps.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("DB 실패 : "+e);
		}
		
	}

}
