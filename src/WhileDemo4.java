import java.util.Scanner;

public class WhileDemo4 {
  public static void main(String[] args) {
    // 초기식
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요. (종료하려면 stop을 입력하세요) : ");
    String animal = in.nextLine();
    // while문 - 조건식(분기문),반복실행문,증감식
    while (true) {
      if (animal.equalsIgnoreCase("stop")) {
        break;
      }
      WhoIsIt(animal);
      System.out.println("동물의 이름을 입력하세요. (종료하려면 stop을 입력하세요) : ");
      animal = in.nextLine();
    } // end of while
  } // end of method

  private static void WhoIsIt(String animal) {
    String kind = "";
    switch (animal) {
      case "호랑이" : kind = "포유류"; break;
      case "참새" : kind = "조류"; break;
      case "고등어" : kind = "어류"; break;
      default : kind = "분류할 수 없음";
    } // end of switch
    System.out.printf("%s는 %s 입니다. \n", animal, kind);
  } // end of method WhoIsIt
} // end of class
