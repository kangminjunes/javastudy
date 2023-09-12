package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
  
  private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null; 
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      // 파라미터 String spec에는 다운로드 받을 이미지 파일의 URL이 전달된다.
      // 해당 URL의 이미지 파일을 다운로드 받는다.
      
      String baseUrl = "https://openapi.naver.com/v1/search/book.json";
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      bin = new BufferedInputStream(con.getInputStream());
      String fileName = spec.substring(spec.lastIndexOf('/') + 1);
      bout = new BufferedOutputStream(new FileOutputStream("C:/download/" + fileName));
      System.out.println("C:/download/"+ fileName +"파일 다운로드 완료");

      byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = bin.read(buffer)) != -1) {
        bout.write(buffer, 0, bytesRead);
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (bout != null) bout.close();
        if (bin != null) bin.close();
        if (con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public void getSearchList() {
    HttpURLConnection con = null;
    BufferedReader reader = null;

    try {
      
      // 책 검색 OpenAPI를 사용해서 응답 결과 중 이미지(image) 결과만 추출하여
      // generateImage 메소드에 전달한다.
      // 10번의 generateImage 메소드 호출이 필요하다.
      
      String baseUrl = "https://openapi.naver.com/v1/search/book.json";
      String clientId = "jRFHzWTrREsctftYPAq6"; 
      String clientSecret = "9dSQdrH0QD"; 

      Scanner sc = new Scanner(System.in);
      System.out.print("책 관련 검색어를 입력하세요 >>> ");
      String query = sc.nextLine();
      sc.close();

      String apiUrl = baseUrl + "?query=" + URLEncoder.encode(query, "UTF-8");

      con = (HttpURLConnection) new URL(apiUrl).openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      StringBuilder response = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        response.append(line);
      }

      JSONObject jsonResponse = new JSONObject(response.toString());
      JSONArray items = jsonResponse.getJSONArray("items");

      for (int i = 0; i < items.length(); i++) {
        JSONObject item = items.getJSONObject(i);
        String imageUrl = item.getString("image");
        generateImage(imageUrl);
      }

    } catch (Exception e) {
      e.printStackTrace();

      
      // 예외 발생 시 로그파일을 만든다.
      
      // 예외 발생시간
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
      String time = dtf.format(now);
     
      // 예외 메시지
      String message = e.getMessage();
      
      // 예외 클래스
      String clazz = e.getClass().getName();
      
      // 로그 기록할 파일 객체 생성
      File dir = new File("C:/download/log");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "log.txt");
      
      // 기존 로그 파일에 내용 추가작성하는법
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
        bw.write(time + "  " + message + "  " +  clazz);
        bw.newLine();
        System.out.println(file.getPath() + "파일에 로그가 작성되었습니다");
        
        
      } catch (Exception ex) {
        ex.printStackTrace();
      }

    } finally {
      try {
        if (reader != null) reader.close();
        if (con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}