package chapter4_oop;

public class Ball {
  // 생성자 (Constructor) <=> 소멸자
  public Ball() { // 기본생성자

  }
  public Ball(double radius) {
    this.radius = radius;
  }
  // 필드 (변수)
  public double radius;

  // 메서드 (동작)
  public double getVolume(){
    return 4/3 * 3.14 * radius * radius * radius ;
  }
  static void print(){
    System.out.println("공입니다.");
  }

  @Override
  public String toString() {
    return "반지름이 "+ radius + " 인 원입니다.";
  }

}
