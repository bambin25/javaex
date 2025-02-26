package chapter4_oop;

public class Circle {
  // 원의 반지름과 넓이를 구하고자 한다.
  // 원의 넓이는 0보다 커야 한다.
  // 원이 생성될 때 크기가 정해진다. 크기는 생성 후에도 변경될 수 있다.
  // 원의 반지름과 넓이를 출력하는 기능이 있으면 좋겠다.
  public Circle(double radius) {
    this.radius = radius;
  }
  // 인스턴스 멤버
  // 필드
  private double radius;
  // 접근자(getter)와 설정자(setter)
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius){
    if (radius <= 0) {
      System.out.println("원의 반지름은 0 보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }
  // 메서드
  double findArea() {
    final double PI = 3.141592653589793;
    return PI * radius * radius;
  }

  void show() {
    System.out.printf("원의 반지름은 %4.1f 이고 원의 넓이는 %.2f 입니다. \n", radius, findArea());
  }


}
