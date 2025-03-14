package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(10);
    System.out.println(set);

    set.add(10);
    System.out.println(set);

    set.add(5);
    set.add(20);
    System.out.println(set);

    for (Integer i : set) {
      System.out.println(i);
    }

    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) { // set의 컬렉션요소를 순회하며 다음요소가 있으면 true
      Integer i = iterator.next();
      if (i==10) {
        iterator.remove(); // 값이 10인 요소를 제거
      }
    }
    System.out.println(set);


//    Set<String> s = Set.of("a", "b", "c", "d");
//    HashSet<String> set2 = new HashSet<>(s);
//    set2.add("e");
//    set2.add("a");
//    System.out.println(set2);

  }
}
