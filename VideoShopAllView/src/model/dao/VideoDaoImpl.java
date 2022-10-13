package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.VideoVO;

public class VideoDaoImpl implements VideoDao{

	// 필드
	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	final static String USER 	= "choe";
	final static String PASS 	= "1234";

	public VideoDaoImpl() throws Exception{

		// 1. 드라이버로딩
		Class.forName(DRIVER);
	}


	@SuppressWarnings("resource")
	public void insertVideo(VideoVO vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps1 = null;	// 전송객체
		PreparedStatement ps2 = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장 만들기
			String sql1 = " INSERT INTO vid_info(infono, dir, tit, act, gen, summ) VALUES (seq_infono.nextval,?,?,?,?,?) ";
			String sql2 = " INSERT INTO video(vidno, infono) VALUES (seq_videono.nextval, seq_infono.currval) ";

			// 4. sql 전송객체 (PreparedStatement)	
			ps1 = con.prepareStatement(sql1);
			ps1.setString(1, vo.getDir());
			ps1.setString(2, vo.getTit());
			ps1.setString(3, vo.getAct());
			ps1.setString(4, vo.getGen());
			ps1.setString(5, vo.getSumm());
			
			ps2 = con.prepareStatement(sql2);

			// 5. sql 전송
			ps1.executeUpdate();
			for (int i = 0; i < count; i++) {
				ps2.executeUpdate();
			}

		} finally {
			// 6. 닫기
			ps1.close();
			ps2.close();
			con.close();
		}// try~finally

	}// insertVideo()


	@Override
	public ArrayList selectVideo(int idx, String word) throws Exception {
		ArrayList data = new ArrayList();

		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장
			String[] colNames = {"tit", "dir"};
			String sql = " SELECT vidno, tit, dir, act "
					+ " FROM video v LEFT OUTER JOIN vid_info i "
					+ " ON v.infono = i.infono "
					+ " WHERE "+colNames[idx]+" LIKE '%"+word+"%' ";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);

			// 5. 전송객체
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VIDNO"));
				temp.add(rs.getString("TIT"));
				temp.add(rs.getString("DIR"));
				temp.add(rs.getString("ACT"));
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
	public VideoVO selectByVnum(int vnum) throws Exception {
		VideoVO vo = new VideoVO();
		
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체
		
		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장
			String[] colNames = {"tit", "dir"};
			String sql = " SELECT * "
					+ " FROM video v LEFT OUTER JOIN vid_info i "
					+ " ON v.infono = i.infono "
					+ " WHERE vidno = "+String.valueOf(vnum);
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setVidno(rs.getInt("VIDNO"));
				vo.setDir(rs.getString("DIR"));
				vo.setTit(rs.getString("TIT"));
				vo.setAct(rs.getString("ACT"));
				vo.setGen(rs.getString("GEN"));
				vo.setSumm(rs.getString("SUMM"));
			}
			rs.close();

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
		return vo;
	}

	
	@Override
	public int modifyVideo(VideoVO vo) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결
			
			// 3. sql 문장
			String sql = " UPDATE vid_info SET DIR=?, TIT=?, ACT=?, GEN=?, SUMM=? "
					+ " WHERE infono = (SELECT infono FROM video WHERE vidno = "+String.valueOf(vo.getVidno())+")";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getDir());
			ps.setString(2, vo.getTit());
			ps.setString(3, vo.getAct());
			ps.setString(4, vo.getGen());
			ps.setString(5, vo.getSumm());

			// 5. 전송
			int result = ps.executeUpdate();
			return result;
			
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
		
	}// modifyVideo()
	
	
	@Override
	public int deleteVideo(int vnum) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;			// 연결객체
		PreparedStatement ps = null;	// 전송객체

		try {
			con = DriverManager.getConnection(URL, USER, PASS);		// DB연결

			// 3. sql 문장
			String sql = " DELETE FROM video "
					+ " WHERE vidno = "+vnum;

			// 4. 전송객체
			ps = con.prepareStatement(sql);

			// 5. 전송
			int result = ps.executeUpdate();
			return result;
			
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}

	}// deleteVideo()
	
}
