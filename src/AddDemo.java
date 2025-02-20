public class AddDemo {
  public static void main(String[] args) {
    int j = 0, i = 1;
    System.out.printf("연산 전 : j = %d, i = %d \n", j, i);
    // j = ++i;
    j = i++;
    System.out.printf("연산 전 : j = %d, i = %d \n", j, i);

  }
}
