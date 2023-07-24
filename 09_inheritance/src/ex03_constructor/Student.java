package ex03_constructor;

/*
 *  상속 관계의 생성자
 *  1. 자식 클래스를 생성할 떈 "반드시" 부모 클래스를 "먼저" 생성해야 한다.
 *  2. 서브 클래스를 생성할 떈 "반드시" 슈퍼 클래스를 "먼저" 생성해야 한다.
 *  3. 서브 클래스의 생성자가 호출될 떄는 "반드시" 슈퍼 클래스의 생성자를 "먼저" 호출해야 한다.
 *  4. 만약 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 호출하지 않으면 Java에 의해서 슈퍼 클래스의 "디폴트 생성자"가 호출된다.
 *  5. 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 호출하는 방법은 super()이다.
 */
public class Student extends Person {
  
  private String school;
  
  // new Student()에서 호출되는 생성자
  public Student() {
    System.out.println("Student() 호출");
  }
  
  // new Student("가산대학교")에서 호출되는 생성자
  public Student(String school) {
    this.school = school;
    System.out.println("Student(String school) 호출");
  }
  
  // new Student("홍길동", "가산대학교")에게 호출되는 생성자
  public Student(String name,String school) {
    // 파라미터 String name을 슈퍼 클래스의 생성자를 호출할 떄 전달한다.
    super(name);  // 인수 name은 String 타입이므로 파라미터가 String인 Person 생성자가 호출된다.
    this.school =school;
  }
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
}