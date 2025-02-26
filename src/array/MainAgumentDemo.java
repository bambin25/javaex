package array;

public class MainAgumentDemo {
  public static void main(String[] args) {
    if (args.length == 2) {
      // args[0] ==> 출력하고 싶은 문자열
      // args[1] ==> 출력하고 싶은 횟수 - 숫자
      int count = Integer.parseInt(args[1]);
      printlnCount(count,args[0]);
    } else {
      System.out.println("안녕");
    }
  }

    private static void printlnCount(int count, String arg) {
      for (int j = 0; j < count; j++) {
        System.out.println(arg);
      }

    }

}

