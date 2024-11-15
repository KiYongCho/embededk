package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class APIExtra10 {
   
   static int idx = 0;
   static String[][] words = new String[10000][2];   
   
   public static void main(String[] args) {
      
       // 미국독립선언서(americadoi.txt) 파일내에서 영단어 중 길이가 가장 긴 단어부터
       // 가장 짧은 단어를 순서대로 개수와 함께 출력
       // 내일까지 꼭 해본닷!
      
      Iterator<MatchResult> iterator = Pattern.compile("[a-zA-Z]+")
    		  .matcher(getText()).results().iterator();
      
      while (iterator.hasNext()) {
         String word = iterator.next().group();
         words[idx][1] = "1";
         if (!isDup(word)) {
            words[idx++][0] = word;
         }
      }
      
      sortWords();
      
      printWords();

   } // main
   
   // 중복 체크
   public static boolean isDup(String str) {
      for (int i=0; i<idx; i++) {
         if(str.equals(words[i][0])) {
            words[i][1] = String.valueOf(Integer.parseInt(words[i][1]) + 1);            
            return true;
         }
      }
      return false;
   }
   
   // 배열 정렬
   public static void sortWords() {
      Arrays.sort(words, new Comparator<String[]>() {
         @Override
         public int compare(String[] prev, String[] next) {
            if (prev[0]!=null && next[0]!=null) {
               return next[0].length() - prev[0].length();
            } else {
               return 0;
            }
         }
      });
   }
   
   // 출력
   public static void printWords() {
      for (int i=0; i<idx; i++) {
         System.out.println(words[i][0] + " 단어는 " + words[i][1] + "번 나옴!");
      }
   }   

   // 파일의 내용을 한 줄씩 읽어서 모두 합쳐서 리턴하는 메소드
   private static String getText() {
      BufferedReader br;
      try {
         br = new BufferedReader(new FileReader(
               new File("C:\\Users\\Administrator\\git\\embededk\\javabasic\\src\\javabasic\\exapiextra\\americadoi.txt")));
         String line = "";
         String gimiTxt = "";
         while ((line=br.readLine())!=null) {
            gimiTxt += line;
         }
         br.close();
         return gimiTxt;
      } catch (FileNotFoundException fnfe) {
         fnfe.printStackTrace();
         return null;
      } catch (IOException ioe) {
         ioe.printStackTrace();
         return null;
      }
   }      
   
} // class
