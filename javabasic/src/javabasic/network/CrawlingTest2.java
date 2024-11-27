package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

// ssg닷컴의 베스트 상품리스트 크롤링
// https://www.ssg.com/page/pc/ranking.ssg
// "[브랜드명] 제품명 가격"의 형태로 출력해 보자

public class CrawlingTest2 {

	public static void main(String[] args) {

		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		BufferedReader br = null;
		
		try {
			
			uri = new URI("https://www.ssg.com/page/pc/ranking.ssg");
			url = uri.toURL();
			conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			// 전체 문자열 저장할 변수
			String totalLine = "";
			
			// 한 줄 읽어온 데이터 저장할 변수
			String line = "";
			
			// 크롤링 시작할 문자열 앞의 문자열
			String startStr = "<strong class=\"sa_text_strong\">";
			// 크롤링 끝낼 문자열 뒤의 문자열
			String endStr = "</strong>";
			
			// 한 줄씩 읽어서 totalLine에 저장
			while ((line=br.readLine()) != null) {
				totalLine += line;
			}
			
			// 브랜드명 시작/끝
			String startBrandName = "<span class=\"chakra-text css-f8xjfi\">";
			String endBrandName = "</span>";
			int startBrandNameIdx = 0;
			int endBrandNameIdx = 0;
			int startBrandNameLeng = startBrandName.length();
			
			// 상품명 끝 (실습)
			String endProductName = "</p>";
			int endProductNameIdx = 0;
			
			// 가격 시작/끝 (실습)
			String startPrice = "<span class=\"css-idkz9h\">판매가격</span>";
			String endPrice = "</em>";
			int startPriceIdx = 0;
			int endPriceIdx = 0;
			
			while ((startBrandNameIdx=totalLine.indexOf(startBrandName, startBrandNameIdx+1)) > -1) {
				endBrandNameIdx = totalLine.indexOf(endBrandName, startBrandNameIdx+1);
				System.out.println("[" + totalLine.substring(startBrandNameIdx + startBrandNameLeng,
						endBrandNameIdx-1) + "] ");
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



























