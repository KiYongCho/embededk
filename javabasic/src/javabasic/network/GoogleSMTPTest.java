package javabasic.network; 

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

// Google에서 제공하는 무료 SMTP서비스를 활용하여 이메일 보내기

/*
	1. javax.mail, javax.activation 라이브러리(jar) 필요
	
	2. Google SMTP 사용 설정
	    1) 2단계 인증 설정
	        Google 계정 로그인 > 계정관리> 보안> 2단계인증 활성화
	    2) 앱 비밀번호 생성
	        Google 계정 로그인 > 검색 > 앱 비밀번호 > 앱 이름 지정 > 생성된 앱 비밀번호 저장
 */

public class GoogleSMTPTest {

	public static void main(String[] args) {
		
		// Google 계정 정보
		String username = "realchoky@gmail.com"; // 구글 계정명
		String password = "eeff llzc pkrg ovik"; // 앱 비밀번호
		
		// SMTP 서버 설정
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true"); // SMTP서버 인증 여부
		props.put("mail.smtp.starttls.enable", "true"); // TLS서비스 사용 여부
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP 서버
		props.put("mail.smtp.port", "587"); // SMTP 서버 포트번호
		
		// 메일세션(연결) 생성
		Session session = Session.getInstance(props, new Authenticator() {
			// 사용자 계정명, 앱 비밀번호로 사용자 인증
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		try {
			
			// 이메일 메세지 작성
			Message message = new MimeMessage(session);
			
			// 발신자 이메일
			message.setFrom(new InternetAddress("realchoky@gmail.com"));
			
			// 수신자 이메일
			message.setRecipients(
					Message.RecipientType.TO, // 받는 사람
					InternetAddress.parse("realchoky@naver.com") // 받는 사람 이메일
			);
			
			// 이메일 제목
			message.setSubject("Google SMTP 테스트 메일");
			
			// 이메일 내용
			message.setText("안녕! 눈길 조심!~!~!~!~!~!");
			
			// 이메일 발송
			Transport.send(message);
			System.out.println("이메일 발송 완료!");
			
		} catch (MessagingException me) {
			me.printStackTrace();
		}
		
	} // main
	
} // class



















