public class StringDemo4 {
  public static void main(String[] args) {

    String s1 = new String("hi,");
    String s2 = new String(" java world hello");


    System.out.println(s2.charAt(4));
    System.out.println(s2.charAt(s2.length() - 1));
    for (int i = 0; i < s2.length(); i++) {
      System.out.println(s2.charAt(i));
    }

    System.out.println(s1);  // 0x100
    s1 = s1.toUpperCase();   // 0x200
    System.out.println(s1);

    // 3.14 를 문자열로 변환하는 법
    String str = "" + 3.14;
    String str1 = String.valueOf(3.14);
    String fruits = String.join(" ", "apple", "banana", "cherry", "durian");
    System.out.println("fruits = " + fruits);
    String str3 = String.format("%s %d", "jdk", 14); // format join 정적메소드
    System.out.println("str3 = " + str3);

    // 텍스트 블록 """ ~ """
    String strBlock = """
        <html>
          <body>
            <p> hello, world </p>
          </body>
        </html>
        """;
    System.out.println("strBlock = \n" + strBlock);


  }
}
