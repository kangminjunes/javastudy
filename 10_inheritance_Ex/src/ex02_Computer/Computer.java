package ex02_Computer;

public class Computer {
  
  private String model;
  
  // Notebook super(model); 에 의해서 호출되는 생성자
  public Computer(String model) {
    this.model = model;
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
}
