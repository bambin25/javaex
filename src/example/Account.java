package example;

public class Account {
    // 필드 - 계좌번호, 계좌주, 초기입금액
    private int balance;
    private String accountNo;
    private String AccountOwner;

    // 상수 선언 - 0 , 1_000_000
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1_000_000;
    // 접근자(Getter)
    public int getBalance() {
      return balance;
    }

    public String getAccountNo() {
      return accountNo;
    }

    public String getGetAccountOwner() {
      return AccountOwner;
    }

    // 생성자(Setter) - 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
    public void setBalance(int balance) {
      if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
        this.balance = balance;
      }
    }
  // 생성자 - 계좌번호, 계좌주, (초기입금)
  public Account(String accountNo,String AccountOwner) {
      this.accountNo = accountNo;
      this.AccountOwner = AccountOwner;
  }
  public Account (){}

  // 입금기능 추가
  public void deposit(int money) {
      balance += money;
  }
  // 출금기능 추가
  public void withdraw(int money) {
    // 잔고보다 더 많이 인출할수 없음
    if (balance < money) {
      System.out.println("잔액 부족");
    } else {
      balance -= money;
      System.out.println("출금이 성공되었습니다.");
    }
  }
  // 계좌 정보 출력
  @Override
  public String toString() {
    return accountNo + "\t" +
        AccountOwner + "\t" +
        balance;
  }
}

