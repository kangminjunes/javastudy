package ex03_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    
    // new Student()를 이용한 Student 객체생성
    Student s1 = new Student();
    System.out.println(s1.getName());
    System.out.println(s1.getSchool());
    
    // new Student("가산대학교")를 이용한 Student 객체 생성
    Student s2 = new Student("가산대학교");
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
  
    
    // new Student("홍길동", "가산대학교")를 이용한 Student 객체 생성
    Student s3 = new Student("홍길동", "가산대학교");
    System.out.println(s3.getName());
    System.out.println(s3.getSchool());
  }
}
