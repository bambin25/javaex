public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hi, Java!"; // 0x100
    String s2 = "Hi, Java!"; // 0x100

    System.out.println("s1 == s2 ? " + s1 == s2); // X
    System.out.println("s1 == s2 ? " + (s1 == s2)); // O

    String s3 = new String("Hi, Java !"); // 0x200
    String s4 = new String("Hi, Java !"); // 0x300

    System.out.println("s3 == s4 ? " + (s3 == s4)); // x

    s1 = s3; // 0x200
    System.out.println("s1 == s3 ? " + (s1 == s3)); // 0


    System.out.println("s1 == s4 ? " + (s1 == s4)); // x
    System.out.println("문자열의 값이 같은가?" + s1.equals(s4)); // O

    String a = "apple";
    String b = "banana";
    String c = "BANANA";

    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(a));
    System.out.println(c.compareTo(c));
    System.out.println(c.compareToIgnoreCase(b));



  }
}
