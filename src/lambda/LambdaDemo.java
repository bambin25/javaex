package lambda;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new AnyObject() {
//      int max(int a, int b) {
//        return a > b ? a : b;
//      }
//    };
//    System.out.println(obj.max(3,5)); // ==> 5

//    MyFunction m = new MyFunction() {
//      @Override
//      public int max(int a, int b) {
//        return a > b ? a : b;
//      }
//    };

    MyFunction m2 = (int a, int b) -> a > b ? a : b;

    //System.out.println(m.max(3,5)); // => 5
    System.out.println(m2.max(10,5)); // => 10
  }
}

@FunctionalInterface
// 함수형 인터페이스 - 단 하나의 추상메서드만 가지는 인터페이스
interface MyFunction {
  public abstract int max(int a, int b);
}

//(a,b) -> a > b ? a : b;
//class AnyObject {
//  class Anonymouse {
//    int max(int a, int b) {
//      return a > b ? a : b;
//    }
//  }
//}
