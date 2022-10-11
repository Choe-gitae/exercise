package c_Info;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class InfoView {
	// 필드
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancle, bEdit;
	
	// 비지니스 로직 - 모델단
	InfoModel model;
	
	// 생성자
	InfoView() {
		f = new JFrame();
		tfName = new JTextField(20); tfId = new JTextField(); tfTel = new JTextField();
		tfGender = new JTextField(); tfAge = new JTextField(); tfHome = new JTextField();
		ta = new JTextArea(40, 20);
		bAdd = new JButton("Add"); bShow = new JButton("Show"); bSearch = new JButton("Search");
		bDelete = new JButton("Delete"); bCancle = new JButton("Cancle"); bEdit = new JButton("수정하기");
		
		try {
			model = new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}// try~catch
	}// InfoView()
	
	
	/*
	 * 함수명 : addLayout
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 레이어 설정
	 */
	public void addLayout() {
		// 레이아웃 BorderLayout
		//	- WEST		: JPANEL (GridLayout(6,2))
		//	- CENTER	: JTextArea
		//	- SOUTH		: JPANEL (GridLayout(1,6))
		
		//레이아웃 지정
		f.setLayout(new BorderLayout());
			JPanel pWest = new JPanel();
			pWest.setLayout(new GridLayout(6, 2));	//JPanel GridLayout 레이아웃 설정 (행열 레이아웃)
			pWest.add(new JLabel("Name", JLabel.CENTER));	//가운데 정렬
			pWest.add(tfName);
			pWest.add(new JLabel("ID", JLabel.CENTER));
			pWest.add(tfId);
			pWest.add(new JLabel("Tel", JLabel.CENTER));
			pWest.add(tfTel);
			pWest.add(new JLabel("Sex", JLabel.CENTER));
			pWest.add(tfGender);
			pWest.add(new JLabel("Age", JLabel.CENTER));
			pWest.add(tfAge);
			pWest.add(new JLabel("Home", JLabel.CENTER));
			pWest.add(tfHome);
		f.add(pWest, BorderLayout.WEST);	//West 패널 add
		f.add(ta, BorderLayout.CENTER);		//JTextArea center add
			JPanel pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(1, 6));	// JPanel GridLayout 레이아웃 설정 (행열 레이아웃)
			pSouth.setPreferredSize(new Dimension(100, 50));	//크기 재지정 //우선권 먼저주기
			pSouth.add(bAdd);
			pSouth.add(bShow);
			pSouth.add(bSearch);
			pSouth.add(bDelete);
			pSouth.add(bCancle);
			pSouth.add(bEdit);
		f.add(pSouth, BorderLayout.SOUTH);	//South 패널 add
		//화면 출력
		f.setBounds(100, 100, 800, 400);	//창크기 지정
		f.setVisible(true);	//출력 트루
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
	}// addLayout()
	
	
	/*
	 * 함수명 : eventProc
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 버튼 눌릴 때마다 이벤트 처리
	 */
	void eventProc() {
		// Add 버튼 눌렸을 때
		bAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertData();	// 사용자 입력값 DB에 입력
			}
		});
		
		// Show 버튼 눌렸을 때
		bShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectAll();	// ArrayList에 저장된 VO 출력
			}
		});
		
		// Search 버튼 눌렸을 때
		bSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});
		
		// 전화번호 텍스트필드에서 엔터쳤을 때
		tfTel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});
		
		// Delete 버튼이 눌렸을 때
		bDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteByTel();
			}
		});
		
		// 수정하기 버튼이 눌렸을 때
		bEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				edit();
			}
		});
		
	}// eventProc()
	
	
	/*
	 * 함수명 : selectAll
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 모델단에서 질의 결과를 ArrayList에 저장후 VO 출력
	 */
	public void selectAll() {
		try {
			ArrayList<InfoVO> data = model.selectAll();
			ta.setText("===== 검색 결과 =====\n\n");
			for (InfoVO vo : data) {
				ta.append(vo.toString());
			}
		} catch (SQLException e) {
			ta.setText("검색 실패 : "+e.getMessage());
		}// try~catch
		
	}// selectAll()
	
	
	/*
	 * 함수명 : selectByTel
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 모델단에서 질의 결과를 ArrayList에 저장후 VO 출력
	 */
	public void selectByTel() {
		try {
			// 1. 입력한 전화번호 값을 얻어오기
			String tel = tfTel.getText();
			
			// 2. 모델단에 selectByTel() 호출
			InfoVO vo = model.selectByTel(tel);
			
			// 3. 받은 결과를 각각의 텍스트필드에 지정(출력)
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfTel.setText(vo.getTel());
			tfGender.setText(vo.getGender());
			tfHome.setText(vo.getHome());
			tfAge.setText(String.valueOf(vo.getAge()));
			
		}catch(SQLException e) {
			ta.setText("전화번호 검색 실패 : "+e.getMessage());
		}// try~catch
		
	}// selectByTel()
	
	
	/*
	 * 함수명 : deleteByTel
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 전화번호를 넘겨받아서 해당하는 사람의 정보를 삭제
	 */
	public void deleteByTel() {
		// 1. 입력한 전화번호 값을 가져오기
		String tel = tfTel.getText();
		// 2. 모델단 deleteByTel() 호출
		try {
			int rs = model.deleteByTel(tel);
			ta.setText("삭제한 행 수 : "+rs+" 행");
			// 3. 텍스트필드 초기화
			clearText();
		} catch (SQLException e) {
			ta.setText("삭제 실패 : "+e.getMessage());
		}// try~catch
		
	}// deleteByTel()
	
	
	/*
	 * 함수명 : insertData
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 사용자 입력값 DB에 입력
	 */
	public void insertData() {
		// 1. 사용자 입력값 얻어오기
		String name = tfName.getText();
		String id = tfId.getText();
		String tel = tfTel.getText();
		String gender = tfGender.getText();
		int age = Integer.parseInt(tfAge.getText());
		String home = tfHome.getText();
		
		// 2. 1번의 값들을 VO에 지정
		InfoVO vo = new InfoVO();
		vo.setAge(age);
		vo.setGender(gender);
		vo.setHome(home);
		vo.setId(id);
		vo.setName(name);
		vo.setTel(tel);
		
		// 3. 모델의 insertInfo(InfoVO vo) 호출
		try {
			int ret = model.insertInfo(vo);
			ta.setText("입력한 행 : "+ret+" 행");
			// 4. 화면의 입력값들을 지우기
			clearText();
		} catch (SQLException e) {
			e.printStackTrace();
		}// try~catch
		
	}// insertData()
	
	
	/*
	 * 함수명 : edit
	 * 인자	: VO
	 * 리턴값	: int
	 * 역할	: 텍스트필드값 DB에 업데이트
	 */
	public void edit() {
		// 1. 텍스트 필드 값 VO만들기
		InfoVO vo = new InfoVO();
		vo.setName(tfName.getText());
		vo.setId(tfId.getText());
		vo.setTel(tfTel.getText());
		vo.setGender(tfGender.getText());
		vo.setHome(tfHome.getText());
		vo.setAge(Integer.parseInt(tfName.getText()));
		
		// 2. 모델단 edit() 호출
		try {
			// 3. 텍스트필드 초기화
			clearText();
			int ret = model.edit(vo);
			ta.setText("수정한 행 수 : "+ret+" 행");
		} catch (SQLException e) {
			ta.setText("수정 실패 : "+e.getMessage());
		}// try~catch
		
	}// edit()
	
	
	/*
	 * 함수명 : clearText
	 * 인자	: 없음
	 * 리턴값	: void
	 * 역할	: 텍스트필드 초기화
	 */
	public void clearText() {
		tfName.setText(null);
		tfAge.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
	}// clearText()
	
	
	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
		
	}// main()

}
