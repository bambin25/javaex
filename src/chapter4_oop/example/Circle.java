package chapter4_oop.example;

class Circle {
  double radius;
  String color;
  static int numberOfCircle;

  public Circle() {
    // 반지름은 직접 입력해준다.
    // color
    this(10.0,"빨강");
  }

  public Circle(double radius) {
    this(radius, "빨강");
  }

  public Circle(String color) {
    this(10.0,color);
  }

  public Circle(double radius, String color) {
    if (radius <= 0) {
      this.radius = 10.0;
    } else {
      this.radius = radius;
    }
    if (color != null && color.length() > 0) {
      this.color = color;
    } else {
      this.color = "빨강";
    }
    numberOfCircle++;
  }

}
