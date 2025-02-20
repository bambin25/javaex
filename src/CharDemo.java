public class CharDemo {
  public static void main(String[] args) {
    char c = 'A';

    int i = c;

    System.out.println(c);
    System.out.println(i);
    System.out.println((int)c);

    //char c1 = ''; 오류

    String s = "abc";
    System.out.println(s);

    String s1 = s + 1;
    String s2 = "" + i ;
    System.out.println(s2 + 10);

    System.out.println("안녕하세요, \n 저는 \"조윤빈\"입니다.");

    char c3 = 3 + '0';
    System.out.println(c3);
    int i3 = c3 - '0';
    System.out.println(i3 + 10);

    String s3 = "hello";
    System.out.println(s3.charAt(5));
    System.out.println("안 녕하세요".charAt(1));

  }
}
