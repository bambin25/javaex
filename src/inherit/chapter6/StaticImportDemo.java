package inherit.chapter6;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class StaticImportDemo {
  public static void main(String[] args) {
    int[] data = {3, 5, 1, 7};

    sort(data);

    sort(data);

    sort(data);

  }
}
