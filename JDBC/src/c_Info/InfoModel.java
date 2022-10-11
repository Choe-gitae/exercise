package c_Info;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InfoModel {

	/*
	 * 함수명 : insertInfo
	 * 인자	: VO
	 * 리턴값	: 입력된 행 수
	 * 역할	: 사용자 입력값(InfoVO)을 받아서 DB에 저장하는 역할
	 */
	int insertInfo(InfoVO vo) throws SQLException;// insertInfo()

	/*
	 * 함수명 : selectAll
	 * 인자	: 없음
	 * 리턴값	: ArrayList<InfoVO>
	 * 역할	: DB 테이블 데이터 ArrayList<InfoVO>에 저장
	 */
	ArrayList<InfoVO> selectAll() throws SQLException;// selectAll()
	
	/*
	 * 함수명 : selectByTel
	 * 인자	: 전화번호
	 * 리턴값	: VO
	 * 역할	: 전화번호를 넘겨받아서 해당하는 사람의 정보를 검색
	 */
	InfoVO selectByTel(String tel) throws SQLException;
	
	/*
	 * 함수명 : deleteByTel
	 * 인자	: 없음
	 * 리턴값	: 삭제된 행 수
	 * 역할	: 전화번호를 넘겨받아서 해당하는 사람의 정보를 삭제
	 */
	int deleteByTel(String tel) throws SQLException;
	
	
	/*
	 * 함수명 : edit
	 * 인자	: VO
	 * 리턴값	: 업데이트 행 수
	 * 역할	: 텍스트필드값 DB에 업데이트
	 */
	int edit(InfoVO vo) throws SQLException;

}