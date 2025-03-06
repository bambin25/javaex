package exercise.chapter9;

import java.util.*;

public class ex3 {
  public static void main(String[] args) {
    // 숫자(정수)를 담을 수 있는 ArrayList(동적배열)를 선언해보세요
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    //al.add("10"); 타입안정성
    int result = al.get(0) + 10; // 타입체크 및 형변환이 필요없이 사용가능
    // 문자열을 담을 수 있는 ArrayList 선언
    ArrayList<String> sl = new ArrayList<>();
    sl.add("A");
    //sl.add(1); 타입안정성
    System.out.println(sl.get(0).length()); // 타입체크 및 형변환이 필요없이 사용가능

    // 숫자(정수)를 담을 수 있는 Stack 선언
    Stack<Integer> sti = new Stack<>();
    sti.add(1);
    //sti.add("1");
    int number = sti.pop();
    // 문자열을 담을 수 있는 Stack 선언
    Stack<String> ststr = new Stack<>();
    ststr.add("A");
    System.out.println(ststr.pop().toLowerCase());

    // 숫자(정수)를 담을 수 있는 Queue 선언
    Queue<Integer> qi = new LinkedList<>();
    qi.add(1);
    int num2 = qi.poll();
    System.out.println(num2);
    // 문자열을 담을 수 있는 Queue 선언
    Queue<String> qs = new LinkedList<>();

    // 문자열을 키로, 숫자를 값으로 가지는 HashMap hm2 를 선언하고 사용해보기
    HashMap<String, Integer> hm2 = new HashMap<>();
    hm2.put("apple",10);
    hm2.put("banana",20);
    System.out.println(hm2.get("apple"));
    System.out.println(hm2.get("banana"));

  }
}
