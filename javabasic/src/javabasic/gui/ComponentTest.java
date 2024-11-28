package javabasic.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ComponentTest {
	
	public static void main(String[] args) {
		
		// "Component"라는 타이틀을 가진 JFrame 생성
		JFrame frame = new JFrame("Component");
		
		// X버튼 누르면 닫히도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JFrame 사이즈
		frame.setSize(600, 400);
		
		// 탭패널 생성
		JTabbedPane tabbedPane = new JTabbedPane();
		
		// 버튼 패널
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(new JButton("일반버튼"));
		buttonPanel.add(new JToggleButton("토글버튼"));
		buttonPanel.add(new JCheckBox("체크박스"));
		buttonPanel.add(new JRadioButton("라디오버튼"));
		tabbedPane.addTab("버튼", buttonPanel);
		
		// 텍스트 입력 탭
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(3, 1));
		textPanel.add(new JTextField("텍스트필드"));
		textPanel.add(new JPasswordField("패스워드필드"));
		textPanel.add(new JTextArea("텍스트에어리어"));
		tabbedPane.addTab("텍스트입력", textPanel);
		
		// 리스트, 테이블 탭
		JPanel listPanel = new JPanel();
		String[] items = {"항목1", "항목2", "항목3", "항목4"};
		listPanel.add(new JList<String>(items));
		listPanel.add(new JComboBox<String>(items));
		String[][] data = {
			{"1", "홍길동", "20"},
			{"2", "강감찬", "30"},
			{"3", "이순신", "40"}
		};
		String[] columns = {"번호", "이름", "나이"};
		listPanel.add(new JScrollPane(new JTable(data, columns)));
		tabbedPane.addTab("리스트&테이블", listPanel);
		
		// 메뉴 탭
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("파일");
		menu.add(new JMenuItem("열기"));
		menu.add(new JMenuItem("저장"));
		menu.addSeparator();
		menu.add(new JMenuItem("종료"));
		menuBar.add(menu);
	
		// 기타 컴포넌트 탭
		JPanel miscPanel = new JPanel();
		miscPanel.add(new JLabel("라벨"));
		miscPanel.add(new JSlider(0, 100, 50));
		miscPanel.add(new JProgressBar(0, 100));
		miscPanel.add(new JScrollPane(new JTextArea("스크롤가능한 JTextArea", 3, 20)));
		tabbedPane.addTab("기타", miscPanel);
		
		// JFrame에 JMenuBar 설정
		frame.setJMenuBar(menuBar);

		// 탭패널을 JFrame에 추가
		frame.add(tabbedPane);
		
		// JFrame 화면에 보이기
		frame.setVisible(true);
		
	}

} // class




























