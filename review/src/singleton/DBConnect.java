package singleton;

///////// Singleton pattern

public class DBConnect {

	private static DBConnect con;
	
	private DBConnect() {
		System.out.println("실제 DB 연결");
	}
	
	public static DBConnect getInstance() {
		if(con == null) {
			con = new DBConnect();
		}
		return con;
	}
	
}