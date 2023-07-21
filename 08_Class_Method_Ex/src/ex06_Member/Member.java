package ex06_Member;

public class Member {

  private String name;
  private Contact contact;
  
  public Member() {
    
  }
  public Member(String name, Contact contact) {
    this.name = name;
    this.contact = contact;
  }
  
  // Setter
  public void setName(String name) {
    this.name =name;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  // Getter
  public String getName() {
    return name;
  }
  public Contact getContact() {
    return contact;
  }
  
}
