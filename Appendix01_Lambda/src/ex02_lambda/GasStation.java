package ex02_lambda;

/*
 *  람다 표현식
 *  1. Anonymous Inner Type 방식의 객체를 생성할 떄 사용할 수 있는 새로운 표현식이다.
 *  2. 추상 메소드가 하나인 인터페이스에서 람다 표현식을 사용할 수 있다.
 *      (함수형 인터페이스 : 추상 메소드가 하나인 인터페이스)
 *  3. 형식
 *     (매개변수) -> {
 *        본문;
 *     }
 *  4. 리턴도 가능한데 정해진 문법 X
 */

/*
 *  람다 표현식 적용 예시
 *  
 *  1. 파라미터 X, 반환 X
 *      () -> {
 *       System.out.println("Hello World")
 *      };
 *      
 *      () -> System.put.println("Hello World");  // 메소드 본문이 1줄이면 중괄호{} 생략가능
 *      
 *  2. 파라미터 0, 반환 X (파라미터의 타입은 생략한다.)
 *    
 *     (String name) -> {
 *       System.put.println("Hello" + name);
 *     }
 *     
 *     (String name) -> System.put.println("Hello" + name);
 *     
 *     (name) -> System.put.println("Hello" + name);
 *     
 *  3. 파라미터 X, 반환 O (반환 타입은 생략한다.)
 *  
 *     () -> {
 *      String name = "tom";
 *      return name;
 *     } 
 *     
 *     () -> return "tom"; // 메소드에 return만 존재하면 return을 생략한다.
 *     
 *  4. 파라미터 O, 반환 O
 *  
 *      // 이름을 전달하면 "님"을 붙여서 출력하고,해당값을 반환하는 함수
 *    (name) -> {
 *      String retVal = name +"님"
 *      System.put.println(retVal);
 *      return retVal;
 *    }
 *    
 *    // 정수 값을 전달하면 해당 값보다 1이 큰 수를 반환하는 함수
 *    (n) -> n + 1;   
 */




public class GasStation {

  private int totalOil;
  private int payPerLiter;
  private int earning;
  
  public GasStation () {
    
  }
  
  public void sellOil(String model, int oil) {
    
    // Car 인터페이스를 구현한 별도 클래스를 만들고, 해당 클래스 객체를 만들고, addOil() 호출
    // Car's addOil()
    // 해당 지금  car = new Car() 불가능하다 Car가 인터페이스로 구성되었기 떄문이다.
    
    // Car car 지역변수(객체) 선언 (sellOil 메소드 호출 시 생성되고, sellOil 메소드 종료 시 소멸된다.)
    Car car;
    
    // Car car 지역변수(객체) 생성 
    // 람다식으로 Car 인터페이스 타입의 객체 생성
    car = () -> {
      totalOil -= oil;
      earning += oil * payPerLiter;
      System.out.println(model + " " + oil + "L 주유 완료");      
    };
    
    // Car car 지역변수(객체)의 addOil() 메소드 호출
    car.addOil();
    
  }

  public int getTotalOil() {
    return totalOil;
  }

  public void setTotalOil(int totalOil) {
    this.totalOil = totalOil;
  }

  public int getPayPerLiter() {
    return payPerLiter;
  }

  public void setPayPerLiter(int payPerLiter) {
    this.payPerLiter = payPerLiter;
  }

  public int getEarning() {
    return earning;
  }

  public void setEarning(int earning) {
    this.earning = earning;
  }
  
}
