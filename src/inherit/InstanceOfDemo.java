package inherit;

public class InstanceOfDemo {
  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();
    Worker w = new Worker();

    System.out.println(p instanceof Person);
    System.out.println(s instanceof Student);
    System.out.println(w instanceof Worker);

    System.out.println(s instanceof Person);
    System.out.println(w instanceof Person);

    System.out.println(s instanceof Object);
    //System.out.println(s instanceof Worker);
    //System.out.println(s instanceof String);

  }
}
