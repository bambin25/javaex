package exercise.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    // HashTable을 이용해 4개의 이름과 점수를 저장하시오.
    // 키보드로 이름을 입력하면 대응하는 점수를 알려주는 프로그램을 작성하시오.
    Map<String, Integer> map = new HashMap<>();

    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 88);

    Scanner in = new Scanner(System.in);
    System.out.print("이름을 입력하세요 : ");
    String name = in.nextLine();

    Integer score = map.get(name); // null값을 예외처리하기위해 객체타입으로 받는다
    if (score == null) {
      System.out.println(name + "의 점수를 찾을 수 없습니다.");
    } else {
      System.out.println(name + "의 점수는 " + score + "입니다.");
    }
  }
}
