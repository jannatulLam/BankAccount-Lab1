package bankaccount;
 public class BankAccount {
  private String accountNumber;
  private double balance;
  
  public BankAccount(String accountNumber, double initialBalance) {
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
  }
  
  public void deposit(double amount){
      if(amount > 0){
          balance += amount;
          System.out.println("Deposited: " + amount);
      } else {
          System.out.println("Deposit amount must be positive.");
      }
  }  
  
  public void withdraw(double amount){
      if(amount > 0 && amount <= balance){
          balance -= amount;
          System.out.println("Withdraw: " + amount);
      }else {
          System.out.println("Insufficient balance.");
      }
  }
  
  public void displayAccountDetails() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Balance: " + balance);
  }
  
  public static void main(String[] args) {
      BankAccount account1 = new BankAccount("22140111", 1000.0);
      account1.deposit(350.0);
      account1.withdraw(500.0);
      account1.displayAccountDetails();
    }   
}