package inherit;

public class Vehicle {
  String name = "탈 것";

  void whoami(){
    System.out.println("나는 탈 것이다.");
  }
  static void move(){
    System.out.println("이동한다.");
  }
}

class Car extends Vehicle {
  String name = "자동차";
  @Override
  void whoami() {
    System.out.println("나는 자동차이다.");
  }
  static void move(){
    System.out.println("달리다.");
  }
}

class SportsCar extends Car {
  @Override
  void whoami() {
    System.out.println("나는 스포츠 자동차이다.");
  }
}
