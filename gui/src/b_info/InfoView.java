package b_info;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class InfoView {
	// 필드
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancle, bExit;
	ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	
	// 생성자 : 인자 없음
	InfoView() {
		f = new JFrame();
		tfName = new JTextField(20); tfId = new JTextField(); tfTel = new JTextField();
		tfGender = new JTextField(); tfAge = new JTextField(); tfHome = new JTextField();
		ta = new JTextArea(40, 20);
//		bAdd = new JButton("Add", new ImageIcon("src\\b_info\\imgs\\1.png")); 
		bAdd = new JButton("Add"); 
		bShow = new JButton("Show"); bSearch = new JButton("Search");
		bDelete = new JButton("Delete"); bCancle = new JButton("Cancle"); bExit = new JButton("Exit (alt+x)");
	}// end of InfoView()
	
	/*
	 * 함수명		: addLayout
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 레이아웃 세팅
	 */
	public void addLayout() {
		// 레이아웃 BorderLayout
		//	- WEST		: JPANEL (GridLayout(6,2))
		//	- CENTER	: JTextArea
		//	- SOUTH		: JPANEL (GridLayout(1,6))
		
		//레이아웃 지정
		f.setLayout(new BorderLayout());	// JPanel BorderLayout 레이아웃 설정 (동서남북중앙 레이아웃)
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
			bAdd.setIcon(new ImageIcon("src\\b_info\\imgs\\1.png"));	//버튼 아이콘 지정
			bAdd.setHorizontalTextPosition(JButton.CENTER);		//수평 기준 가운데
			bAdd.setVerticalTextPosition(JButton.BOTTOM);		//수직 기준 아래
			bAdd.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\2.png"));	//마우스 대면 아이콘 변환
			bAdd.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\3.png"));		//눌렀을때 아이콘 변환
			pSouth.add(bShow);
			pSouth.add(bSearch);
			pSouth.add(bDelete);
			pSouth.add(bCancle);
			pSouth.add(bExit);
			bExit.setToolTipText("프로그램을 종료합니다.");	//마우스 대면 툴팁 나오게
			bExit.setMnemonic('x');	//키보드 키 인식
		f.add(pSouth, BorderLayout.SOUTH);	//South 패널 add
		//화면 출력
		f.setBounds(100, 100, 800, 400);	//창크기 지정
		f.setVisible(true);	//출력 트루
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
	}
	
	/*
	 * 함수명		: eventProc
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 이벤트 처리
	 */
	public void eventProc() {
		// 'ADD' 버튼이 눌렸을 때
		bAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inputData();
				clearTextField();
				selectAll();
			}
		});
		
		// 'SHOW' 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectAll();
			}
		});
		
		// 'SEARCH' 버튼이 눌렸을 때
		bSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});
		
		// 'DELETE' 버튼이 눌렸을 때
		bDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteByTel();
				clearTextField();
				selectAll();
			}
		});
		
		// 'CANCLE' 버튼이 눌렸을 때
		bCancle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextField();
			}
		});
		
		// 'EXIT' 버튼이 눌렸을 때
		bExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Exit 버튼 클릭");
			}
		});
		
		// 주민번호 입력창에서 엔터 쳤을 때
		tfId.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();
			}//end of actionPerformed
		});//end of addActionListener
		
		//주민번호 입력창에서 포커스 이벤트 발생했을 때
		bShow.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}// end of focusLost()
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}// end of focusGained
		});// end of addFocusListener
		
		// 전화번호 입력창에서 엔터 쳤을 때
		tfTel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}//end of actionPerformed
		});//end of addActionListener
		
		
	}// end of eventProc()
	
	/*
	 * 함수명		: getJuminInfo
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 주민번호를 기준으로 성별, 나이, 출신지를 구해서 텍스트필드에 출력
	 */
	public void getJuminInfo() {
		String jumin = tfId.getText();
		if(jumin.length() != 14) {
			JOptionPane.showMessageDialog(null, "- 포함한 15자를 맞춰주세요");
			return;
		}//end of if
		
		JOptionPane.showMessageDialog(null, jumin);
		
		// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력
		String gender = jumin.substring(7,8);	//서브스트링 잘라서 대입
		if(gender.equals("1") | gender.equals("3") | gender.equals("9") ) {	//값 비교
			tfGender.setText("Male");	//텍스트 필드에 텍스트 입력
		}else {
			tfGender.setText("Female");
		}// end of if~else
		
		// (2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
		String home = jumin.substring(8,9);	//서브스트링 잘라서 대입
		switch (home) {
		case "0": tfHome.setText("서울/부산");	break;	//값 비교후 텍스트 필드에 텍스트 입력
		case "1": tfHome.setText("인천/경기");	break;
		case "2": tfHome.setText("강원");	break;
		case "3": tfHome.setText("강원/충북");	break;
		case "4": tfHome.setText("대전");	break;
		case "9": tfHome.setText("제주");
		}// switch
		
		// (3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력
		Calendar cal = Calendar.getInstance();	//캘린더 필드값 불러오기
		int year = 0;
		if(gender.equals("9") | gender.equals("0")) {	//태어난 세기 계산
			year = 1800;	//태어난 세기 입력
		}
		if(gender.equals("1") | gender.equals("2")) {
			year = 1900;
		}
		if(gender.equals("3") | gender.equals("4")) {
			year = 2000;
		}// if
		
		year += Integer.parseInt(jumin.substring(0,2));	//태어난 연도 계산 (태어난 세기+태어난 연도)
		int age = cal.get(Calendar.YEAR) - year;	//나이 계산 ([캘린더 필드값]현재연도 - [year]태어난 연도)
		tfAge.setText(String.valueOf(age));	//텍스트 필드에 텍스트 입력
	}// end of getJuminInfo()
	
	/*
	 * 함수명		: clearTextField
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 텍스트 필드 값 청소
	 */
	public void clearTextField() {
		ta.setText(null);
		tfAge.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfId.setText(null);
		tfName.setText(null);
		tfTel.setText(null);
	}// end of clearTextField()
	
	/*
	 * 함수명		: inputData
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 텍스트 필드에 입력한 사용자의 값을 저장
	 */
	public void inputData() {
		PersonVO vo = new PersonVO();
		vo.setName(tfName.getText());
		vo.setGender(tfGender.getText());
		vo.setHome(tfHome.getText());
		vo.setId(tfId.getText());
		vo.setTel(tfTel.getText());
		vo.setAge(Integer.parseInt(tfAge.getText()));
		list.add(vo);
	}// end of inputData()
	
	/*
	 * 함수명		: selectAll
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 리스트에 저장한 데이터를 모두 텍스트 에어리어에 출력
	 */
	public void selectAll() {
		ta.setText("==========전체 목록==========\n\n");
		for (PersonVO vo : list) {
			ta.append(vo.toString());
		}
	}// end of selectAll()
	
	/*
	 * 함수명		: selectByTel
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 전화번호 값을 비교하여 데이터 불러오기
	 */
	public void selectByTel() {
		String tel = tfTel.getText();
		// 입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지창을 출력
		if(tel.equals(null) | tel.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요.");
			return;
		}// if
		// 리스트에 저장된 PersonVO의 전화번호와 비교하여
		// 해당 전화번호가 있으면 그 내용을 각각의 텍스트필드에 출력
		for (PersonVO vo : list) {
			if(tel.equals(vo.getTel())) {
				tfName.setText(vo.getName());
				tfGender.setText(vo.getGender());
				tfHome.setText(vo.getHome());
				tfTel.setText(vo.getTel());
				tfId.setText(vo.getId());
				tfAge.setText(String.valueOf(vo.getAge()));
			}// if
		}// for each
	}// end of selectByTel()
	
	/*
	 * 함수명		: deleteByTel
	 * 인자		: 없음
	 * 리턴값		: void
	 * 역할		: 전화번호 값을 비교하여 리스트에서 삭제
	 */
	public void deleteByTel() {
		String tel = tfTel.getText();
		// 입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지창을 출력
		if(tel.equals(null) | tel.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요.");
			return;
		}// if
		// 리스트에 저장된 PersonVO의 전화번호와 비교하여
		// 해당 전화번호가 있으면 리스트에서 삭제
		// [참고] 삭제하고 나서 break로 반복문 끝내기
		for (PersonVO vo : list) {
			if(tel.equals(vo.getTel())) {
				list.remove(vo);
				break;
			}// if
		}// for each
	}// end of deleteByTel()
	
	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
		
	}

}
