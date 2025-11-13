//ATM_Project.java
import java.util.Scanner;

// BankAccount class
class BankAccount{
  private String userId;
  private String pin;
  private double balance;

  //Constructor
  public BankAccount(String userId, String pin, double balance) {
    this.userId = userId;
    this.pin = pin;
    this.balance = balance;
  }

  // Getters
  public String getUserId() {
    return userId;
  }

  public String getPin() {
    return pin;
  }

  // Deposit method
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  //Withdraw method
  public boolean withdraw(double)
}

