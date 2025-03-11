package exercise.chapter12;

import java.util.stream.Stream;

public class Ex2 {
  public static void main(String[] args) {
    Stream.of("a1","a2","a3") // Stream<String> 을 생성
        .map(s -> s.substring(1)) // Stream<String>으로 map
        .mapToInt(Integer::parseInt) // 문자열 스트림을 숫자 스트림으로 변환
        .max() // 최대값을 찾아서 Optional 로 변환
        .ifPresent(System.out::println); // 최대값이 존재하면 최대값을 출력한다.
  }
}
