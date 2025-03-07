package exercise.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ex2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공",20)); set.add(new Person("최고봉",56));
    set.add(new Person("우등생",16)); set.add(new Person("나자바",35));
    
    // iterator 를 정리해서 활용해야함 아래의 for문은 iterator를 활용잘못하는거임
//    Iterator iter = set.iterator();
//    for (int i = 0; i < set.size(); i++) {
//      System.out.println(iter.next() + " ");
//    }
//    System.out.println();
//    for (Person person : set) {
//      System.out.print(person + " ");
//    }
    // Iterator 를 사용한 반복문 - from gpt
    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      Person p = iterator.next();
      System.out.println(p.name + " : " + p.age);
    }
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

  }
}

class Person {
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  String name;
  int age;

  @Override
  public String toString() {
    return "Person[" + name +
        " : " + age +
        ']';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return hashCode() == person.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
