package exercise.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;

public class ex1 {
  public static void main(String[] args) {
    List<String> animals = new ArrayList<>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("다람쥐");
    animals.add("라마");

    for (String animal : animals) {
      if (animal.length() == 2) {
        System.out.println(animal);
      }
    }


  }
}
