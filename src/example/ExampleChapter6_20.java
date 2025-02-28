package example;

import java.util.Scanner;

public class ExampleChapter6_20 {
  public static void main(String[] args) {
    Account[] accounts = new Account[100];

    Scanner in = new Scanner(System.in);
    String input = "";
    int menuNo = 0;

    String header = """
        ----------------------------------------------
        1.계좌생상 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
        ----------------------------------------------
        
        """;
    System.out.print(header);
    input = in.nextLine();
//    switch (input) {
//      case "1" -> ;
//      case "2" -> ;
//      case "3" -> ;
//      case "4" -> ;
//      case "5" -> ;
//      default ->
//    }

    while (true) {

    }


  }

  static void accountCreate(){
    System.out.println("생성중");
  }
  static void accountList(){
    System.out.println("리스트");
  }
  static void accountDeposit(){
    System.out.println("입금처리중");
  }
  static void accountWithdraw(){
    System.out.println("출금처리중");
  }
  static void finish(){
    System.out.println("프로그램 종료");
  }
  static void other(){
    System.out.println("메뉴 잘못 입력함");
  }
}
