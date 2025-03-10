package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ExampleChapter15_9 {
  public static void main(String[] args) {
    //평균 점수, 최고 점수, 최고 점수를 받은 아이디를 출력하도록 코드를 작성
    Map<String,Integer> map = new HashMap<>();
    map.put("blue", 96); // key: blue value: 96
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; //최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0;   //최고 점수를 저장하는 변수
    int totalScore = 0; //점수 합계를 저장하는 변수

    // 여기에 코드를 작성하세요
    // map.keySet(); 컨트롤 알트 브이 값만 뽑으면 컬렉션에 담기고 키만 뽑으면 set에 담기고
    Set<String> names = map.keySet();
    // 키만 뽑아요 String인 key를 뽑고
    for (String nm : names) {
      int score = map.get(nm);
      totalScore += score;
      if (maxScore < map.get(nm)) { // 최고점수:0 < names의 nm(blue)
        maxScore = score; // score == map.get(nm)
        name = nm; //name = max의 이름(key)
      }
    }
    System.out.printf("최고점수를 받은 아이디는 %s이고 최고점수는 %d 평균은 %.2f 이다.", name, maxScore, totalScore / (double)map.size());

    //System.out.printf(" %.2f", score / (double)map.size());

  }
}
