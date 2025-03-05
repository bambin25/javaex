package exercise.chapter8;

public class ex1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");
    Person p3 = new Person("123456", "손흥민");
    if (p1.equals(p2))
      System.out.println("같은 사람이다.");
    else
      System.out.println("다른 사람이다.");

    if (p2.equals(p3))
      System.out.println("같은 사람이다.");
    else
      System.out.println("다른 사람이다.");
  }
}

class Person {
  String num;
  String name;

  public Person(String num, String name) {
    this.num = num;
    this.name = name;
  }
}