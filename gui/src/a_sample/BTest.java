package a_sample;

import java.awt.FlowLayout;
import javax.swing.*;

public class BTest extends JFrame{

	JButton b, bCancle;
	JCheckBox cbJava, cbOracle;
	JRadioButton rbMale, rbFemale;
	JTextField tf;
	JTextArea ta;
	
	BTest(){
		super("나의 두번째 창");
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
		//레이아웃 변경
		setLayout(new FlowLayout());
		//버튼 붙이기
		add(b);
		add(bCancle);
		add(cbJava);
		add(cbOracle);
		add(rbMale);
		add(rbFemale);
		add(new JLabel("입력하세요"));
		add(tf);
		add(ta);
		//화면 출력
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {

		BTest b = new BTest();
		b.addLayout();
		
	}

}
