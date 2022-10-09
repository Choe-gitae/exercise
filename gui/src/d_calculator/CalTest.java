package d_calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalTest {

	// 1. 멤버변수 선언
	JFrame f;
	JTextField[] tf = new JTextField[3];
	JButton[] bNum = new JButton[10];	// 0 ~ 9 숫자 표현 버튼
	JButton[] bOp = new JButton[4];	// + - * /  연산자 표현 버튼
	JButton bEqual;
	JButton bInit;
	
	double num, result;
	String oper;
	boolean calculation, firstCal;
	
	// 2. 객체 생성
	CalTest() {
		f = new JFrame("계산기");
		//텍스트 필드 5개 생성
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new JTextField(20);
		}// for
		bEqual = new JButton("=");
		//숫자 버튼 10개 생성
		for (int i = 0; i < bNum.length; i++) {
			bNum[i] = new JButton(String.valueOf(i));
		}// for
		//연산자 버튼 4개 생성
		bOp[0] = new JButton("+");
		bOp[1] = new JButton("-");
		bOp[2] = new JButton("*");
		bOp[3] = new JButton("/");
		bInit = new JButton("C");
		
		firstCal = true;
		
	}// end of CalTest()
	
	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		// 레이아웃 BorderLayout
		f.setLayout(new BorderLayout());
		
		// 텍스트 필드 추가
		for (int i = tf.length-1; i >= 0 ; i--) {	// 텍스트 필드 크기 지정
			tf[i].setPreferredSize(new Dimension(300, 50));
		}// for
		JPanel pNorth = new JPanel();	// 패널 생성
		pNorth.setLayout(new GridLayout(3,1));	// 패널 레이아웃 지정
		for (int i = tf.length-1; i >= 0 ; i--) {	// 
			pNorth.add(tf[i]);
		}
		f.add(pNorth, BorderLayout.NORTH);	//텍스트 필드 추가
		
		//숫자판 패널 만들기 및 추가
			JPanel pCenter = new JPanel();
			pCenter.setLayout(new GridLayout(5, 3));
			for (int i = 1; i < bNum.length; i++) {
				pCenter.add(bNum[i]);
			}// for
			pCenter.add(bOp[0]);
			pCenter.add(bNum[0]);
			pCenter.add(bEqual);
			for (int i = 1; i < bOp.length; i++) {
				pCenter.add(bOp[i]);
			}// for
		f.add(pCenter, BorderLayout.CENTER);	//숫자판 패널 추가
		f.add(bInit, BorderLayout.SOUTH);
		bInit.setPreferredSize(new Dimension(100, 50));
		
		//화면 출력
		f.setBounds(100, 100, 300, 500);	//창크기 지정
		f.setVisible(true);	//출력 트루
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
		
	}// end of addLayout()
	
	// 4. 이벤트 처리
	void eventProc() {
		// 숫자 버튼 눌렀을 때
		for(int i = 0; i < bNum.length; i++) {
			bNum[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어온다.
					JButton eBtn = (JButton)e.getSource();
					if(calculation) {
						tf[0].setText(null);
						calculation = false;
					}
					String su = tf[0].getText()+eBtn.getText();
					tf[0].setText(su);
				}// end of actionPerformed()
			});// end of addActionListener()
		}// for


		// 연산자 버튼 눌렀을 때
		for(int i = 0; i < bOp.length; i++) {
			bOp[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어온다.
					JButton eBtn = (JButton)e.getSource();
					oper = eBtn.getText();
					arithmetic();
					tf[1].setText(String.valueOf(result) + oper);
				}// end of actionPerformed()
			});// end of addActionListener()
		}// for
		
		// Equal 버튼 눌렀을 때
		bEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf[1].setText( tf[1].getText() + tf[0].getText() + "=");
				arithmetic();
			}// end of actionPerformed()
		});// end of addActionListener()
		
		// C 버튼 눌렀을 때
		bInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < tf.length; i++) {
					num = 0;
					result = 0;
					firstCal = true;
					tf[i].setText(null);
				}
			}// end of actionPerformed()
		});// end of addActionListener()
		
	}// end of eventProc()
	
	// 5. 연산 처리	// 미완성 // 연산이 2개 필요한가?
	void arithmetic() {
		calculation = true;
		if(firstCal) {
			result = Double.parseDouble(tf[0].getText());
			firstCal = false;
			return;
		}
		num = Double.parseDouble(tf[0].getText());
		switch(oper) {
		case "+" : result += num; break;
		case "-" : result -= num; break;
		case "*" : 
			if(result == 0) {
				break;
			}else {
				result *= num; break;
			}// if else
		case "/" :
			if(num == 0) {	// 0으로 나눌 경우	// 안나온다
				tf[0].setText("0으로 나눌 수 없습니다."); 
				num = 0;
				result = 0;
				return;
			}else {
				result /= num; break;
			}// if else
		}// switch
		tf[0].setText(String.valueOf(result));
	}// end of arithmetic()
	
	
	public static void main(String[] args) {

		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
		
	}// end of main()

}
