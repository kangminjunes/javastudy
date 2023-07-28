package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainWrapper {

  public static void ex01() {
    /*
     *  Array List 선언 및 생성 양식
     *  List<타입> 리스트명 = new ArrayList<타입>();
     */
    
    /*
     *  ┌--------------┐
     *  │     List     │ List 인터페이스
     *  │--------------│
     *  │   add();     │
     *  │   get();     │
     *  │   size();    │
     *  │   set();     │
     *  │   remove();  │
     *  └--------------┘
     *          ▲
     *          │
     *          │
     *  ┌--------------┐
     *  │   ArrayList  │ ArrayList 클래스
     *  │--------------│
     *  │   add(){}    │ 요소 추가하기
     *  │   get(){}    │ 요소 가져오기
     *  │   size(){}   │ 요소 개수 반환하기
     *  │   set(){}    │ 요소 수정하기
     *  │   remove(){} │ 요소 삭제하기
     *  └--------------┘
     */
    
    
    // Array List의 인터페이스 List 타입 선언
    List<String> season;
    
    // ArrayList 생성
    season = new ArrayList<String>();
    
    // 배열 요소 추가하기
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add(0, "봄");
    
    // 배열 요소 확인하기
    System.out.println("ex01 예시정답");
    System.out.println(season.get(0));
    System.out.println(season.get(1));
    System.out.println(season.get(2));
    System.out.println(season.get(3));
  }
  
  public static void ex02() {
    
    // ArrayList의 선언 & 생성  + 적을떄마다 스페이스 활용해서 자동 완성
    List<String> hobbies = new ArrayList<String>();
    
    // 배열 요소 추가하기
    hobbies.add("여행");
    hobbies.add("독서");
    hobbies.add("코딩");
    
    // 배열 길이 확인하기 (저장된 요소의 갯수)
   System.out.println("ex02 예시정답");
    System.out.println(hobbies.size());
    
    // 배열 길이 관련 (마지막 요소 꺼내기)
    System.out.println(hobbies.get(hobbies.size() - 1));
    
    // 배열 for문 적용하기 
    for(int i = 0; i < hobbies.size(); i++ ) {
      System.out.println(hobbies.get(i));
    }
    
    // 배열 for문 적용하기 (리팩토링 : hobbies.size() 메소드가 여러 번 호출되는 문제 해결)
    for(int i = 0, length = hobbies.size(); i< length;  i ++) {
      System.out.println(hobbies.get(i));
    }
    
    
    // 사용 이유는 메소드 호출이 여러번 되면 성능 저하의 원인이 되기 떄문이다. 
    // 그래서 위와같이 hoobies.size -> length를 선언해서 바꾸는 것이다.
  
  }
  
  public static void ex03() {
    
    // ArrayList 선언 & 생성 
    List<String>flower  = new ArrayList<String>();
    
    // 요소 추가하기
    flower.add("장미");
    flower.add("튤립");
    flower.add("무궁화");
    
    // 요소 수정하기
    flower.set(0, "백일홍"); // 인덱스 0의 요소를 "백일홍"으로 수정
    
    // 요소 삭제하기
    flower.remove(1); // 인덱스 1의 요소를 삭제
    System.out.println("ex03 예시 정답");
    // for문
    for(int i = 0, length = flower.size(); i< length; i++) {
      System.out.println(flower.get(i));
    }
  }
  
  /*
   * 7장에서 배운 말줄임표는 여러개 쓸수있다는 뜻이니 기억해야한다.
   * 말 줄임표(ellipsis)
   * 1. 메소드로 전달하는 인수의 타입이 동일하지만, 갯수가 여러 개인 경우에 사용할 수 있다.
   * 2. 말 줄임표(...)를 활용한다.
   * 3. 말 줄임표로 선언된 변수는 배열로 처리한다.
   */
  
  public static void ex04() {
  
    // 배열을 ArrayList로 바꾸기  int = Integer 둘이 상호 호완되는것이니 바꾸면된다.
    Integer [] a = {10, 20, 30, 40, 50};
    List<Integer>numbers  = Arrays.asList(a);
    
    // 주의!!! 초기화된 ArrayList는 길이를 변경할 수 없다.
    // numbers.add(60);  불가능 에러 발생
    // number.remobe(0); 불가능 에러 발생 
    // 추가 삭제가 불가능함
    // numbers.set(0, 30); 변경은 가능하다.
    
    System.out.println("ex04 예시정답");
    // for문
    for(int i =0, length = numbers.size(); i< length; i++) {
      System.out.println(numbers.get(i));
    }
    
  }
  
  public static void ex05() {
    // ArrayList 초기화
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
    System.out.println("ex05 예시정답");
    
    //for문
    for(int i=0, length=numbers.size(); i <length; i++) {
      System.out.println(numbers.get(i));
    }
  }
  
  
  
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
  }

}













