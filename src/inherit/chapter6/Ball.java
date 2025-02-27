package inherit.chapter6;

public class Ball extends Circle {
  private String color;

  public Ball(String color){
    this.color = color;
  }
  public String findColor(){
    return color;
  }

  public void findVolume(){
    System.out.println("부피는 " + 3/(double)4 * (Math.PI * radius * radius * radius) + "입니다.");
  }

  @Override
  public void findArea() {
    System.out.println("넓이는 " + 4 * Math.PI * radius * radius + "입니다.");
  }
}
