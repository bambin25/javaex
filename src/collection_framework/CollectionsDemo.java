package collection_framework;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    List<String> fruitsList = Arrays.asList(fruits);
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
//    Collections.sort(fruits); // 배열도 사용 불가능, Set 도 불가능
//    Collections.sort(fruitsMap); // Map 구현체도 사용 불가능
    System.out.println(fruitsList);
    Collections.sort(fruitsList);
    System.out.println(fruitsList); // 오름차순

    Collections.sort(fruitsList, (o1,o2) -> o2.compareTo(o1));
    System.out.println(fruitsList); // 내림차순

    Collections.sort(fruitsList, Collections.reverseOrder());
    System.out.println(fruitsList); // 내림차순

    Collections.sort(fruitsList);
    Collections.reverse(fruitsList);
    System.out.println(fruitsList);// 내림차순

    Collections.rotate(fruitsList, 1);
    System.out.println(fruitsList);

    Collections.rotate(fruitsList, 1);
    System.out.println(fruitsList); // 한칸씩 밀리는 방식 - rotate

    Collections.shuffle(fruitsList);
    System.out.println(fruitsList); // 섞임(정해진방식으로섞이므로 random넣어야 정말 랜덤하게섞임)

  }
}
