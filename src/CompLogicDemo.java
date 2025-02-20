public class CompLogicDemo {
  public static void main(String[] args) {
    int x =1, y = 0;
    System.out.println((x > 2) && (x/y == 0)); // 쇼트서킷으로 처음 인수가 false이므로 뒤에계산 생략해서 오류안남
    System.out.println((x < 2) || (x/y == 0)); // 위와 같이 처음 인수가 true이므로 뒷인수 생략으로 오류안남
    // && 는 and연산자, || 는 OR연산자

  }
}
