package jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USER ="scott";
	String PASS = "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			String sql = "SELECT COUNT(empno) AS WORKER, SUBSTR(HIREDATE,4,2) AS MONTH \r\n"
					+ "FROM EMP \r\n"
					+ "WHERE SUBSTR(HIREDATE,4,2) IS NOT NULL\r\n"
					+ "GROUP BY SUBSTR(HIREDATE,4,2)\r\n"
					+ "ORDER BY SUBSTR(HIREDATE,4,2) ";
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("WORKER"));		//****************
				temp.add( rset.getString("MONTH"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
