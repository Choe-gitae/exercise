package kiosk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelA extends JPanel{
	
	JButton[] btn = new JButton[4];
	MainTest parent;
	
	public PanelA(MainTest maintest) {
		parent = maintest;
		btn[0] = new JButton("김밥");
		btn[1] = new JButton("떡볶이");
		btn[2] = new JButton("비빔밥");
		btn[3] = new JButton("소주");
		addLayout();
		eventProc();
	}
	
	public void addLayout() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(2,2));
		for (int i = 0; i < btn.length; i++) {
			add(btn[i]);
			btn[i].setPreferredSize(new Dimension(120,120));
			btn[i].setVerticalTextPosition(JButton.BOTTOM);
			btn[i].setHorizontalTextPosition(JButton.CENTER);
			btn[i].setBackground(Color.WHITE);;
		}
		btn[0].setIcon(new ImageIcon("src\\kiosk\\imgs\\김밥.PNG"));
		btn[1].setIcon(new ImageIcon("src\\kiosk\\imgs\\떡볶이.PNG"));
		btn[2].setIcon(new ImageIcon("src\\kiosk\\imgs\\비빔밥.PNG"));
		btn[3].setIcon(new ImageIcon("src\\kiosk\\imgs\\소주.PNG"));
	}
	
	public void eventProc() {
		for(int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton eBtn = (JButton)e.getSource();
					String str = eBtn.getText();
					parent.ta.append(str+"\n");
				}// end of actionPerformed()
			});// end of addActionListener()
		}// for
	}
}