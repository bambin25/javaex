package chapter4_oop;

public class BallDemo2 {
  public static void main(String[] args) {
    int ten = 10;
    int twenty = ten;
    twenty = 20;
    System.out.println("ten = " + ten);
    System.out.println("twenty = " + twenty);

    Ball myBall = new Ball();
    Ball yourBall = new Ball();

    System.out.println("myBall.radius = " + myBall.radius);
    System.out.println("yourBall.radius = " + yourBall.radius);

    myBall = yourBall;

    yourBall.radius = 10.0;
    System.out.println("myBall.radius = " + myBall.radius);
    System.out.println("yourBall.radius = " + yourBall.radius);


  }
}
