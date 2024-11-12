package javabasic.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식 (Regular Expression)
 * 정해진 패턴문자열들을 사용해서 문자열내의 문자열을 검색, 치환에 사용되는 표현식
 * ^ : 문자열의 시작
 * [^문자열] : 문자열이 아닌 것
 * $ : 문자열의 끝
 * . : 임의의 한 문자
 * * : 문자가 0개 이상 발생
 * + : 문자가 1개 이상 발생
 * ? : 문자가 0개 또는 1개 발생
 * [] : 문자의 집합 범위
 * {} : 문자열의 반복 회수
 * | : or
 * \b : 단어의 경계
 * \B : 단어가 아닌 것의 경계
 * \s : 공백문자
 * \S : 공백문자가 아닌 문자
 * \w : word (영문대소문자, 숫자, _)
 * \W : word가 아닌 것
 * \d : 숫자 = [0-9]
 * \D : 숫자가 아닌 것
 * \\ : \문자 자체 
 */

public class RegularExpression {

	public static void main(String[] args) {
		
		String str1 = "abcde";
		System.out.println(str1.matches("abc")); // false
		System.out.println(str1.matches("abcde")); // true
		
		String str2 = "010-1234-5678";
		System.out.println(str2.matches("\\d{3}-\\d{3}-\\d{4}")); // false
		System.out.println(str2.matches("\\d{3}-\\d{4}-\\d{4}")); // true
		
		String str3 = "12345";
		// 숫자 5개 패턴문자열
		System.out.println(str3.matches("\\d{5}")); // true
		System.out.println(str3.matches("[0-9]{5}")); // true
		
		String str4 = "abc123";
		String str5 = "ABC123";
		// 영문자 3개가 나오고 숫자 3개가 나오는 패턴문자열
		System.out.println(str4.matches("[a-zA-Z]{3}\\d{3}")); // true
		System.out.println(str5.matches("[a-zA-Z]{3}\\d{3}")); // true
		
		String str6 = "안녕 자바";
		// 한글인 경우 [가-힣]이 한글 한글자와 매칭
		System.out.println(str6.matches("[가-힣]{2}\s[가-힣]{2}")); // true
		
		// 실습 1
		// 아래 배열의 문자열들에 모두 매칭되는 전화번호 정규표현식 패턴만들기 
		// 전화번호 : 숫자2개나3개-숫자3개나4개-숫자4개
		String[] telArr = {
				"02-123-4567",
				"031-123-4567",
				"02-1234-5678",
				"031-1234-5678"
		};
		String patternStr1 = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
		for (String str : telArr) {
			System.out.println(str.matches(patternStr1));
		}
		
		// 실습 2
		// 아래 배열의 문자열들에 모두 매칭되는 주민등록번호 정규표현식 패턴만들기
		// 주민등록번호 : 년도2자리월2자리일2자리-남녀구분1자리숫자6자리
		// 년도:00~99, 월:01~12, 일:01~31, 남녀구분:1~4중하나
		String[] ssnArr = {
				"100101-3234567",
				"001231-4234567",
				"900101-1234567",
				"800101-2234567",
				"701301-1234567",
				"601201-5234567"
		};
		// (0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])
		String patternStr2 = "^\\d{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])-[1-4]\\d{6}$";
		for (String str : ssnArr) {
			System.out.println(str.matches(patternStr2));
		}
		
		// java.util.regex 패키지
		// Pattern : 정규표현식 패턴 클래스
		// Matcher : 패턴에 맞는지 체크하는 기능 클래스
		
		// flag
		// Pattern.CASE_INSENSITIVE : 대소문자 구별 없이 패턴 매칭을 함
		// Pattern.MULTILINE : 문자열이 여러 라인으로 되어 있을 때 여러 라인에서 패턴 매칭을 함 
		
		// a가 0개 이상 나오고 b가 나오는 패턴 생성
		Pattern p = Pattern.compile("^a*b$", Pattern.CASE_INSENSITIVE);
		
		// Matcher 생성 
		Matcher m1 = p.matcher("ab");
		Matcher m2 = p.matcher("aaab");
		Matcher m3 = p.matcher("AB");
		Matcher m4 = p.matcher("ba");
		Matcher m5 = p.matcher("aabb");
		
		System.out.println(m1.matches()); // true
		System.out.println(m2.matches()); // true
		System.out.println(m3.matches()); // true
		System.out.println(m4.matches()); // false
		System.out.println(m5.matches()); // false
		
	} // main
	
} // class

































