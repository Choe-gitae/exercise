package b_preparedStatement;

import java.sql.*;

public class UpdateEmp {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";	// 127.0.0.1
			String user = "scott";
			String pass = "tiger";

			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 성공");

			// 입력값
			int sabun = 7698;
			String saname = "아무개";
			int salary = 15000;

			// 7698 사원의 이름과 월급을 변경하세요
			// 3. SQL 문장
			String sql = "UPDATE emp SET ename = ?, sal = ? WHERE empno = ?";

			// 4. SQL 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, saname);
			ps.setInt(2, salary);
			ps.setInt(3, sabun);

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
