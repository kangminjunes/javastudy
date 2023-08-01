package ex01_try_catch;

import java.net.URL;
import java.util.Scanner;

public class MainWrapper {

  public static void ex01() {
    System.out.println("예시 1번정답");
    try {
      
      String name = "tom";
      Integer.parseInt(name);  // 발생한 NumberFormatException을 catch 블록으로 Java가 던진다.
    } catch(NumberFormatException e) {  // RuntimeExceptiom, Exception 가능
      // e 예외 객체 이름이다.
      System.out.println("예외발생");
    }
      
  }
  
  public static void ex02() {
    System.out.println("예시 2번정답");
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("덧셈식을 입력하세요(예 :  1 + 2)");
      String expr = sc.next();
      String[] numbers = expr.split("[+]");   // numbers = {"1", "2"}
      int number1 = Integer.parseInt(numbers[0]);
      int number2 = Integer.parseInt(numbers[1]);
      System.out.println(number1 + number2 );
      sc.close();
    } catch(NumberFormatException e ) {
      System.out.println("정수 연산만 가능합니다.");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("덧셈식에 +플 포함해서 입력하세요.");
    }catch(Exception e) { //NumberFormatException과ArrayIndexOutOfBoundsException 으로 처리 못하는 예외를 담당한다
    System.out.println("알 수 없는 예외가 발생했습니다.");
    }
  }
  
  public static void ex03() {
    System.out.println("예시 3번정답");
    // 반드시 try - catch가 필요한 예외를 Check Exception이라고 한다.
    
    try {
    URL url = new URL("https://www.naver.com");
    } catch(Exception e) {
      System.out.println("예외 발생");
    }
  }
  
  public static void main(String[] args) { 
    ex01();
    ex02();
    ex03();

  }

}
