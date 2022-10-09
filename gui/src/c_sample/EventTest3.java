package c_sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventTest3 extends JFrame{
		JButton b1;	//버튼1
		
		public EventTest3() {
			super("테스트창");
			b1 = new JButton("버튼1");
			
			// (1) 이벤트 핸들러 만들기
			//		핸들러 - 이벤트 처리 클래스
			// (2) 핸들러 객체 생성
			// (3) 이벤트 발생할 컴포넌트와 연결
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생3");
				}
			} );
		}//생성자
		
		public void addLayout() {
			//레이아웃 설정
			setLayout(new FlowLayout());
			add(b1);
			
			//화면 출력
			setBounds(700, 300, 400, 400);	//창크기 지정
			setVisible(true);	//출력 트루
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
		}//메소드
	
	public static void main(String[] args) {
		
		EventTest3 test = new EventTest3();
		test.addLayout();
		
	}//메인

}
