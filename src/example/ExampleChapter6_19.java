package example;

public class ExampleChapter6_19 {
  public static void main(String[] args) {
    Account account = new Account();

    account.setBalance(1000);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(2000000);
    System.out.println("현재 잔고 : " + account.getBalance());

    account.setBalance(300000);
    System.out.println("현재 잔고 : " + account.getBalance());
  }
}

