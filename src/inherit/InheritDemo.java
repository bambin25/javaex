package inherit;

public class InheritDemo {
  public static void main(String[] args) {
    Eagle e = new Eagle();
    Tiger t = new Tiger();
    Goldfish g = new Goldfish();
    e.sleep();
    t.sleep();
    g.sleep();

  }
}

class Animal {
  String eye;
  String mouth;
  void eat(){
    System.out.println("먹습니다.");
  }
  void sleep(){
    System.out.println("잡니다.");
  }
}

class Eagle extends Animal {
  String wing;
  void fly(){}
}

class Tiger extends Animal {
  String leg;
  void run(){}
}

class Goldfish extends Animal {
  String fin;
  void swim(){}
}

