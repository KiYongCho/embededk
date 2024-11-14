package javabasic.exapi2;

import java.util.Calendar;
import java.util.TimeZone;

public class ExDate1 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Seoul")); // 한국
		 printDate("한국", cal);
		
		cal.setTimeZone(TimeZone.getTimeZone("Europe/London")); // 영국
		printDate("영국", cal);
		
		cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); // 미국
		printDate("미국", cal);
		
		cal.setTimeZone(TimeZone.getTimeZone("Australia/Sydney")); // 호주
		printDate("호주", cal);
		
	} // main
	
	public static void printDate(String name, Calendar cal) {
		System.out.println(
				name + "은 지금 " + cal.get(Calendar.YEAR) + "년 " 
				+ (cal.get(Calendar.MONTH)+1) + "월 "
				+ cal.get(Calendar.DAY_OF_MONTH) + "일 "
				+ (cal.get(Calendar.AM_PM)==0 ? "오전 " : "오후 ")
				+ cal.get(Calendar.HOUR) + "시 "
				+ cal.get(Calendar.MINUTE) + "분 "
				+ cal.get(Calendar.SECOND) + "초 입니다!"
		);		
	}

} // class





