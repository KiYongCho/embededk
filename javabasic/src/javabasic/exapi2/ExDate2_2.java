package javabasic.exapi2;

import java.util.Calendar;

// 시계

public class ExDate2_2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		while (true) {
			try {
				// System.currentTimeMillis() : 시스템의 현재시간을 UNIX TIME으로 가져옴
				cal.setTimeInMillis(System.currentTimeMillis());
				System.out.println(
						(cal.get(Calendar.MONTH)+1) + "월 "
						+ cal.get(Calendar.DATE) + "일 "
						+ (cal.get(Calendar.AM_PM)==0 ? "오전" : "오후") + " "
						+ cal.get(Calendar.HOUR) + "시 "
						+ cal.get(Calendar.MINUTE) + "분 "
						+ cal.get(Calendar.SECOND) + "초 "
						//+ cal.get(Calendar.MILLISECOND) + "밀리초 "	
				);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	} // main

} // class




















