package array;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1,2,3,4,5,6,7,8,9,10);
    printSum(1,2,3,4,5,6);
    printSum(1,2,3,4,5);
    printSum(1,2,3,5);
    printSum(10,20,30);

  }
  private static void printSum(int... v) {
    int sum = 0;
    for (int i : v) {
      sum += i;
    }
    System.out.println(sum);
  }
}
