package ex02_delete;

import java.io.File;

public class MainWrapper {

  public static void ex01() {
    
    // c:/2023 디렉터리를 삭제하시오
    // 비어 있는 디렉터리만 삭제할 수 있다.
    
    
    // File 객체 선언
    new File("C:/2023/08/03/15").delete();  
    new File("C:/2023/08/03").delete();  
    new File("C:/2023/08").delete();  
    new File("C:/2023").delete();  
    
    System.out.println("C:\\2023 디렉터리 삭제 완료");
    
  }
  public static void ex02() {
    
    // C:/storage 디렉터리를 삭제하시오
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    if(files != null) {
      for(File  file : files) {
        System.out.println(file.getPath() + "파일 삭제");
        file.delete();
      }
    }
    System.out.println(dir.getAbsolutePath()+ "디렉터리 삭제");
    dir.delete(); 
  }
  
  
  public static void main(String[] args) {
   //ex01();
    ex02();
  }
 }

