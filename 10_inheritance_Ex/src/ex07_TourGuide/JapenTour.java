package ex07_TourGuide;

public class JapenTour implements Tour {

  @Override
  public void sightseeing() {
    System.out.println("돈기호테");

  }

  @Override
  public void leisure() {
    System.out.println("온천");

  }

  @Override
  public void meal() {
    System.out.println("스시");

  }

}
