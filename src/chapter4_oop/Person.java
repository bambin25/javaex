package chapter4_oop;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  public Person setName(String name) {
    this.name = name;
    return this;
  }
  public Person setAge(int age) {
    this.age = age;
    return this;
  }
  public Person sayHello() {
    System.out.printf("제 이름은 %s 이고 나이는 %d 입니다.\n",name,age);
    return this;
  }


}
