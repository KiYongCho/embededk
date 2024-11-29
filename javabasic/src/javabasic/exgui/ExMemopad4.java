package javabasic.exgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javabasic.gson.Post;

//Level 4 : 파일 처리

public class ExMemopad4 extends JFrame {
	
    // 메모 데이터를 저장하는 리스트
    private DefaultListModel<Memo> memoListModel;
    private JList<Memo> memoList;
    private JTextArea memoTextArea;
    private JTextField tfSubject;
    private File file;

    public ExMemopad4() {

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
        fileMenuItemSave.setEnabled(false);
        jMenuBar.add(fileMenu);
        jMenuBar.add(infoMenu);
        
        JPanel jNorthPanel = new JPanel(new BorderLayout());
        ImageIcon logo = new ImageIcon("D:\\embededk\\files\\logo.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setIcon(logo);
        jNorthPanel.add(imageLabel, BorderLayout.NORTH);
        jNorthPanel.add(jMenuBar, BorderLayout.SOUTH);
        
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
        	String newFileName = JOptionPane.showInputDialog(jframe, "파일명(.json)을 입력해 주세요!", "새파일", 
        			JOptionPane.INFORMATION_MESSAGE);
        	if (newFileName!=null && !newFileName.trim().isEmpty()) {
        		file = new File("D:\\embededk\\files\\"+newFileName);
        		try {
        			file.createNewFile();
        		} catch (IOException ioe) {
        			ioe.printStackTrace();
        		}
        		fileMenuItemSave.setEnabled(true);
                tfSubject.setText("");
                memoTextArea.setText("");
        	}
        });
        
        fileMenuItemOpen.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter 
            	= new FileNameExtensionFilter("json", "json");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(jframe);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
               file = new File("D:\\embededk\\files\\" 
            		   + chooser.getSelectedFile().getName());
               BufferedReader br = null;
               try {
            	   br = new BufferedReader(new FileReader(file));
            	   String jsonStr = "";
            	   String line = "";
            	   while((line=br.readLine()) != null) {
            		   jsonStr += line;
            	   }
            	   Gson gson = new GsonBuilder().create();
             	   memoListModel = new DefaultListModel<Memo>();
            	   memoListModel.addAll(
            			   gson.fromJson(
            					   jsonStr, 
            					   new TypeToken<List<Memo>>() {}.getType()
            			   )
            	   );
            	   memoList.setModel(memoListModel);
               } catch (IOException ioe) {
            	   ioe.printStackTrace();
               }
            }        	
        });
        
        fileMenuItemSave.addActionListener(e -> {
        	Object[] memoArr = memoListModel.toArray();
        	Gson gson = new GsonBuilder().create();
        	PrintWriter pw = null;
        	try {
        		pw = new PrintWriter(new FileWriter(file), true);
        		pw.print(gson.toJson(memoArr));
        		pw.flush();
        	} catch (FileNotFoundException fnfe) {
        		fnfe.printStackTrace();
        	} catch (IOException ioe) {
        		ioe.printStackTrace();
        	}
        	JOptionPane.showMessageDialog(jframe, "저장 완료!", "저장 완료", 
        			JOptionPane.INFORMATION_MESSAGE);
        });

        memoListModel = new DefaultListModel<Memo>();
        memoList = new JList<Memo>(memoListModel);
        memoList.setPreferredSize(new Dimension(250, 600));
        memoList.setBackground(Color.GRAY);
        memoList.setFont(new Font("굴림", Font.BOLD, 20));
        memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(memoList);

        memoTextArea = new JTextArea();
        memoTextArea.setBackground(Color.BLACK);
        memoTextArea.setForeground(Color.WHITE);
        memoTextArea.setFont(new Font("굴림", Font.BOLD, 20));        
        JScrollPane textScrollPane = new JScrollPane(memoTextArea);
        
        JPanel centerPanel = new JPanel(new BorderLayout());
        tfSubject = new JTextField();
        tfSubject.setBackground(Color.BLACK);
        tfSubject.setForeground(Color.WHITE);
        tfSubject.setFont(new Font("굴림", Font.BOLD, 20));
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
        add(jNorthPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(listScrollPane, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
        
        // 프로그램 시작시에 새파일 다이얼로그 열기
        this.addWindowListener(new WindowAdapter() {
        	public void windowOpened(java.awt.event.WindowEvent e) {
        		fileMenuItemNew.doClick();	// 클릭 이벤트 강제 발생
        	};
		});
        
    } // constructor

    // 메모 등록 메서드
    private void addMemo() {
    	Memo newMemo 
    		= new Memo(memoListModel.getSize(), 
    				tfSubject.getText().trim(), memoTextArea.getText().trim());
        if (!tfSubject.getText().isEmpty()
        		&& !memoTextArea.getText().isEmpty()) {
            memoListModel.addElement(newMemo);
            tfSubject.setText("");
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 등록되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "메모 제목과 내용을 입력하세요.");
        }
    }

    // 메모 수정 메서드
    private void editMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
        	Memo updatedMemo = new Memo(
        			memoList.getSelectedIndex(),
        			tfSubject.getText().trim(),
        			memoTextArea.getText().trim()
        	);
            if (!tfSubject.getText().isEmpty()
            		&& !memoTextArea.getText().isEmpty()) {
                memoListModel.set(selectedIndex, updatedMemo);
                JOptionPane.showMessageDialog(this, "메모가 수정되었습니다.");
            } else {
                JOptionPane.showMessageDialog(this, "메모 제목과 내용을 입력하세요.");
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
            tfSubject.setText("");
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
        	tfSubject.setText(memoListModel.get(selectedIndex).getSubject());
            memoTextArea.setText(memoListModel.get(selectedIndex).getContent());
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
        SwingUtilities.invokeLater(ExMemopad4::new);
    }
    
}






