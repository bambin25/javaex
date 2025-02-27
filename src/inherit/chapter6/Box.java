package inherit.chapter6;

public class Box {
  public Box(String s) {}
  public Box(){}
}

class ColoredBox extends Box {
  public ColoredBox(){
    //System.out.println(); 무조건 super가 맨위에 와야한다
    super();
    System.out.println();
  }
}
