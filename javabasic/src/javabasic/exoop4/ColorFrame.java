package javabasic.exoop4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrame extends JFrame {
	
	JFrame jFrame;
	JPanel jPanel;
	JPanel jBtnPanel;
	JButton redButton;
	JButton blueButton;
	JButton orangeButton;
	
	public ColorFrame() {
		init();
	}
	
	void init() {
		jFrame = new JFrame("배경색 변경 프로그램");
		jFrame.setLayout(new BorderLayout());
		jFrame.setBounds(100, 100, 400, 400);
		
		jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		jBtnPanel = new JPanel();
		
		redButton = new JButton("RED");
		blueButton = new JButton("BLUE");
		orangeButton = new JButton("ORANGE");
		
		addListener(redButton, jPanel, Color.RED);
		addListener(blueButton, jPanel, Color.BLUE);
		addListener(orangeButton, jPanel, Color.ORANGE);
		
		jBtnPanel.add(redButton);
		jBtnPanel.add(blueButton);
		jBtnPanel.add(orangeButton);
		jPanel.add(jBtnPanel, BorderLayout.SOUTH);
		jFrame.add(jPanel, BorderLayout.CENTER);
		
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setVisible(true);
	}
	
	public static void addListener(JButton jButton, JPanel jPanel, Color color) {
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jPanel.setBackground(color);
			}
		});		
	}
	
	public static void main(String[] args) {
		new ColorFrame();
	}

} // class















