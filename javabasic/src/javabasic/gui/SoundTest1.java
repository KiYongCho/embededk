package javabasic.gui;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class SoundTest1 {
    public static void main(String[] args) {
        String filePath = "D:\\embededk\\files\\sample.wav"; // WAV 파일 경로

        try {
            File audioFile = new File(filePath);
            if (!audioFile.exists()) {
                System.out.println("파일이 존재하지 않습니다: " + filePath);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();

            System.out.println("오디오 포맷 정보:");
            System.out.println("샘플 레이트: " + format.getSampleRate());
            System.out.println("샘플 크기: " + format.getSampleSizeInBits());
            System.out.println("채널 수: " + format.getChannels());
            System.out.println("인코딩: " + format.getEncoding());

            DataLine.Info info = new DataLine.Info(Clip.class, format);

            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("이 포맷은 지원되지 않습니다.");
                return;
            }

            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioClip.start();

            System.out.println("오디오 재생 중...");
            Thread.sleep(audioClip.getMicrosecondLength() / 1000);

            audioClip.close();
            audioStream.close();
            System.out.println("오디오 재생 완료!");

        } catch (Exception e) {
            System.err.println("오디오 재생 실패:");
            e.printStackTrace();
        }
    }
}
