package array;

class Circle {
  // 생성자 (원의 반지름을 초기화)
  public Circle(double radius){
    this.radius = radius;
  }
  // 필드 - 반지름
  double radius;
  // 메서드
  // 반지름을 구하는 메서드
  public double getRadius(){
    return radius;
  }
  // 넓이를 구하는 메서드
  public double findArea(){
    return Math.PI * radius * radius;
  }

  // 여기에 toString 을 오버라이드 해보자.
  // control + O 눌러서 메서드 선택

  @Override
  public String toString() {
    return String.format("원의 반지름과 넓이 : %.1f , %.2f", radius, findArea());
    //return "원의 반지름과 넓이 : " + radius + "," + findArea();
  }
}
