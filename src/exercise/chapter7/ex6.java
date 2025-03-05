package exercise.chapter7;

public class ex6 {
  public static void main(String[] args) {
    Human.echo();
    Student s = new Student(20);
    s.print();
    s.eat();
    Human p = new Worker();
    p.print();
    p.eat();
    p.print11();
    Human p2 = new Student(20);

//    child c = new Worker();  123(부모) < 12(자식)
    // 자식이 123이 있고 부모가 12만있을때 부모로 업캐스팅을 했을경우
    // 부모는 자식의 123중에서 12만 자식값으로 쓸수 있다.
    // 부모[과자:1개,음료수1개,빵1개] 자식[과자 2개, 빵2개]
    // 부모 = new 자식 (업캐스팅)
    // 부모[과자:2개,음료수2개,빵1개]
    // default 메소드, static메소드
    // abstract 메소드,private 메소드
    // 요렇게 2가지씩 정리하기
    // 이문제는 위의 메소드를 활용하여 Worker클래스를 변경하지않고 부모의 인터페이스의
    // 기본메소드값을 활용하여 출력하는 문제입니다.
    // 그러므로 Human인터페이스에 프린트메서드앞에 default를 붙여줘야합니다.
    // default가 무슨 메서드인지는 저도 아직 잘이해못했어요
    // 그래서 나중에 정리할거 위에다 메모해놨습니다.
  }
}

interface Human {
  void eat() ;
  static void echo(){
    System.out.println("야호 !!!");
  }

  default void print(){
    System.out.println("인간입니다.");
  }
  default void print11(){
    System.out.println("1111.");
  }

}
class Worker implements Human{
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}

class Student implements Human {
  int age;
  public Student(int age) {
    this.age = age;
  }

  @Override
  public void print() {
    System.out.println(age+"세의 학생입니다.");
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }
  public void eat2222() {
    System.out.println("먹습니다.");
  }
}