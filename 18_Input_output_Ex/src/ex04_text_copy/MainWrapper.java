package ex04_text_copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
    String sep = File.separator;
    
   File dir;
   dir = new File("C:/storage");
   if(!dir.exists());
   dir.mkdir();
   
   File file =new File(dir, "alphabet.txt");
   
   FileOutputStream fout = null;
    
   try {
     
     // 파일출력스트림 생성 (반드시 예외 처리가 필요한 코드)
     fout = new FileOutputStream(file);
     
     // 출력할 데이터(파일로 보낼 데이터)
     String s ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     byte[] b = s.getBytes("UTF-8");  // byte[] : String을 byte[]로 변환
   
     // 출력(파일로 데이터 보내기)
     fout.write(b);
     
   } catch (IOException e) {
     e.printStackTrace();
   } finally {
     try {
       if(fout != null) {
         fout.close();  // 출력스트림은 반드시 닫아줘야 함 (반드시 예외 처리가 필요한 코드)
       }
     } catch (IOException e) {
       e.printStackTrace();
     }
   }
   System.out.println(file.getPath()+"생성되었습니다.");
  }
  

  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    try {
      String old_name = "C:/storage/alphabet.txt";
      String new_name = "C:/storage/alphabet2.txt";
      
      FileInputStream fin = new FileInputStream(old_name);
      
      FileOutputStream fout = new FileOutputStream(new_name);
      
      int tmp =0;
      while ((tmp = fin.read()) != -1){
        fout.write(tmp);
      }
      fin.close();
      fout.close();
      
    } catch(Exception e) {
      e.printStackTrace();
      
      
      
    }
    System.out.println("파일 복사가 되었습니다.");
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}