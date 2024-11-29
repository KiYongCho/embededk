package javabasic.exgui;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

// Level 2 : UI 변경

public class ExMemopad2 extends JFrame {
    // 메모 데이터를 저장하는 리스트
    private final DefaultListModel<String> memoListModel;
    private final JList<String> memoList;
    private final JTextArea memoTextArea;

    public ExMemopad2() {

    	setTitle(":: Java Notepad ::");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // 메뉴
        JMenuBar jMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu infoMenu = new JMenu("정보");
        JMenuItem fileMenuItemNew = new JMenuItem("새메모");
        JMenuItem fileMenuItemOpen = new JMenuItem("열기");
        JMenuItem fileMenuItemSave = new JMenuItem("저장");
        fileMenu.add(fileMenuItemNew);
        fileMenu.add(fileMenuItemOpen);
        fileMenu.add(fileMenuItemSave);
        jMenuBar.add(fileMenu);
        jMenuBar.add(infoMenu);
        
        JFrame jframe = this;
        
        infoMenu.addMenuListener(new MenuListener() {
			@Override
			public void menuSelected(MenuEvent e) {
				JLabel message = new JLabel("Copyright 2024 홍길동");
				message.setHorizontalAlignment(SwingConstants.CENTER);
				JOptionPane.showMessageDialog(jframe, message);
			}
			@Override
			public void menuDeselected(MenuEvent e) {
			}
			@Override
			public void menuCanceled(MenuEvent e) {
			}
		});
        
        fileMenuItemNew.addActionListener(e -> {
        	JOptionPane.showInputDialog(jframe, "파일명을 입력해 주세요!", "새파일", 
        			JOptionPane.INFORMATION_MESSAGE);
        });
        
        fileMenuItemOpen.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("json", "json");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(jframe);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
               System.out.println(chooser.getSelectedFile().getName());
            }        	
        });
        
        fileMenuItemSave.addActionListener(e -> {
        	JOptionPane.showMessageDialog(jframe, "저장 완료!", "저장 완료", 
        			JOptionPane.INFORMATION_MESSAGE);
        });

        memoListModel = new DefaultListModel<>();
        memoList = new JList<>(memoListModel);
        memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(memoList);

        memoTextArea = new JTextArea();
        JScrollPane textScrollPane = new JScrollPane(memoTextArea);
        
        JPanel centerPanel = new JPanel(new BorderLayout());
        JTextField tfSubject = new JTextField();
        centerPanel.add(tfSubject, BorderLayout.NORTH);
        centerPanel.add(textScrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("메모 등록");
        JButton editButton = new JButton("메모 수정");
        JButton deleteButton = new JButton("메모 삭제");

        addButtons(buttonPanel, addButton, editButton, deleteButton);

        addActionListener(addButton, editButton, deleteButton);
        
        memoList.addListSelectionListener(e -> displaySelectedMemo());

        // 프레임에 구성요소 추가
        add(jMenuBar, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(listScrollPane, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // 메모 등록 메서드
    private void addMemo() {
        String newMemo = memoTextArea.getText().trim();
        if (!newMemo.isEmpty()) {
            memoListModel.addElement(newMemo);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 등록되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
        }
    }

    // 메모 수정 메서드
    private void editMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            String updatedMemo = memoTextArea.getText().trim();
            if (!updatedMemo.isEmpty()) {
                memoListModel.set(selectedIndex, updatedMemo);
                JOptionPane.showMessageDialog(this, "메모가 수정되었습니다.");
            } else {
                JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "수정할 메모를 선택하세요.");
        }
    }

    // 메모 삭제 메서드
    private void deleteMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoListModel.remove(selectedIndex);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 삭제되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "삭제할 메모를 선택하세요.");
        }
    }

    // 선택된 메모를 텍스트 영역에 표시
    private void displaySelectedMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoTextArea.setText(memoListModel.get(selectedIndex));
        }
    }
    
    // 리스너 등록
    // e : 발생한 이벤트객체
    // e.getSource() : 이벤트를 발생시킨 객체 = 이벤트 타겟 객체 = 이벤트 소스 객체
    // 버튼에 쓰여있는 글자에 따라 다른 메소드를 호출
    private void addActionListener(JButton... jbuttons) {
    	for (JButton jbutton : jbuttons) {
	    	jbutton.addActionListener(e -> {
	    		switch (((JButton)e.getSource()).getText()) {
	    			case "메모 등록" : addMemo(); break;  
	    			case "메모 수정" : editMemo(); break;  
	    			case "메모 삭제" :  deleteMemo();
	    		}
	    	});
    	}
    }
    
    // 패널에 버튼 추가
    private void addButtons(JPanel jpanel, JButton... jbuttons) {
    	for (JButton jbutton : jbuttons) {
    		jpanel.add(jbutton);
    	}
    }

    public static void main(String[] args) {
        // 프로그램 실행
        SwingUtilities.invokeLater(ExMemopad2::new);
    }
    
}






