package e_tabbedpane.copy;

import java.awt.*;
import javax.swing.*;

public class MainTest {

	JFrame f;
	JButton b;
	JLabel l;
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	
	public MainTest() {
		f = new JFrame("창1");
		b = new JButton("확인");
		l = new JLabel("데이타");
		panelA = new PanelA();
		panelB = new PanelB();
		panelC = new PanelC();
	}
	
	public void addLayout() {
		// 레이아웃 지정
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.EAST);
		f.add(l, BorderLayout.SOUTH);
		
		// 탭 생성 및 세팅
			JTabbedPane tap = new JTabbedPane();
			tap.addTab("메인", panelA);
			tap.addTab("서브", panelB);
			tap.addTab("기타", panelC);
		f.add(tap, BorderLayout.CENTER);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		MainTest test = new MainTest();
		test.addLayout();
		
	}

}
