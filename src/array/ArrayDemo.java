package array;

public class ArrayDemo {
  public static void main(String[] args) {
    // 5 과목의 점수를 저장하고 총점과 평균을 구하려고 한다.
    int score1 = 100, score2 = 90, score3 = 80, score4 = 90, score5 = 78;
    int total = score1 + score2 + score3 + score4 + score5;
    double avg = total / (double)5;
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

    int[] scores = {100,90,80,90,78};
    total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }
    avg = total / (double)scores.length;
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

  }
}
