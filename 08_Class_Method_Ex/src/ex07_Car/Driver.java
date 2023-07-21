package ex07_Car;

public class Driver {

  private String name;
  private int career;
  private boolean bestDriver;  // 기준 career가 10년 이상이면
  
  //setter

  public void setName(String name) {
    this.name = name;
  }
  public void setCareer(int career) {
    this.career = career;
    setBestDriver(career >= 10);
  }
  private void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;
  }
  
  
  // getter
  public String getName() {
    return name;
  }
  public int getCareer() {
    return career;
  }
  public boolean isBestDriver() {  // boolean 타입은 get 다르게 is로 적어야된다
    return bestDriver;
  }
}

