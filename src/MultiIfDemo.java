import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력하세요 (0~100) : ");
    int score = in.nextInt();
    String grade = "";

    if (score >= 90 && score <=100) {
      if(score >= 95) {
        grade = "A+";
      } else {
        grade = "A0 or A-";
      }
    } else if (score >= 80 && score < 90) {
      grade = "B";
    } else if (score >= 70 && score < 80) {
      grade = "C";
    } else if (score >= 60 && score < 70) {
      grade = "D";
    } else {
      grade = "F";
    }

    System.out.printf("입력한 점수는 %d 이며, 학점은 %s 입니다.", score, grade);
    if(grade == "F") {
      System.out.println(" 당신은 불합격 입니다.");
    }
  } // end of method

} //end of class
