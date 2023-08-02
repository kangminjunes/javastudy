package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  private String name;
  private List<Car> cars = new ArrayList<Car>();
  private final int MAX = 5;
  private Scanner sc = new Scanner(System.in);
  
  public ParkingLot(String name) {
    this.name = name;
  }
  
  public void addCar() {
    try {
        System.out.println("현재 등록된 차량: " + cars.size() + "대");
        if (cars.size() >= MAX) {
            System.out.println("만차입니다. 더 이상 차량 등록이 불가능합니다.");
            return;
        }

        System.out.println("차량번호 입력 >>>");
        String carNo = sc.next();
        System.out.println("모델 입력 >>>");
        String model = sc.next();

        Car newCar = new Car(carNo, model);
        cars.add(newCar);
        System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
    } catch (Exception e) {
      sc.nextLine();
      return;
    }
}

  public void deleteCar() {
    try {
        if (cars.isEmpty()) {
            System.out.println("현재 주차장에 등록된 차량이 없습니다.");
            return;
        }

        System.out.println("삭제할 차량번호 입력 >>>");
        String carNoToDelete = sc.next();
        sc.nextLine();

        boolean foundCar = false;
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getCarNo().equals(carNoToDelete)) {
                cars.remove(i);
                System.out.println("차량번호 " + carNoToDelete + " 차량이 삭제되었습니다.");
                foundCar = true;
                break;
            }
        }

        if (!foundCar) {
            System.out.println("차량번호 " + carNoToDelete + " 차량이 존재하지 않습니다.");
        }
    } catch (Exception e) {
        sc.nextLine();
        return;
    }
}

public void searchCar() {
    try {
        if (cars.isEmpty()) {
            System.out.println("현재 주차장에 등록된 차량이 없습니다.");
            return;
        }

        System.out.println("조회할 차량번호 입력 >>>");
        String carNoToSearch = sc.next();
        sc.nextLine();
        boolean foundCar = false;
        for (Car car : cars) {
            if (car.getCarNo().equals(carNoToSearch)) {
                System.out.println("조회 결과: " + car);
                foundCar = true;
                break;
            }
        }

        if (!foundCar) {
            System.out.println("차량번호 " + carNoToSearch + " 차량이 존재하지 않습니다.");
        }
    } catch (Exception e) {
      sc.nextLine();
      return;
    }
}

public void printAllCars() {
    if (cars.isEmpty()) {
        System.out.println("현재 주차장에 등록된 차량이 없습니다.");
        return;
    }
    System.out.println("대박주차장 차량 목록");
    int count = 0;
    for (Car car : cars) {
        count++;
        System.out.println(count + "번째 차량: " + car);
    }
}

  
  public void manage() {
    while(true) {
      System.out.print("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
      String choice = sc.next();
      switch(choice) {
      case "1": addCar(); break;
      case "2": deleteCar(); break;
      case "3": searchCar(); break;
      case "4": printAllCars(); break;
      case "0": System.out.println("주차관리 프로그램을 종료합니다."); return;
      default: System.out.println("존재하지 않는 메뉴입니다.");
      }
    }
  }
  
}