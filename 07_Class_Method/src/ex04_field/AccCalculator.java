package ex04_field;


/***
 * 
 * 사칙연산 결과를 저장할 수 있는 계산기
 *  
 * @author 강민준
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class AccCalculator {

  /*
   *  필드(field)
   *  1. 객체가 가질 수 있는 값을 저장할  변수이다.
   *  2. 클래스에서 선언한다.
   *  3. 필드는 자동으로 초기화된다. (0, 0.0, false, null)
   *  null 모든 참조타입일떄 값이 없는경우를 null 이라고한다.
   *  4. 정보 은닉을 위해서 private 처리한다.
   */
  
  /**
   * 이 필드는 AccCalculator의 사칙연산 결과를<br>저장할 수 있는 필드이다. 
   */
  private double value;   // 값을 주지 않고 기본 0에 값을 가진다.
 
  /**
   * 
   *  필드 value에 파라미터 a 더하는 메소드
   * 
   * @param a 실수
   * 
   */
  public void additon(double a) {
    value = value + a; // value += a 해당같이 줄여서 입력 가능하다.
    System.out.println("+" + a + "=" + value);
  }
  
  /**
   * 
   *   필드 value에 파라미터 뺴는 메소드
   *   
   * @param a 실수
   */
  public void substraction(double a) {
    value -=   a;
    System.out.println("-" + a + "=" + value);
  }
  
  /**
   * 
   *  필드 value에 파라미터 a 곱하는 메소드
   * 
   * @param a 실수
   */
  public void multiplication(double a) {
    value *=  a; // value -=a;
    System.out.println("*" + a + "=" + value);
  }
  
  /**
   * 
   *  필드 value에 파라미터 a 나눠주는 메소드
   * 
   * @param a 실수
   */
  public void division(double a) {
    value /= a; // value -=a;
    System.out.println("/" + a + "=" + value);
  }
  
  /**
   *  필드 value를 출력하는 메소드
   */
  public void showValue() {
    System.out.println(value);
  }
  
}
