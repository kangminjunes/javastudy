package ex07_Object;

public class MainWrapper {

  public static void ex01() {
    
    // object 타입으로 모든 객체를 저장할 수 있다.
    // object 타입으로 저장한 객체를 사용할 떄는 캐스팅 해야 한다.
    Object obj  = new Person();
    ((Person)obj).setName("홍길동");
    ((Person)obj).setAge(20);
    System.out.println(((Person)obj).getName());
    System.out.println(((Person)obj).getAge());
  }
  
  public static void ex02() {
    
    // 동일한 객체 2개 준비
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길동", 20);
    
    // 동일한 객체인지 판단
    boolean same = p1.equals(p2);
    
    // 결과 확인
    System.out.println(same ? "동일한 객체" : "다른 객체");
    
  }
  
  public static void ex03() {
    Person  p = new Person("홍길동", 20);
    
    System.out.println(p);  // 객체 p는 p.toString() 이 자동 호출되서 사용된다.
    System.out.println(p.toString()); // 해당 그래서 위와같이 동일한 형태 출력
  }
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
  }

}