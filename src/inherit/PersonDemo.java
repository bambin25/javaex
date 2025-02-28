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

    //Person p1 = new Person();
    //Student s3 = (Student)p1;

    System.out.println("다형성과 배열");
    //Person을 담는 배열선언을 하고 여기에 student,worker를 담을 수 있다.
    Person[] persons = new Person[3];
    persons[0] = new Student(); // upcasting
    persons[1] = new Worker();  // upcasting
    persons[2] = new Person();

    Student st = (Student) persons[0];
    st.work();
    Worker wk = (Worker) persons[1];
    wk.work();
    persons[2].whoami();

    System.out.println("다형성과 메서드의 매개변수");
    Person p1 = new Person();
    methodAll(p1);
    Student s2 = new Student();
    methodAll(s2);
    Worker w3 = new Worker();
    methodAll(w3);
  }

  static void method1(Student s){
    s.work();
  }

  static void method2(Worker w){
    w.work();
  }

  static void methodAll(Person p){
    if (p instanceof Student s) {
      //Student s = (Student)p;
      s.work();
    } else if (p instanceof Worker w) {
      //Worker w = (Worker) p;
      w.work();
    } else if (p instanceof Person) {
      p.whoami();
    }
  }

}
