import java.util.Scanner;

public class TernaryOperatorDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("정수를 입력해주세요 : ");
    int number = in.nextInt();
    int remainder = number % 2;
    String evenOdd = (remainder == 0) ? "짝수" : "홀수";
    System.out.printf("입력한 수는 %d 이며, %s 입니다.", number, evenOdd);


  }
}
