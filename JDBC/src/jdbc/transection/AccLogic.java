package jdbc.transection;

//#################################################################
//	테이블명 : account
//	account_num		계좌번호		varchar2(20)
//	customer		고객명		varchar2(20)
//	amount			계좌금액		int


import java.sql.*;

import oracle.sql.INTERVALYM;
public class AccLogic 
{
	// 연결 객체 생성시 필요한 변수 선언
	String url;
	String user;
	String pass;

	//===============================================
	// 드라이버를 드라이버매니저에 등록
	public AccLogic() throws Exception{
		/////////////////////////////////////////////////////////
		// 1. 드라이버를 드라이버 매니저에 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		user = "choe";
		pass = "1234";
	}


	//====================================================
	// 보내는 계좌번호와 받는 계좌번호와 계좌금액을 넘겨받아 
	//	보내는계좌에서 계좌금액을 빼고 받는계좌에서 계좌금액을 더한다
	public int moveAccount(String sendAcc, String recvAcc, int amount)
	{
		Connection con = null;
		
		// - 만일 정상적인 경우는 0을 리턴하고 도중에 잘못되었으면 트랜잭션을 롤백시키고 -1을 리턴
		///////////////////////////////////////////////////////////
		try {
			//	 1. Connection 객체 생성
			con = DriverManager.getConnection(url, user, pass);
			
			//@@ 2. Auto-commit을 해제
			con.setAutoCommit(false);
			
			//	 3. 출금계좌에서 이체금액을 뺀다
			String sqlSend = " UPDATE ACCOUNT SET amount = amount-? WHERE ACCOUNT_NUM = ? ";
			PreparedStatement psSend = con.prepareStatement(sqlSend);
			psSend.setInt(1, amount);
			psSend.setString(2, sendAcc);
			int reSend = psSend.executeUpdate();
			//	이체계좌가 없을때 -1 리턴
			if( reSend == 0 ) {
				return -1;
			}
			psSend.close();
			
			//	 4. 입금계좌에 이체금액을 더한다
			String sqlRecv = " UPDATE ACCOUNT SET amount = amount+? WHERE ACCOUNT_NUM = ? ";
			PreparedStatement psRecv = con.prepareStatement(sqlRecv);
			psRecv.setInt(1, amount);
			psRecv.setString(2, recvAcc);
			int reRecv = psRecv.executeUpdate();
			//	받는 계좌가 없을 때 롤백
			if( reRecv == 0) {
				con.rollback();
				return -1;
			}
			psRecv.close();
			
			//@@ 5. commit을 전송한다
			con.commit();
			
		} catch (Exception ex) {
			System.out.println("이체 실패 : "+ex.getMessage());
			return -1;
			
		} finally {
			// 6. 객체 닫기
			try { con.close(); } catch(Exception ex) {}
		}
		return 0;
	}

	//=======================================================
	//	보내는계좌번호와 받는계좌번호를 넘겨받아
	//  필요한 정보 검색
	public void confirmAccount(String sendAcc) throws Exception{


	}

}


