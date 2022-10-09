package e_tabbedpane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("패널 A");
	JButton aBtn = new JButton("A 버튼");
	MainTest parent;
	
	public PanelA(MainTest maintest) {
		parent = maintest;
		setBackground(new Color(255, 0, 0));
		addLayout();
		eventProc();
	}
	
	public void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	public void eventProc() {
		aBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				parent.la.setText("반갑구먼 반가워");
			}
		});// end of addActionListener
	}
}