package chapter4_oop;

public class BallDemo {
  public static void main(String[] args) {
    Ball ball = new Ball();
    Ball.print();
    System.out.println("공의 반지름은 " + ball.radius);
    System.out.println("공의 부피는 " + ball.getVolume());

    Ball b = new Ball(5.0);
    System.out.println("공의 반지름은 " + b.radius);

    Ball c = new Ball(5.0);
    System.out.println("공의 반지름은 " + c.radius);

  }
}
