package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.

    
    for(int n = 1; n<=9; n++) {
      System.out.println(dan+"X"+n+"="+(dan*n));
    }
    
    
      
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    int goal = 100000;  // 목표 모금액
    int money = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 0;  // 회차

    while (total <= goal) {
        nth++;              
        total += money;     
        System.out.println(nth + "회 모금액 " + money + "원, 현재 모금액 " + total + "원");
    }
}
    
    
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    
    for(int i = 2; i<= 9; i++) {
      System.out.println( i+"단입니다."); 
    for(int j = 1; j<= 9; j++) {
      System.out.println(i+" * "+j+" = "+i*j); 
    }
    }
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    // 참고할코드
   // System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
    
    for(int i=1 ; i<=9 ; i++) {
      for(int k=2 ; k<=9 ; k++) {
        System.out.print(k+"X"+i+"="+ String.format("%-4d", i*k));
      }
      System.out.println();
    }

  }
  
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    //       star=12345 
    // row=1      *
    // row=2      **
    // row=3      ***
    // row=4      ****
    // row=5      *****
    //
    // row=1, star=1~1
    // row=2, star=1~2
    // row=3, star=1~3
    // row=4, star=1~4
    // row=5, star=1~5
    for(int row=1; row <= 5; row++) {
      for(int star=1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    //       star=12345
    // row=1      *****
    // row=2      ****
    // row=3      ***
    // row=4      **
    // row=5      *
    //
    // row=1, star=1~5
    // row=2, star=1~4
    // row=3, star=1~3
    // row=4, star=1~2
    // row=5, star=1~1
    for(int row=1; row <= 5; row++) {
      for(int star=1; star <= 6-row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //       space/star=123456789
    // row=1                *
    // row=2               ***
    // row=3              *****
    // row=4             *******
    // row=5            *********
    //
    // row=1, space=1~4, star=5~5
    // row=2, space=1~3, star=4~6
    // row=3, space=1~2, star=3~7
    // row=4, space=1~1, star=2~8
    // row=5, space=1~0, star=1~9
    for(int row=1; row <= 5; row++) {
      for(int space=1; space <= 5-row; space++) {
        System.out.print(" ");
      }
      for(int star=6-row; star <= row+4; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    //     space/star=123456789
    // row=1          *********
    // row=2           *******
    // row=3            *****
    // row=4             ***
    // row=5              *
    //
    //  row = 1; space 1~0 , star 1~9
    //  row = 2; space 1~1 , star 2~8
    //  row = 3; space 1~2 , star 3~7
    //  row = 4; space 1~3 , star 4~6
    //  row = 5; space 1~4 , star 5~5
        
    for(int row =1; row <=5; row++) {
      for(int space=1; space <= row-1; space++ ) {
        System.out.print(" ");
      }
      for(int star =row; star <= 10-row; star++) {
        System.out.print("*");
      }
    System.out.println();
    }
  }
  
  public static void ex09() {
    for(int i =1; i<10; i+=2) {
      for(int j = 1; j< i; j+=2) {
        System.out.print(" ");
      }
      for(int j =10; j>i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
   // ex01();
   //ex02();
   //  ex03();
   // ex04();
   // ex05();
   // ex06();
   // ex07();
    ex08();
    
//    String str1 = String.format("%d", 10);
//    String str2 = String.format("%3d", 10);
//    String str3 = String.format("%4d", 10);
//    System.out.println(str3+ str2 +str1);
//    System.out.println();
//    String str4 = String.format("%-3d", 10);
//    String str5 = String.format("%-4d", 10);
//    System.out.println(str5 + str4);
    
    
    
  }
  
}