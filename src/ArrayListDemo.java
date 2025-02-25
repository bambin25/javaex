import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>();
    System.out.println("scores.size() = " + scores.size());
    scores.add(10);
    System.out.println("scores.size() = " + scores.size());
    scores.add(20);
    System.out.println("scores.size() = " + scores.size());
    scores.add(30);
    System.out.println("scores.size() = " + scores.size());
    System.out.print("[");
    for (int i = 0; i < scores.size(); i++) {
      if ( i == scores.size() - 1 ) {
        System.out.println(scores.get(i) + "]");
      } else {
        System.out.print(scores.get(i) + ", ");
      }
    }

    scores.remove(1);
    System.out.println("scores.size() = " + scores.size());
    scores.remove(0);
    System.out.println("scores.size() = " + scores.size());


  }
}
