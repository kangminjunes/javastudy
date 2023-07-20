package ex06_this;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    // ChainCalculator 객체 선언 & 생성
    ChainCalculator myCalc = new ChainCalculator();
    
    // 객체 자체는 참조값이다.
    System.out.println(myCalc); // 6f2b958e 이부분이 this이다.
    
    // myCalc 객체가 호출한 printThis 메소드이기 떄문에,
    // 여기서 확인된 this 값은 myCalc 객체의 참조값과 같다.
    myCalc.printThis(); // 프린트시 위에 참조값과 동일하다.
    
   // addition 메소드의 차이닝
   // myCalc.addition(3).addition(2);  
    //myCalc.addition(3) 실행 후 myCalc. addition(2)를 실행한다.
   
   // myCalc 메소드 체이닝ㅇ
    myCalc.on().addition(3).subtraction(2).multiplication(5).division(2).done();
    
    //0.0 + 3.0 - 2.0 * 5.0 / 2.0 = 2,5
  }
  
}
