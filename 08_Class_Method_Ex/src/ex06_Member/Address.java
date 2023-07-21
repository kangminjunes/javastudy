package ex06_Member;

public class Address {

  private String postCode;
  private String roadAddr;    // 도로명 주소
  private String jibunAddr;   // 지번 주소
  private String detailAddr;  // 상세주소
  
  public Address() {
    
  }
  
  public Address (String postCode, String roadAddr, String jibunAddr, String detailAddr ) {
   this.postCode  = postCode;
   this.roadAddr  = roadAddr;
   this.jibunAddr = jibunAddr;
   this.detailAddr = detailAddr;
  }
  
  // Setter
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  public void setRoadAddr(String roadAddr) {
    this.roadAddr = roadAddr;
  }
  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr = jibunAddr;
  }
  public void setDetailAddr(String detailAddr) {
    this.jibunAddr = jibunAddr;
  }
  
  // Getter
  public String getPostCode() {
    return postCode;
  }
  
  public String getRoadAddr() {
    return roadAddr;
  }
  public String getJibunAddr() {
    return jibunAddr;
  }
  public String getDetailAddr() {
    return jibunAddr;
  }
}
