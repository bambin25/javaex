package exercise.chapter7;

public class ex3_4 {
  public static void main(String[] args) {
    Person p1 = new Person("박지성",175,40,68);
    Person p2 = new Person("손흥민",180,20,70);
    int res = p1.compareTo(p2);
    //Line p2 = new Line(10);
    if (res == -999) {
      System.out.println("나이를 비교할 수 없습니다.");
    } else {
      if (res > 0) {
        System.out.println(p1.name + "이 나이가 더 많습니다.");
      } else if (res < 0) {
        System.out.println(p2.name + "이 나이가 더 많습니다.");
      } else {
        System.out.println(p1.name + "과 " + p2.name + "은 나이가 같습니다.");
      }
    }
  }
}

class Person implements Comparable {
  String name;
  int age; // 기준점
  int height;
  int weight;

  public Person(String name, int height, int age, int weight) {
    this.name = name;
    this.height = height;
    this.age = age;
    this.weight = weight;
  }

  @Override
  public int compareTo(Object o) {
    int result = -999;
    if (o instanceof Person p) {
      if (this.age > p.age) result = 1;
      else if (this.age < p.age) result = -1;
      else result = 0;
    }
    return result;
  }
}
