package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class MainWrapper {

  /*
   *  java.io.OutputStream 클래스
   *  1. 바이트 기반의 출력 스트림이다.(출력할떄 사용하는 통로, 도로 라고생각하면됨)
   *  2. 출력 단위
   *     1) int
   *     2) byte[]
   */
  
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일출력스트림 선언
    FileOutputStream fout = null;
    
    try {
      
    // 파일출력스트림 생성 (반드시 예외 처리가 필요한 코드)
    fout = new FileOutputStream(file);
    
    // 출력할 데이터(파일로 보낼 데이터)
    int c = 'A';  // char어울리지만 int, byte만 사용가능하기에 int  사용함
    String s = "pple";
    byte[] b =s.getBytes(); // byte[] : String을 byte[]로 변환
    
    // 출력(파일로 데이터 보내기)
    fout.write(c);
    fout.write(b);
   
   } catch(IOException e) {
     e.printStackTrace();
   }finally {
    try {
      if(fout != null) {
      fout.close(); // 출력스트림은 반드시 닫아줘야 함 (반드시 예외 처리가 필요한 코드)
    }
  } catch(IOException e) {
    e.printStackTrace();
  }
    System.out.println(file.getPath() + "파일 크기 : " + file.length( )+" 바이트");
  }
}
  
  public static void ex02() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex02.dat");
    
    // 파일출력스트림 선언
    FileOutputStream fout = null;
    
    try {
    
      // 파일출력스트림 생성 (반드시 예외 처리가 필요한 코드)
      fout = new FileOutputStream(file);
      
      // 출력할 데이터(파일로 보낼 데이터)
      String s = "안녕하세요";
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
    
    System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");
    
  }
  
  public static void ex03() {
    
    /*
     *  java.io.BufferedOutputStream 클래스
     *  1. 내부 버퍼를 가지고 있는 출력 스트림이다.
     *  2. 많은 데이터를 한 번에 출력하기 떄문에 속도 향상을 위해서 사용한다.
     *  3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 출력 형태 2줄로 표현하기 
    //        안녕하세요
    //        반갑습니다
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex03.dat");
    
    // 버퍼출력스트림 선언
    BufferedOutputStream bout = null;
    
    try {
      
    // 버퍼출력스트림 생성 (반드시 예외처리가 필요한 코드)    
    bout = new BufferedOutputStream(new FileOutputStream(file));
  
    // 출력할 데이터
    String z = "안녕하세요";
    int y    = '\n';
    String x = "반갑습니다";
    
    // 출력(파일로 데이터 보내기)
    bout.write(z.getBytes("UTF-8"));                 
    bout.write(y);
    bout.write(x.getBytes(StandardCharsets.UTF_8)); // getBytes("UTF-8")과 동일하다.
    
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(bout != null) {
          bout.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }finally {
        try {
          if(bout != null) {
            bout.close();
          }
        }
        catch(IOException e) {
          e.printStackTrace();
        }
        System.out.println(file.getPath() + "파일 크기 :" + file.length() +" 바이트");
      }
    }
    
  }
  
  public static void ex04() {
    
    /*
     *  java.io.DataOutputStream 클래스
     *  1. int, double, String 등의 변수를 그대로 출력하는 출력스트림이다.
     *  2. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex04.dat");
    
    // 데이터출력스트림 선언
    DataOutputStream dout = null;
    
    try {
      
    // 데이터출력스트림 생성 (반드시 예외처리가 필요한 코드)    
    dout = new DataOutputStream(new FileOutputStream(file));
    
    // 출력할 데이터
    String name ="tom";   
    int age = 50;
    double height = 180.5;
    String school = "가산대학교";
    
    // 출력(파일로 데이터 보내기)
    dout.writeChars(name);  // dout.writeChar('t'), dout.writeChar('o'), dout.writeChar('m')
    dout.writeInt(age);
    dout.writeDouble(height);
    dout.writeUTF(school);
    
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(dout != null) {
          dout.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }finally {
        try {
          if(dout != null) {
            dout.close();
          }
        }
        catch(IOException e) {
          e.printStackTrace();
        }
        System.out.println(file.getPath() + "파일 크기 :" + file.length() +" 바이트");
      }
    }
  }
  
  public static void ex05() {
    
    /*
     * java.io.ObjectOutputStream 클래스
     * 1. 객체를 그대로 출력하는 출력스트림이다.
     * 2. 직렬화(Serializable)된 객체를 보낼 수 있다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex05.dat");
    
    // 객체출력스트림 선언
    ObjectOutputStream oout = null;
    
    try {
    
      // 객체출력스트림 생성 (반드시 예외 처리가 필요한 코드)
      oout = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터(파일로 보낼 데이터)
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      Student student = new Student(name, age, height, school);
    
      // 출력(파일로 데이터 보내기)
      oout.writeObject(student);
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(oout != null) {
          oout.close();  // 출력스트림은 반드시 닫아줘야 함 (반드시 예외 처리가 필요한 코드)
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");
  }
  
  public static void main(String[] args) {
    System.out.println("예시문제 1번출력결과");
    ex01();
    System.out.println("예시문제 2번출력결과");
    ex02();
    System.out.println("예시문제 3번출력결과");
      ex03();
      System.out.println("예시문제 4번출력결과");
    ex04();
    System.out.println("예시문제 5번출력결과");
    ex05();
  }

}
