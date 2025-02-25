package array;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    String s = "hello";
    System.out.println(s);

    // 배열의 초기화 방법 1
    int[] scores = {0,90,80,95,85,70,10,20,30,40,50,60,100};
    System.out.println("scores = " + scores);
    // 배열의 초기화 방법 2
    int[] scores1 = new int[]{1,2,3,4,5};
    // 배열의 초기화 방법 3
    int[] scores2 ;
    scores2 = new int[]{1,2,3,4,5};
    //error
//    int[] scores3;
//    scores3 = {1,2,3,4,5};
    System.out.println("scores[last] ==> " + scores[scores.length - 1]); // O(1)  (빅오의 일)

    for (int i = 0; i < scores.length; i++) {
      if(scores[i] == 100) {
        System.out.printf("%d 번째에서 찾았다. \n", i + 1);
        break;
      } // 빅오 표기법 - O(n), 최악의 경우
    }

    System.out.print("{");
    for (int i = 0; i < scores.length; i++) {
      if(i == scores.length - 1) {
        System.out.print(scores[i]);
      } else {
        System.out.print(scores[i] + ",");
      }
    }
    System.out.print("}\n");
    System.out.println(Arrays.toString(scores));

    System.out.print("{");
    for (int i = 0; i < scores1.length; i++) {
      if(i == scores1.length - 1) {
        System.out.print(scores1[i]);
      } else {
        System.out.print(scores1[i] + ",");
      }
    }
    System.out.print("}\n");
    System.out.println(Arrays.toString(scores1));

    char[] chars = {'a', 'b', 'c'};
    System.out.println("chars = " + chars);

    System.out.println(Arrays.toString(chars));


  }
}
