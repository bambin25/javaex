public class MemoryStructureDemo {
  public static void main(String[] args) {
    Data data = new Data();
    System.out.println("data = " + data.x);
    MethodClass mc = new MethodClass();
    System.out.println(mc.add(1,2));
    change(data);
    System.out.println("after change : data = " + data.x);

  }

  static void change(Data data) {
    data.x = 1000;
  }

}

class Data {
  // 기본 생성자는 생략되있다
  int x;
}

class MethodClass {
  // 기본 생성자
  int add(int a, int b) {
    return a + b;
  }
}

