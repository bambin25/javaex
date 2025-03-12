package stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceDemo {
  public static void main(String[] args) {
    // Stream 인터페이스는 람다식을 사용하여 복합적인 집계 결과를 도출할 수 있도록 리듀싱 기능을 제공
    // 리듀싱 연산은 스트림원소를 단 하나의 값으로 축약시키는 연산이다.
    List<Integer> numbers = List.of(3,4,5,1,2); // 0 -> 초기값
    int reduce = numbers.stream().reduce(0, (i, j) -> i + j);
               // i의 초기값 0에서 스트림으로 불러온 숫자를 sum처럼 계속 더해가는 방식
               // i=0-> +3 +4 +5 +1 +2 ==> 15
    int reduce1 = numbers.stream().reduce(1, (a, b) -> a * b);
    System.out.println(reduce + ":" + reduce1);

    Optional<Integer> reduce2 = numbers.stream().reduce(Integer::sum);
    System.out.println(reduce2.get());
    Optional<Integer> reduce3 = numbers.stream().reduce(Integer::max);
    System.out.println(reduce2.get());


    IntStream intStream = numbers.stream().mapToInt(x -> x);
    int reduce4 = intStream.reduce(0, (x, y) -> x + y);

    IntStream intStream1 = numbers.stream().mapToInt(x -> x.intValue());
    OptionalInt reduce5 = intStream1.reduce(Integer::sum);
    System.out.println(reduce5.getAsInt());

  }
}
