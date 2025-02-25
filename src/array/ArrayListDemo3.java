package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    // 재활용성 / 유지보수가 편하게 작성해야 한다.
    // 1. 시험점수를 사용자로부터 입력받는다. 단, 과목의 수는 정해져있지 않다.
    // 2. -1을 입력받을 때 까지 과목의 점수를 입력받는다.
    // 3. 입력받은 점수를 동적배열에 저장한다.
    // 4. while 문을 사용한다 <== 점수 입력
    // 5. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    // 6. 입력받은 점수, 합계와 평균을 출력한다.
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int score , total = 0;
    while (true) {
      System.out.print("과목의 점수를 입력하세요. (입력 종료하려면 - 값 입력): ");
      score = in.nextInt();
      if (score < 0) {
        break;
      } else {
        scores.add(score);
      }
    }

    System.out.println("scores = " + scores);

//    for (int i = 0; i < scores.size(); i++) {
//      total += scores.get(i);
//    }
    for (Integer i : scores) {
      total += i;
    }

    float avg = total / (float)scores.size();
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

  }
}
