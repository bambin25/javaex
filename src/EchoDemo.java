public class EchoDemo {
  public static void main(String[] args) {
    // 1. 반환값이 없음
    // 2. main에서 별도의 객체생성 없이 호출 가능
    // 3. 매개변수가 2개 있음(문자열, 정수)
    // 4. 문자열을 정수의 횟수만큼 반복 출력하는 기능

    echo("안녕", 5);
  }

  static void echo(String str, int count){
    for (int i=0; i < count; i++) {
      System.out.println(str);
    }

  }
}
