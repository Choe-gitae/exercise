package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MainTest {

	JFrame f;
	JTextArea ta;
	PanelA panelA;
	PanelB panelB;
//	PanelC panelC;
//	PanelD panelD;
	
	public MainTest() {
		f = new JFrame("창1");
		ta = new JTextArea();
		panelA = new PanelA(this);
		panelB = new PanelB(this);
//		panelC = new PanelC();
//		panelD = new PanelD();
	}
	
	public void addLayout() {
		// 레이아웃 지정
		f.setLayout(new BorderLayout(1,2));
		ta.setPreferredSize(new Dimension(210,300));
		f.add(ta, BorderLayout.WEST);
		// 탭 생성 및 세팅
			JTabbedPane tap = new JTabbedPane();
			tap.addTab("한식", panelA);
			tap.addTab("양식", panelB);
//			tap.addTab("기타", panelC);
		f.add(tap, BorderLayout.EAST);
		
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
