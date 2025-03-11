package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ExampleChapter15_9 {
  public static void main(String[] args) {
    // 선생님은 exercise/chapter11의 Ex6로 만드셧음
    
    //평균 점수, 최고 점수, 최고 점수를 받은 아이디를 출력하도록 코드를 작성
    Map<String,Integer> map = new HashMap<>();
    map.put("blue", 96); // key: blue value: 96
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; //최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0;   //최고 점수를 저장하는 변수
    int totalScore = 0; //점수 합계를 저장하는 변수

    String name2 = null; // 최저 점수를 받은 아이디를 저장하는 변수
    int minScore = 100; // 최저 점수를 저장하는 변수

    Set<String> names2 = map.keySet();
    for (String nm2 : names2) {
      int score = map.get(nm2);
      if (minScore > score) {
        minScore = score;
        name2 = nm2;
      }
    }
    System.out.println(name2 + "이 최저점수" + minScore + " 를 받았습니다.");

    // 여기에 코드를 작성하세요

    // < 방법 1>

    // map.keySet(); 컨트롤 알트 브이 값만 뽑으면 컬렉션에 담기고 키만 뽑으면 set에 담기고
    Set<String> names = map.keySet(); // key만을 set으로 가지는
    // 키만 뽑아요 String인 key를 뽑고
    for (String nm : names) {
      int score = map.get(nm);
      totalScore += score;
      if (maxScore < map.get(nm)) { // 최고점수:0 < names의 nm(blue)
        maxScore = score; // score == map.get(nm)
        name = nm; //name = max의 이름(key)
      }
    }
    System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
    System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());
//    System.out.printf("최고점수를 받은 아이디는 %s이고 최고점수는 %d 평균은 %.2f 이다. \n",
//        name, maxScore, totalScore / (double)map.size());
    //System.out.printf(" %.2f", score / (double)map.size());

    /// < 방법 2> - entrySet<> 활용
    name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    maxScore = 0; // 최고 점수를 저장하는 변수
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
      int score = entry.getValue();
      totalScore += score;
      if(maxScore < score) {
        maxScore = score;
        name = entry.getKey();
      }
    }
    System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
    System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());

    // < 방법 3> - entrySet().iterator() 활용
    name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    maxScore = 0; // 최고 점수를 저장하는 변수
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
    while(iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      int score = entry.getValue();
      totalScore += score;
      if(maxScore < score) {
        maxScore = score;
        name = entry.getKey();
      }
    }
    System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
    System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());



  }
}
