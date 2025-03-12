package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
  public static void main(String[] args) {
    // collector 연산 어려우..
    // 스트림의 요소들을 집합체나 컬렉션으로 수집하는 연산
    // Collector는 Stream을 최종 연산으로 마무리할 때 사용되며,
    // 예를 들어 리스트, 맵, 집합 등으로 변환할 수 있음
    // 스트림을 다양한 형태로 "모을" 때 사용되며,
    // 집계나 그룹화, 문자열 결합 등 여러 가지 처리가 가능
    Stream<Nation> s1 = Nation.nations.stream();
    Double avg = s1.collect(Collectors.averagingDouble(Nation::getPopulation));
    System.out.println("인구의 평균 : " + avg);

    Stream<Nation> s2 = Nation.nations.stream();
    Long count = s2.collect(Collectors.counting());
    System.out.println("나라 개수 : " + count);

    Stream<Nation> s3 = Nation.nations.stream();
    String names = s3.limit(4) // 4개의 나라, 이름만을 가지고 다른 stream 반환
        .map(Nation::getName)
        .collect(Collectors.joining("-"));
    System.out.println("4개의 나라 : (-) " + names);

  }
}
