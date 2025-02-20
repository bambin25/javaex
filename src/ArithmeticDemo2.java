import java.util.Scanner;

public class ArithmeticDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자를 입력해주세요 : ");
    int a1 = in.nextInt();
    int remainder = a1 % 2;

    if (remainder == 0) {
      System.out.printf("입력받은 숫자는 %d 이며, 짝수 입니다. \n", a1);
    }
    else {
      System.out.printf("입력받은 숫자는 %d 이며, 홀수 입니다. \n", a1);
    }

  }
}
