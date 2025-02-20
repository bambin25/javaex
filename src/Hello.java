public class Hello {
  public static void main(String[] args) {
    // 여러가지 실행문을 작성해보자.
    // 정수를 x 에 담고자 한다.
    int x;
    // 변수 x 에 1을 할당/저장한다.
    x = 1;
    int y = 2; /* 정수 x 를 선언하고 값 2를 저장한다. */
    // 변수 result 에 x 와 y 의 값을 더한 후 저장한다.
    int result = x+y;

    System.out.println(x);
    System.out.println(y);
    System.out.println(result);
    // hello 라는 변수에 "안녕!" 이라는 문자열을 저장한 후 출력한다.
    String hello = "안녕!";
    System.out.println(hello);
    hello = hello + "1";
    System.out.println(hello);
    // 식별자 numverOfDogs 카멜기법

    final int NUMBER_ONE = 1;
    //NUMBER_ONE = NUMBER_ONE + 1;
    System.out.println(NUMBER_ONE);

  }
}
