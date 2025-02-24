public class IncrementDemo2 {
  public static void main(String[] args) {
    RefValue ref = new RefValue();
    ref.x = 10;
    System.out.println("호출 전 ref.x = " + ref.x);
    // changePrimitive(ref.x); // call by value (readonly)
    changeReference(ref);
    System.out.println("호출 후 ref.x = " + ref.x);
  }

  static void changePrimitive(int n) {
    System.out.println("메서드 실행 전 n = " + n);
    n = 1000;
    System.out.println("메서드 실행 후 n = " + n);
  }

  static void changeReference(RefValue ref) {
    System.out.println("메서드 실행 전 ref = " + ref.x);
    ref.x = 1000;
    System.out.println("메서드 실행 후 ref = " + ref.x);
  }
}

class RefValue {
  int x;
}
