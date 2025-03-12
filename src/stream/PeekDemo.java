package stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekDemo {
  public static void main(String[] args) {
    // peek()은 단지 중간 연산
    //스트림의 처리 중간에 요소를 확인하거나 부수적인 작업을 수행하는 데 유용한 메서드
    //그러나 디버깅을 제외하고는, 주로 순수한 데이터 처리를 목적으로 사용하는 경우에는
    // peek()을 과도하게 사용하지 않는 것이 좋음
    Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);
    System.out.println("어디 나타날까?");
    Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
    System.out.println();
    System.out.println(on.get());

    System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());

    sn = Nation.nations.stream();
    System.out.println(sn.count());
  }
}
