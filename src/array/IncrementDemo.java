package array;

public class IncrementDemo {
  public static void main(String[] args) {
    int[] x = {0};
    System.out.println("호출 전 x[0] = " + x[0]);
    increment(x);
    System.out.println("호출 후 x[0] = " + x[0]);

  }

  public static void increment(int[] n) {
    System.out.println("메서드 안, 변경 전 n[0] = " + n[0]);
    n[0]++;
    System.out.println("메서드 안, 변경 후 n[0] = " + n[0]);
  }
}
