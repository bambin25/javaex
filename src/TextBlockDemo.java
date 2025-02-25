public class TextBlockDemo {
  public static void main(String[] args) {
    String hi = """
        hi,
          java
        """;

    String hi2 = """
            hi,
              java
        """;
    System.out.println("hi = \n" + hi);
    System.out.println("hi2 = \n" + hi2);

    String escape = """
        \\
        """;

    System.out.println("escape = " + escape);

    String hi3 = """
        안녕하세요, "조윤빈"입니다.
        """;
    System.out.println("hi3 = \n" + hi3);

    String hi4 = "hello";
    System.out.println("hi4 = " + hi4);
    hi4 = hi4.replace('l', 'c');
    System.out.println("hi4 = " + hi4);

    String res = """
        가나라
        """.replace("라","다");
    System.out.println("res = " + res);


  }
}
