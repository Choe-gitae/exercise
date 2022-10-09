package e_tabbedpane.copy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("패널 A");
	JButton aBtn = new JButton("A 버튼");
	
	public PanelA() {
		setBackground(new Color(255, 0, 0));
		addLayout();
		eventProc();
	}
	
	public void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	public void eventProc() {
		
	}
}