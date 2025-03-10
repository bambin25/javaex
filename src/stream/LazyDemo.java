package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);// 1,2,3,4,5

    IntStream filterStream = intStream.filter(i -> i%2 == 0);
    IntStream mapStream = filterStream.map(x -> x * x);
    mapStream.forEach(s -> System.out.println(s));

    IntStream.rangeClosed(1, 5)
            .filter(i -> i%2 == 0) // 중간연산
            .map(x -> x * x)       // 중간연산
            .forEach(s -> System.out.println(s)); // 최종연산

    System.out.println();
    // 무한 생성해주는 난수 (0부터 10사이의 정수를 무한생성) 를 이용해 스트림을 만들고
    // 홀수만 걸러내고
    // 3개만 한정
    // 2배한 결과를 출력하라.
//    IntStream.generate(() -> new Random().nextInt(10))
//        .filter(i -> i%2 == 1)
//        .limit(3)
//        .map(x -> 2*x)
//        .forEach(System.out::println);

    IntStream.generate(() -> new Random().nextInt(10)) // supplier () -> { Random r = new Random(); return r.nextInt(10) }
        .filter(i -> i%2 == 1) // IntPredicate (i) -> 조건식 ( 리턴값이 boolean )
        .limit(3)
        .map(i -> 2 * i) // IntUnaryOperator (i) -> i * 2
        .forEach(i -> System.out.println(i)); // IntConsumer (x) -> action

  }
}
