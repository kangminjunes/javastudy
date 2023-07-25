package ex06GameUnit;

public class Marine extends GameUnit {

  private final int POWER = 5;
  
  // new Marine("마린")
  public Marine(String name) {
    super (name); // public GameUnit(String name){} 생성자를 호출 한다.
    
  }
  
  @Override
  public void attack(GameUnit other) {
    System.out.println(getName() + "의 공격!");
    if(POWER >= other.getHp()) {
      other.setHp(0);
    }else {
    other.setHp(other.getHp() - POWER);
    }
  }
}