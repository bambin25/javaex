package exercise.chapter8;

import java.util.Random;

public class ex4 {
  public static void main(String[] args) {
    // 1~6 사이의 값이 나오도록
    // 주사위 10번 돌리세용
    for (int i = 0; i < 10; i++) {
      System.out.println(new Dice().roll());
    }                 // 반환값이 있음
  }
}

// 다른 파일에다 만들어도 되나 보기편하게 아래에 만듬
class Dice {
  int roll() {
    //System.out.println((int)(Math.random() * 6 + 1)); // integer로 변환을 해야함
    //return (int)(Math.random() * 6 + 1);
    Random r = new Random();
    //r.nextInt(6); // 0~5까지의 값 ==> 원하는값 1~6이니 +1 해줌
    return r.nextInt(6) + 1;
  }
}
