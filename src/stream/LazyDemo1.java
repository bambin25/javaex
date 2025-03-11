package stream;

import java.util.stream.IntStream;

public class LazyDemo1 {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1, 5);

    is.filter(i -> {
      System.out.println("filter : " + i);
      return i % 2 == 0;
    }).map(x -> {
      System.out.println("map : " + x);
      return  x * x;
    });

    //.forEach(System.out::println); 를 붙여야 결과물이 나온다.
    // lazy만으론 콘솔 출력이 안된다.
  }
}
