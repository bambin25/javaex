package array;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    zero(c1);
    System.out.println(c1);

    Circle c2 = new Circle(10.0);
    zero(c2);
    System.out.println(c2);
  }

  static void zero(Circle c) {
    // 인수 c1 이 매개변수 c에 복사된다.
    // c1 과 c 는 동일한 Circle 객체를 가리킨다.
    // zero() 메서드에서 c.radius 에 0.0 을 대입한다.
    c.radius = 0.0;
  }

  static void zero(double radius) {
    radius = 0.0;
  }
}