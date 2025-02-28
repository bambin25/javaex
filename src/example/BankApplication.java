package example;

public class BankApplication {
  public static void main(String[] args) {
    Account[] accounts = new Account[100];

    accounts[0] = new Account("111-111","홍길동");
    accounts[0].setBalance(10000);
    System.out.println(accounts[0]);

    accounts[0].deposit(2000);
    accounts[0].withdraw(11000);


    System.out.println(accounts[0]);
  }
}
