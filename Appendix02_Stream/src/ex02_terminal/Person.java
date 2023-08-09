package ex02_terminal;

import java.util.Objects;

public class Person {

  private String name;
  private int age;
  
  public Person() {
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  public Person(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }
  
  
}
