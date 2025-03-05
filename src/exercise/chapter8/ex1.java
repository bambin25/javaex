package exercise.chapter8;

import java.util.Objects;

public class ex1 {
  public static void main(String[] args) {
    Circle c1 = new Circle(3,"빨강");
    Circle c2 = new Circle(3,"빨강");

    if (c1.equals(c2)) {
      System.out.println("c1 과 c2는 같다.");
    } else {
      System.out.println("c1 과 c2는 다르다.");
    }
  }
}

class Circle {
  // 필드
  int radius;
  String color;
  //생성자 생성
  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }
  // 알트인서트 - equals and hashCode() 생성
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return this.hashCode() == circle.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius,color);
  }
}