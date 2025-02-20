public class NumberTypeDemo {
  public static void main(String[] args) {
    /*
    // 정수를 선언하고 사용
    int mach = 340;
    int distance = mach * 60 * 60;
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + " m");

    // 실수를 선언하고 사욛
    double radius = 10.0;
    final double PI = 3.14159265;
    double area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
    */

    // int를 long으로 double을 float으로 바꿔서 코딩해보기
    long machL = 340L;
    long distanceL = machL * 60 * 60;
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distanceL + " m");

    float radiusF = 10.0F;
    final float PIF = 3.14159265F;
    float areaF = radiusF * radiusF * PIF;
    System.out.println("반지름이 " + radiusF + "인 원의 넓이 : " + areaF);

    // 논리 , boolean 값
    int x = 10;
    boolean result = (x == 10);
    result = (x != 10);
    System.out.println(result);



  }
}
