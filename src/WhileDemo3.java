import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    // 조건식
    Scanner in = new Scanner(System.in);
    System.out.print("구구단 몇 단 출력할까요?");
    int dan = in.nextInt();

    // while ( ) 무한반복
    while (true) {
      // 조건식, 분기식
      if(dan < 2 || dan > 9) {
        break;
      }
      // 반복실행문
      for(int i=1;i <= 9; i++) {
        System.out.printf("%d X %d = %d \n", dan, i, dan*i);
      }
      // 증감식
        System.out.print("구구단 몇 단 출력할까요?");
        dan = in.nextInt();
    }

  }
}
