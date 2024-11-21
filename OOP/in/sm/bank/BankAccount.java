package OOP.in.sm.bank;

public class BankAccount {
  private String accoundNumber;
  private String accountHolderName;
  private double balance;

  public BankAccount(String accoundNumber, String accountHolderName) {
    this.accoundNumber = accoundNumber;
    this.accountHolderName = accountHolderName;
  }

  public void checkBalance() {
    System.out.println("Available Balance : " + balance);
  }

  public void depositeMoney(double money) {
    if (money <= 0) {
      System.out.println("Invalid Deposit");
    } else {
      balance += money;
    }

  }

  public double withdrawMoney(double money) {
    if (money <= 0) {
      System.out.println("Invalid Withdrawal");
    } else if (balance >= money) {
      balance -= money;
    } else {
      money = balance;
      balance = 0;
    }
    return money;
  }
}
