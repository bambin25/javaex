package exercise.chapter12;

import java.util.List;
import java.util.stream.Stream;

public class ex4 {
  public static void main(String[] args) {
    // 6개의 수도("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")를
    // 포함하는 List 객체를 사용하여 다음을 수행하는 프로그램을 작성하라.
    List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
    // 1) 스트림을 생성하라.
    Stream<String> stream = capitals.stream();
    // 2) 정렬하라.(오름차순)
    Stream<String> sorted = stream.sorted();
    // 3) 첫번째 수도를 출력하라.
    System.out.println(sorted.findFirst().get());
  }
}
