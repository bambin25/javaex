package example;

import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {
    // 두 개의 숫자를 입력 받아서 더해서 출력해주는 프로그램을 while 문과 method 를 이용해서 작성하라.
    // while 문의 종료 조건은 음수 값을 입력하는 경우이다.
    Scanner in = new Scanner(System.in);

    while(true) {
      System.out.print("첫번째: ");
      int num1 = in.nextInt();
      if(num1 < 0) {
        break;
      }
      System.out.print("두번째: ");
      int num2 = in.nextInt();
      if(num2 < 0) {
        break;
      }
      System.out.printf("%d 과 %d 를 더한 결과는 %d입니다. \n", num1,num2, add(num1,num2));
    } // end of while


//    while (true) {
//      System.out.print("첫 번째 숫자를 입력하세요.(종료하려면-1 입력) : ");
//      int n1 = in.nextInt();
//      if (n1<0) {
//        break;
//      } // 두개 다 받고 둘중에 하나가 0보다 작으면이라고 처리해도 됨
//      System.out.print("두 번째 숫자를 입력하세요.(종료하려면-1 입력) : ");
//      int n2 = in.nextInt();
//      if (n2<0) {
//        break;
//      }
//      System.out.printf("%d와 %d 의 합은 %d 입니다. \n",n1,n2,sum(n1,n2));
//
//    } // end of main method

    // 내가 그냥 해본 코드(근데 틀림)
//    System.out.println("두개의 숫자를 입력해주세요. (종료하려면 -값을 입력하세요) : ");
//    int n1 = in.nextInt();
//    int n2 = in.nextInt();
//    int total = sum(n1,n2);
//
//    while (total >= 0) {
//      if(total >= 0) {
//        System.out.printf("두값의 합은 %d 입니다. \n", total);
//      }
//      // 증감식
//      System.out.println("두개의 숫자를 입력해주세요. (종료하려면 -값을 입력하세요) : ");
//      n1 = in.nextInt();
//      n2 = in.nextInt();
//    }


    // while문의 종료 조건은 음수 값을 입력하는 경우이다.


  } // end of main method

  static int add(int num1, int num2) {
    return num1 + num2;
  }

//  static int sum(int num1, int num2) {
//    int total = 0;
//    total = num1 + num2;
//    return total;
//  }

} // end of class
