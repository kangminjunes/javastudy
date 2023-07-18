package ex;

import java.util.Arrays;

public class Mainwrapper3 {

  public static void ex01(int [] a) { // int [] a = 0x1000000;
    System.out.println(Arrays.toString(a));
    a[0] = 100;
    System.out.println("ex01의 배열 a=" + Arrays.toString(a));
    a[1]= 30;
  }
  
  public static void main(String[] args) {
    int[] a = {10, 20, 30};
    ex01(a);
    System.out.println("main의 배열 a = " + Arrays.toString(a));
  }

}


