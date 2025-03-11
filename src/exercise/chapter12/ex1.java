package exercise.chapter12;

import java.util.List;
import java.util.stream.Stream;

public class ex1 {
  public static void main(String[] args) {
    //다음과 같이 점수 리스트가 있다. 점수가 너무 낮아 10점씩 상향 조정하여 결과를 출력하
    //려고 한다. 이를 위하여 밑줄 친 부분에 적절한 내용은 ?
    //si.______.forEach(System.out::println);

    List<Integer> scores = List.of(45,76,38,27,50);
    Stream<Integer> si = scores.stream();
    si.map(i -> i + 10).forEach(System.out::println);

  }
}
