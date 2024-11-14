package javabasic.oop;

import java.util.Calendar;
import java.util.TimeZone;

// java.util.Calendar
// 날짜/시간 연산 및 처리에 사용되는 클래스

public class CalendarTest {
	
	public static void main(String[] args) {
		
		// Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		// java.util.GregorianCalendar[time=1731552073747,
		//areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		//zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		//offset=32400000,dstSavings=0,useDaylight=false,
		//transitions=30,lastRule=null],firstDayOfWeek=1,
		//minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,
		//MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,
		//DAY_OF_MONTH=14,DAY_OF_YEAR=319,DAY_OF_WEEK=5,
		//DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,
		//HOUR_OF_DAY=11,MINUTE=41,SECOND=13,
		//MILLISECOND=747,ZONE_OFFSET=32400000,
		//DST_OFFSET=0]
		System.out.println(cal);
		System.out.println(cal.getTimeZone());
		
		// 영국 시간대로 변경
		TimeZone gb = TimeZone.getTimeZone("Europe/London"); 
		cal.setTimeZone(gb);
		System.out.println(cal.getTimeZone());
		
		System.out.println(
				"영국은 지금 " + cal.get(Calendar.YEAR) + "년 " 
				+ (cal.get(Calendar.MONTH)+1) + "월 "
				+ cal.get(Calendar.DAY_OF_MONTH) + "일 "
				+ (cal.get(Calendar.AM_PM)==0 ? "오전 " : "오후 ")
				+ cal.get(Calendar.HOUR) + "시 "
				+ cal.get(Calendar.MINUTE) + "분 "
				+ cal.get(Calendar.SECOND) + "초 입니다!"
		);
		
	} // main

} // class














