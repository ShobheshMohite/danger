package OOP.in.sm.bank;

public class Customer {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("1", "Shobhesh");
    bankAccount.depositeMoney(10000);
    System.out.println(bankAccount.withdrawMoney(2000));
    bankAccount.checkBalance();
  }

}
