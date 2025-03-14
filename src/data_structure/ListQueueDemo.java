package data_structure;

import java.util.Queue;

public class ListQueueDemo {
  public static void main(String[] args) {
    ListQueue<String> objects = new ListQueue<>();

    objects.offer("a");
    objects.offer("b");
    objects.offer("c");

    System.out.println(objects);
    System.out.println(objects.poll());
    System.out.println(objects.poll());
    System.out.println(objects.poll());
    System.out.println(objects);


  }
}
