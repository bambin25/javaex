package exercise.chapter6;

public class ex4 {
  public static void main(String[] args) {
    Parent p1 = new Parent();
    System.out.println(p1.name);
    p1.prin();

    Parent p2 = new Child();
    System.out.println(p2.name);
    p2.prin();
  }
}

class Parent {
  String name = "영조";
  void prin(){
    System.out.printf("나는 %s다. \n",name);
  }
}

class Child extends Parent {
  String name= "사도세자";
  void print(){
    System.out.printf("나는 %s다. \n", name);
  }
}
