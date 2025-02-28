package exercise;

import java.util.Arrays;

public class ex4 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"}; // 각줄마다 주석으로 해석하고정리한거 써보는거 추천한다구함
    System.out.println(name);
    System.out.println(Arrays.toString(name));
    int index;
    for (int i = 0; i < 10; i++) {
      index = (int)((Math.random() * 3));
      System.out.println(name[index]);
      // 0
      // 1
      // 2

    }

  }
}
