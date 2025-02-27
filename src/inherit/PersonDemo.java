package inherit;

public class PersonDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = s; // 자손은 부모타입의 참조변수로 자동 형변환
    System.out.println(p.name);
    p.whoami();

    Student s1 = (Student)p; // 명시적, 강제 형변환
    System.out.println(s1.name);
    s1.whoami();
    System.out.println(s1.number);
    s1.work();

    Person p1 = new Person();
    //Student s3 = (Student)p1;


    //Person을 담는 배열선언을 하고 여기에 student,worker를 담을 수 있다.
    Person[] persons = new Person[3];
    persons[0] = new Student();
    persons[1] = new Worker();
    persons[2] = new Person();
  }

  static void method1(Student s){
    s.work();
  }

  static void method2(Worker w){
    w.work();
  }

  static void methodAll(Person p){

  }

}
