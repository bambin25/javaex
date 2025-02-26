package array;

import java.util.Arrays;

public class MaxFindDemo {
  public static void main(String[] args) {
    int[] values = {2,5,1,8,6};
    int max = values[0];
    int min = values[0];
    for (int i = 0; i < values.length; i++) {
      if (max < values[i]) {
        max = values[i];
      } else if (min > values[i]) {
        min = values[i];
      }
    }

    System.out.println("max = " + max);
    System.out.println("min = " + min);

    System.out.println("정렬 전 : " + Arrays.toString(values));
    Arrays.sort(values);
    System.out.println("정렬 후 : " + Arrays.toString(values));
    System.out.println("max = " + values[values.length - 1]);
    System.out.println("min = " + values[0]);

  }
}
