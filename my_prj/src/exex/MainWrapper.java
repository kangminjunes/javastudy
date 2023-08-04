package exex;

import java.io.File;
import java.io.IOException;

public class MainWrapper {
/*
 *  java. io File 클래스
 *  1. 파일, 디렉터리를 관리하는 클래스이다.
 *  2. 파일, 디렉터리를 생성/삭제가 가능하다.
 *  3. 파일, 디렉터리의 각종 정보(이름, 크기 , 최종 수정일등)를 확인할 수 있다.
 */
  
  /*
   *  경로 작성 방법
   *  윈도우 \\ 리눅스 / 
   *   
   */
  
  public static void ex01( ) {
    
    String sep = File.separator;
    
    File dir;
    
    dir = new File("C:" + sep + "storage");
    
    if(dir.exists()) {
      dir.delete();
      System.out.println("C:\\ storage 디렉터리 삭제 완료");
    }else {
      dir.mkdir();
      System.out.println("생성완료");
      
    }
  }
  
  public static void ex02() {
    
    try {
      
      File dir = new File("C:/storage");
      
      if(!dir.exists());
      dir.mkdirs();
      
      File file = new File(dir, "myfile.txt");
      
      if(file.exists()) {
        file.delete();
        System.out.println("삭제완");
      } else {
        file.createNewFile();
        System.out.println("생성완");
      }
      
    }catch(IOException e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void ex03() {
    
    File dir = new File("C:\\Program Files\\Java\\jdk-11 ");
    
    File[] files =dir.listFiles();
    
    for(int i = 0; i<files.length; i++) {
      
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
