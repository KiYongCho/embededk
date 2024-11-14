package javabasic.exapi2;

import java.util.Calendar;
import java.util.Scanner;

public class ExDate2 {
	
	public static void main(String[] args) {
		
		System.out.println("달력을 표시할 년월을 6자리로 입력해 주세요!");
		
		// 입력받은 문자열 저장
		String yearMonth = inputYearMonth();
		
		// Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		// 날짜 설정
		cal.set(
				Integer.parseInt(yearMonth.substring(0, 4)), // 년도 문자열4개를 정수로
				Integer.parseInt(yearMonth.substring(4))-1, // 월 문자열2개를 정수로
				1 // 1일
		);
		
		printCalendar(
			cal.get(Calendar.DAY_OF_WEEK), // 1일의 요일 숫자값 (1일, 2월 ...)
			cal.getActualMaximum(Calendar.DAY_OF_MONTH) // 월의 마지막 날
		);
		
	}
	
	// 한 줄 입력받아서 리턴하는 메소드
	private static String inputYearMonth() {
		Scanner scanner = new Scanner(System.in);
		String yearMonth = scanner.nextLine();
		scanner.close();
		return yearMonth;
	}
	
	// 달력 출력 메소드
	private static void printCalendar(int dayOfWeek, int lastDayOfMonth) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 요일값-1만큼 탭 만들기
		for (int i=1; i<dayOfWeek; i++) System.out.print("\t");
		for (int i=1; i<lastDayOfMonth+1; i++) {
			System.out.print(i + "\t"); // 날짜 표시 (1일부터 말일까지)
			if ((dayOfWeek+(i-1))%7 == 0) System.out.println(); // 7개마다 줄바꿈
		}
	}

} // class






