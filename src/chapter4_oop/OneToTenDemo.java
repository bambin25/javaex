package chapter4_oop;

public class OneToTenDemo {
  // 생성자
  // 멤버
    // 변수 (정적)
    static int sumOneToTen;
    static {
      int sum = 0;
      for (int i = 1; i < 10; i++) {
        sum += i;
      }
      sumOneToTen = sum;
    }
    // 메서드 (정적)
    public static void main(String[] args){
      System.out.println(sumOneToTen);
    }

}
