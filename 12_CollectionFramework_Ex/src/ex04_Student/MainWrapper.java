package ex04_Student;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 교실의 5명 학생 정보를 저장하는 HashMap 만들기
    // key   : 학번(예: 10101)
    // Value : Student 객체
    
    Map<Integer, Student> clazz = new HashMap<Integer, Student>();
    
    // 해당 학생 추가에는  2가지 방법으로 작성 가능하다. 
    // 1번 방법
    clazz.put(10101, new Student("가길동", new Exam(100, 100, 100)));
    clazz.put(10102, new Student("나길동", new Exam(90, 90, 90)));

/*    
    // 2번 방법
    student.setName("마길동");
    student.setExam(new Exam(90,90,90));
    clazz.put(10105, student);
 */
    Integer[] stuNo = {10101, 10102};
    for(int i =0; i < stuNo.length; i++) {
      Student student = clazz.get(stuNo[i]);
      System.out.println("이름: " + student.getName());
      System.out.println("시험: " + student.getExam());
    }
 }
 
   
  }


