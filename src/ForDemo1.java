import java.util.Scanner;

public class ForDemo1 {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.print("구구단을 지정하세요 : ");
//    int dan = in.nextInt();

    for (int dan = 2; dan <=9 ; dan++)
    {
      System.out.println("---------------------------");
      for (int i = 1; i <= 9 ; i++) {
        System.out.printf("%d X %d = %d \n", dan, i, dan*i);
      }
    }

  }
}
