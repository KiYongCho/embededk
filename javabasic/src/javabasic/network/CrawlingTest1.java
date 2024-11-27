package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

// 네이버 뉴스여행/레저 뉴스 제목 크롤링
// https://news.naver.com/breakingnews/section/103/237

public class CrawlingTest1 {

	public static void main(String[] args) {

		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		BufferedReader br = null;
		
		try {
			
			uri = new URI("https://news.naver.com/breakingnews/section/103/237");
			url = uri.toURL();
			conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			// 한 줄 읽어온 데이터 저장할 변수
			String line = "";
			// 크롤링 시작할 문자열 앞의 문자열
			String startStr = "<strong class=\"sa_text_strong\">";
			// 크롤링 끝낼 문자열 뒤의 문자열
			String endStr = "</strong>";
			
			// 한 줄씩 읽어서
			while ((line=br.readLine()) != null) {
				// 크롤링할 제목을 저장할 변수
				String subject = "";
				// 한 줄 문자열의 앞뒤공백문자를 제거하고
				// 한 줄이 크롤링할 문자열의 앞 문자열로 시작하면
				if (line.trim().startsWith(startStr)) {
					// 크롤링할 제목의 시작인덱스
					int startIdx = line.indexOf(startStr) + startStr.length();
					// 크롤링할 제목의 끝인덱스
					int endIdx = line.indexOf(endStr, startIdx);
					// 제목
					subject = line.substring(startIdx, endIdx);
					System.out.println(subject);
				}
			}
			
		} catch (URISyntaxException urise) {
			urise.printStackTrace();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br!=null) br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	} // main
	
} // class



























