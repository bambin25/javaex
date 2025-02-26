package chapter4_oop;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    circle.setRadius(1.0);
    //circle.radius = 0;
    System.out.println(circle.getRadius());
    //System.out.println(circle.radius);
    System.out.println(circle.findArea());

    circle.show();
  }
}
