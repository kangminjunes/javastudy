package ex01_mkdirs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 현재 날짜와 시간을 이용하여 디렉터리를 만드시오
    // c:/2023/08/03/14

    LocalDateTime dateTime = LocalDateTime.now();
    int year = dateTime.getYear();          // 년
    int month = dateTime.getMonthValue();   // 월(1~12)
    int day  = dateTime.getDayOfMonth();    // 일
    int hour = dateTime.getHour();          // 시(0~23)
    
    StringBuilder sb = new StringBuilder();
    sb.append("C:");
    sb.append("/");
    sb.append(year);
    sb.append("/");
    sb.append(String.format("%02d", month));
    sb.append("/");
    sb.append(String.format("%02d", day));
    sb.append("/");
    sb.append(String.format("%02d", hour));
    
    File dir = new File(sb.toString());    
    if(dir.exists()) {
      dir.delete(); 
      System.out.println(dir.getPath() + " 디렉터리 생성완료");
      }
    }
  }
  


