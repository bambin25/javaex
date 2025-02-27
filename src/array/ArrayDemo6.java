package array;

public class ArrayDemo6 {
  public static void main(String[] args) {
    // 원을 원소로 가지는 배열을 선언한 후 5개의 원을 초기화하라.
    // 원의 반지름은 1~5 까지이다.
    // 모든 원의 반지름과 넓이를 출력하라.

    Circle[] circles = new Circle[5];

    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle(i + 1.0);
    }

    for (Circle circle : circles) {
      System.out.println(circle.getRadius());
      System.out.println(circle.findArea());
    }
    // 참조변수 circle 을 출력하면 원의 반지름과 넓이를 출력하게 하려면 ???
    // ==> toString 에 원의 반지름과 넓이를 출력하는 코드 추가
    // iter (live template 활용)
    for (Circle circle : circles) {
      System.out.println(circle);
    }

  }
}
