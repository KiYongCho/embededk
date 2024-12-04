package javabasic.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMoveTest extends JFrame {
	
	JPanel jpanel;
	List<Point> pointList;
	
	public void init() {
		
		jpanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        setBackground(Color.WHITE); // 배경 색상
		        g.setColor(Color.BLUE); // 점 색상
		        for (Point p : pointList) {
		            g.fillOval(p.x - 5, p.y - 5, 10, 10); // 점의 크기 및 위치
		        }
			}
		};
		
		pointList = new ArrayList<Point>();		
		
		jpanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getPoint()); // 위치 출력
				pointList.add(e.getPoint()); // 위치 추가
                jpanel.repaint(); // 화면 갱신
			}
		});		
		
		this.add(jpanel);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 600, 600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseMoveTest().init();
	}

} // class
