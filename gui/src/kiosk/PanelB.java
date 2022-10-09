package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PanelB extends JPanel{
	
	// 1. 멤버변수선언
	JFrame f;
	JTextArea ta;
	JButton m1, m2, m3, m4;
	MainTest parent;
	
	// 2. 멤버 변수 객체생성
	PanelB(MainTest maintest) {
		parent = maintest;
		f = new JFrame("Kiosk");
		m1 = new JButton("Burger");
		m2 = new JButton("Steak");
		m3 = new JButton("Pasta");
		m4 = new JButton("Beer");
		addLayout();
		eventProc();
	}
	
	// 3. 화면구성하고 출력
	/*
	 * 전체 프래임 BorderLayout 지정
	 * 		-West	: JPanel 붙이기 (GridLayout (6,2))  
	 * 		-Center	: TextArea
	 * 		-South	: JPanel 붙이기 (GridLayout (1,6))
	 */
	public void addLayout () {
		
		//레이아웃 생성
		f.setLayout(new BorderLayout());
		setLayout(new GridLayout(2, 2));
		
		add(m1);
		add(m2);
		add(m3);
		add(m4);
		
		//첫번째 이미지
		m1.setIcon(new ImageIcon("src\\kiosk\\imgs\\햄버거.png"));
		m1.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m1.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//두번째 이미지
		m2.setIcon(new ImageIcon("src\\kiosk\\imgs\\스테이크.png"));
		m2.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m2.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//세번째 이미지
		m3.setIcon(new ImageIcon("src\\kiosk\\imgs\\파스타.png"));
		m3.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m3.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//네번재 이미지
		m4.setIcon(new ImageIcon("src\\kiosk\\imgs\\맥주.png"));
		m4.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m4.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
	}

	public void eventProc() {
		m1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parent.ta.append(m1.getText()+"\n");
			}
		});
		m2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parent.ta.append(m2.getText()+"\n");
			}
		});
		m3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parent.ta.append(m3.getText()+"\n");
			}
		});
		m4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parent.ta.append(m4.getText()+"\n");
			}
		});
		
	
	}		//end of eventProc
	

	
	
	

}
