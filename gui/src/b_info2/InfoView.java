package b_info2;


import java.awt.*;
import javax.swing.*;

public class InfoView {
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancle, bExit;
	
	InfoView() {
		f = new JFrame();
		tfName = new JTextField(20); tfId = new JTextField(); tfTel = new JTextField();
		tfGender = new JTextField(); tfAge = new JTextField(); tfHome = new JTextField();
		ta = new JTextArea(40, 20);
		bAdd = new JButton("Add"); bShow = new JButton("Show"); bSearch = new JButton("Search");
		bDelete = new JButton("Delete"); bCancle = new JButton("Cancle"); bExit = new JButton("Exit");
	}
	
	public void addLayout() {
		// 레이아웃 BorderLayout
		//	- WEST		: JPANEL (GridLayout(6,2))
		//	- CENTER	: JTextArea
		//	- SOUTH		: JPANEL (GridLayout(1,6))
		
		//레이아웃 지정
		f.setLayout(new BorderLayout());
			JPanel pWest = new JPanel();
			pWest.setLayout(new GridLayout(6, 2));	//JPanel GridLayout 레이아웃 설정 (행열 레이아웃)
			pWest.add(new JLabel("Name", JLabel.CENTER));	//가운데 정렬
			pWest.add(tfName);
			pWest.add(new JLabel("ID", JLabel.CENTER));
			pWest.add(tfId);
			pWest.add(new JLabel("Tel", JLabel.CENTER));
			pWest.add(tfTel);
			pWest.add(new JLabel("Sex", JLabel.CENTER));
			pWest.add(tfGender);
			pWest.add(new JLabel("Age", JLabel.CENTER));
			pWest.add(tfAge);
			pWest.add(new JLabel("Home", JLabel.CENTER));
			pWest.add(tfHome);
		f.add(pWest, BorderLayout.WEST);	//West 패널 add
		f.add(ta, BorderLayout.CENTER);		//JTextArea center add
			JPanel pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(1, 6));	// JPanel GridLayout 레이아웃 설정 (행열 레이아웃)
			pSouth.setPreferredSize(new Dimension(100, 50));	//크기 재지정 //우선권 먼저주기
			pSouth.add(bAdd);
			pSouth.add(bShow);
			pSouth.add(bSearch);
			pSouth.add(bDelete);
			pSouth.add(bCancle);
			pSouth.add(bExit);
		f.add(pSouth, BorderLayout.SOUTH);	//South 패널 add
		//화면 출력
		f.setBounds(100, 100, 800, 400);	//창크기 지정
		f.setVisible(true);	//출력 트루
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 버튼 활성화
	}
	
	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		
	}

}
