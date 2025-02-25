package array;

import java.util.ArrayList;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    // 1. 3명의 성 (kim, lee, park) 을 저장하는 동적배열 names 를 선언
    // 2. 김,이,박을 동적배열 names에 저장한다.
    // 3. name 에 저장된 내용을 확인하고, 동적배열의 크기를 확인한다.
    // 4. 입력되어 있는 내용(문자열)의 길이가 4인것만 찾아서 출력한다.
    // 5. 4번에서 찾은 조건을 만족하는 첫번째 원소를 삭제한다.
    // 6. name에 저장된 내용을 확인하고, 동적 배열의 크기를 확인한다.
    ArrayList<String> names = new ArrayList<>();
    names.add("kim");
    names.add("lee");
    names.add("park");
    System.out.println("names ==> " + names);
    System.out.println("names.size() ==> " + names.size());

    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      if (name != null && name.length() == 4) {
        System.out.println("name = " + name);
        names.remove(i);
      }
    }

    System.out.println("names ==> " + names);
    System.out.println("names.size() ==> " + names.size());

  }
}
