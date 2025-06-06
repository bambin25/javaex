package exercise.chapter7;

import java.util.Arrays;

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
    // 배열에 Person 클래스를 담고 정렬하기
    Person[] persons = {
        new Person("박지성", 40, 175, 68),
        new Person("손흥민", 20, 180, 70),
        new Person("홍길동", 32, 170, 75)
    };
    // 오름차순으로 정렬
    Arrays.sort(persons);
    System.out.println("오름차순으로 정렬한 결과");
    for (Person person : persons) {
      System.out.println(person);
    }
    System.out.println("내림차순으로 정렬한 결과");
    // 내림차순으로 정렬하는 방법 - 함수형 인터페이스와 람다식을 활용하여 !!
    Arrays.sort(persons, (pi, pj) -> pj.compareTo(pi));
    System.out.println(Arrays.toString(persons));

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

  @Override
  public String toString() {
    return "Person[" +
        "이름=\"" + name + '\"' +
        ", 나이=" + age +
        ", 키=" + height +
        ", 몸무게=" + weight +
        ']';
  }
}
