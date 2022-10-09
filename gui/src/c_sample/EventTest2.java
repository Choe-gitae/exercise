package c_sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventTest2 {
		JFrame f;
		JButton b1;
		
		public EventTest2() {
			f = new JFrame("테스트창");
			b1 = new JButton("버튼1");	
			
			// (2) 핸들러 객체 생성
			// (3) 이벤트 발생할 컴포넌트와 연결
			b1.addActionListener(new MyHandler());
		}
		
		// (1) 이벤트 핸들러 만들기
		//		핸들러 - 이벤트 처리 클래스
		class MyHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트 발생2");
			}
			
		}
		
		public void addLayout() {
			//레이아웃 설정
			f.setLayout(new FlowLayout());
			f.add(b1);
			
			//화면 출력
			f.setBounds(100, 100, 800, 400);	//창크기 지정
			f.setVisible(true);	//출력 트루
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
		}
	
	public static void main(String[] args) {
		EventTest2 f = new EventTest2();
		f.addLayout();
	}

}
