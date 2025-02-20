import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long result = (long)a * b;
    System.out.println(result);

    int apple = 1;
    double priceUnit = 0.1;
    double number = 7;

    double result2 = number * priceUnit;
    System.out.println(result2);

    Scanner in =new Scanner(System.in);
    System.out.print("어떤 숫자로 나눌까요 (ex- 0.1과 같은 실수) ? ");
    double i = in.nextDouble();
    System.out.println(3 / i);
    System.out.println(3 % i);



  }
}
