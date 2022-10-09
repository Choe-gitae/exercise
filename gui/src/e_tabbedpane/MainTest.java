package e_tabbedpane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MainTest {

	JFrame f;
	JButton btn;
	JLabel la;
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	
	public MainTest() {
		f = new JFrame("창1");
		btn = new JButton("확인");
		la = new JLabel("데이타");
		panelA = new PanelA(this);
		panelB = new PanelB();
		panelC = new PanelC();
	}
	
	public void addLayout() {
		// 레이아웃 지정
		f.setLayout(new BorderLayout());
		f.add(btn, BorderLayout.EAST);
		f.add(la, BorderLayout.SOUTH);
		
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
	
	public void eventProc() {
		// 확인을 눌렀을 때 PanelA의 글자 교체
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelA.aLa.setText("Welcome");
			}
		});
		
	}
	
	
	public static void main(String[] args) {

		MainTest test = new MainTest();
		test.addLayout();
		test.eventProc();
		
	}

}
