package ex06_Member;

public class Contact {

  private String homeTel;
  private String mobile;
  private Address address;

  public Contact() {
  
  }

  public Contact(String homeTel, String mobile, Address address) {
    this.homeTel = homeTel;
    this.mobile = mobile;
    this.address = address;
  }
  
  //Setter
  public void setHomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  
  //getter
  
  public String getHomeTel() {
    return homeTel;
  }
  
  public String getMobile() {
    return mobile;
  }
  public Address getAddress() {
    return address;
  }

  
 
}
