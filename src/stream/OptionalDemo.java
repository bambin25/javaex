package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main(String[] args) {
    // 이해못함ㅠ

    OptionalInt divide = divide(3, 1);
    if(divide.isEmpty()) {
      System.out.println("0 으로 나눌 수 없습니다.");
    }
    if(divide.isPresent()) {
      System.out.println(divide.getAsInt());
    }

    Optional<String> result = check("HELLO");
    if(result.isEmpty()) {

    }

    if(result.isPresent()) {
      System.out.println(result.get());
    }


  }

  public static OptionalInt divide(int x , int y) {
    return y == 0 ? OptionalInt.empty() : OptionalInt.of(x/y);
  }

  public static Optional<String> check(String s) {
    return s == null ? Optional.empty() : Optional.of(s.toLowerCase());
  }

}
