package enumType;

public class PeopleDemo {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "홍길동";
    person.age = 20;
    person.gender = Gender.MALE;


    if (person.gender == Gender.FEMALE) {
      System.out.println("여성입니다.");
    } else {
      System.out.println("남성입니다.");
      System.out.println(person.gender);
    }


  }
}
