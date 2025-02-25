package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExampleChapter5_9 {
  public static void main(String[] args) {
    // 학생들의 점수를 분석하는 프로그램을 만들려고 합니다. 키보드로부터 학생수와 각 학생들의
    // 점수를 입려받고 while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 총점 및 평균 점수를
    // 출력하는 코드를 작성해 보세요.
    // -----------------------------------------------------
    //  1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    // -----------------------------------------------------

    String menu = """
          -----------------------------------------------------
           1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료
          -----------------------------------------------------
          """;
    Scanner in = new Scanner(System.in);
    String menuItem = "";
    int numOfStudents = 0;
    int[] scores = {}; // ""
    int total;
    float avg = 0.0f;

    while (true) {
        System.out.println(menu);
        System.out.print("선택 > ");  //     5
        menuItem = in.nextLine();
        if (menuItem.equals("5")) {
          System.out.println("프로그램을 종료합니다ㅏ.");
          break;
      } else if (menuItem.equals("1")) {
          System.out.print("학생수> ");
          numOfStudents = Integer.parseInt(in.nextLine());

          System.out.println(Arrays.toString(scores));
      } else if (menuItem.equals("2")) {
          scores = new int[numOfStudents]; // int[] 괄호안에 pasrInt한 numOf인 숫자 3을 넣으면서
          // new 연산자를 통해 새로 int[] 배열을 새로 만든것을 scores배열이란 참조변수에 넣어놓는다는뜻 
          for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("score[%d] : ", i);
            scores[i] = Integer.parseInt(in.nextLine());
            System.out.println(Arrays.toString(scores));
          }
      } else if (menuItem.equals("3")) {
          for (int score : scores) {  // int socre를 새로 변수 선언함
            System.out.println(score);
          }
      } else if (menuItem.equals("4")) {
        total = 0;
        for (int score : scores) {
          total += score;
        }
        avg = total / (float)numOfStudents;
        System.out.println("전체 학생 점수 합계 : " + total);
          System.out.println("평균 점수 : " + avg);
      } else {
          System.out.println("메뉴 번호를 확인하세요.");
        }

    }


  }
}
