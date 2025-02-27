package chapter4_oop;

public class SingleTonDemo {
  public static void main(String[] args) {
    SingleTon s1 = SingleTon.getInstance();
    s1.method1();
    SingleTon s2 = SingleTon.getInstance();
    s2.method1();

    if (s1 == s2) {
      System.out.println("같은 객체-singleton 입니다.");
    }

    Circle c1 = new Circle(10);
    Circle c2 = new Circle(10);

    if (c1.equals(c2)) {
      System.out.println("같은 객체-singleton 입니다.");
    } else {
      System.out.println("다른 객체입니다.");
    }

  }
}
