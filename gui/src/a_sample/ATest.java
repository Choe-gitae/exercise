package a_sample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

/*
 * 자바의 GUI (화면)
 * - AWT : 1.2 이전
 * - Swing : 1.2 이후
 * 		클래스 앞 J가 붙어있다
 */

public class ATest {

	JFrame f;
	JButton b, bCancle;
	JCheckBox cbJava, cbOracle;
	JRadioButton rbMale, rbFemale;
	JTextField tf;
	JTextArea ta;
	
	ATest(){
		f = new JFrame("나의 첫 창");
		b = new JButton("클릭");
		bCancle = new JButton("취소");
		cbJava = new JCheckBox("Java");
		cbOracle = new JCheckBox("Oracle");
		rbMale = new JRadioButton("남자");
		rbFemale = new JRadioButton("여자");
		tf = new JTextField(20);
		ta = new JTextArea(40, 20);
		//버튼 그룹화
		ButtonGroup group = new ButtonGroup();
		group.add(rbMale);
		group.add(rbFemale);
	}
	
	void addLayout() {
		//레이아웃 변경 (모양 변경)
//		f.setLayout(new FlowLayout());	// 이어진 레이아웃
//		f.setLayout(new GridLayout(5, 2));	// 행열 레이아웃
		f.setLayout(new BorderLayout());	// 동/서/남/북/가운데 레이아웃
		//버튼 붙이기
		f.add(b, BorderLayout.NORTH);
		f.add(bCancle, BorderLayout.SOUTH);
//		f.add(cbJava);
//		f.add(cbOracle);
			//패널 생성
			JPanel pEast = new JPanel();
			pEast.add(rbMale);
			pEast.add(rbFemale);
		f.add(pEast, BorderLayout.EAST);
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);
//		f.add(tf, BorderLayout.EAST);
		f.add(ta, BorderLayout.CENTER);
		//화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		ATest a = new ATest();
		a.addLayout();
		
	}

}
