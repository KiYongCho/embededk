package javabasic.gui;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class SoundTest2 {

    public static void main(String[] args) {
        // MP3 파일 경로 설정
        String filePath = "D:\\embededk\\files\\sample.mp3"; // 재생할 MP3 파일 경로

        try {
        	FileInputStream fis = new FileInputStream(filePath);
        	
            // JLayer Player 객체 생성
            Player mp3Player = new Player(fis);

            System.out.println("MP3 파일 재생 중...");
            mp3Player.play(); // MP3 파일 재생

            System.out.println("MP3 파일 재생 완료!");

        } catch (Exception e) {
            System.err.println("MP3 파일 재생 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
    
}
