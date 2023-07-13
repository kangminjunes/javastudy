package ex01_branch;

public class MainWrapper {
  
  public static void ex01() {
    // 점수에 따른 학점(if문)
    int score = 85;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    if(score >= 90) {
      grade = 'A';
    } else if(score >= 80) {
      grade = 'B';
    } else if(score >= 70) {
      grade = 'C';
    } else if(score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println(score + "점은 " + grade + "학점입니다.");
  }
  
  public static void ex02() {
    // 점수에 따른 학점(switch문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    switch(score / 10) {
    case 10:
    case 9:
      grade = 'A';
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    case 6:
      grade = 'D';
      break;
    default:
      grade = 'F';
    }
    System.out.println(score + "점은 " + grade + "학점입니다.");
  }
  
  public static void ex03() {
    // 점수와 학년에 따른 학점
    // 1~3학년 : 60점 이상 합격, 아니면 불합격
    // 4~6학년 : 70점 이상 합격, 아니면 불합격
    
    int score = 100; // 점수
    int scYear = 1;  // 학년
    String pass;  // "합격", "불합격"
    if(scYear <=3) {
        if(score >= 60) {
          pass = "합격";
        } else {
          pass = "불합격";
        }
    } else {
      if(score >= 70) {
        pass ="합격"; 
      } else {
        pass = "불합격";
      }
    }
  
System.out.println(pass);

    
  }
  
  public static void ex04() {
    // 메뉴에 따른 가격
    // 아메리카노 : 2000
    // 카페라떼 : 2500
    // 밀크티 : 3000
    // 기타 : 5000
   String order = "아메리카노";
   int price; 
    switch(price) {
    case "아메리카노": price = 2000; break;
    case "카페라떼": price = 2500; break;
    case "밀크티": price = 3000; break;
    default: price = 5000;
    
    }
    System.out.println( "주문하신"+ order + "은(는)" + price + "원입니다.");
  }
  
  public static void ex05() {
    // 월에 따른 계절
    // 3 ~ 5 : 봄
    // 6 ~ 8 : 여름
    // 9 ~ 11: 가을
    // 12 ~ 2: 겨울
    
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
    int month = 7;
    
    if(month < 0 || month > 13) {
      System.out.println("잘못된 점수");
    }else if(month >= ) {
      System.out.println("합격");
    }else if(month <60)
      System.out.println("불합격");
    }else if(month <60)
      System.out.println("불합격");
    }else if(month <60)
      System.out.println("불합격");
    
  }
  
  public static void ex06() {
    // 월에 따른 분기
    // 1 ~ 3 : 1분기
    // 4 ~ 6 : 2분기
    // 7 ~ 9 : 3분기
    // 10 ~ 12 : 4분기
    
    int month = 7;
    
    if(month < 0 || month > 13) {
      System.out.println("잘못된 분기");
    }else if(month <= 3) {
      System.out.println("1분기");
    }else (month <= 6)
      System.out.println("2분기");
    }else (month <= 9)
      System.out.println("3분기");
    }else (month <= 12)
      System.out.println("4분기");
    
  }
    
  }
  
  public static void ex07() {
    //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    
  }
  
  public static void ex08() {
    // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
    char ch = 'A';  // 임의의 대문자 또는 소문자
    
  }
  
  public static void main(String[] args) {
    // ex01();
    // ex02();
    //ex03();
   ex04();
  }

}