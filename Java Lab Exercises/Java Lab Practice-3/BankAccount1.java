public class BankAccount1 {
public static class BankAccount {
protected double balance;
public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }
 public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
public double getBalance() {
            return balance;
        }
    }
public static class SavingsAccount extends BankAccount {
public SavingsAccount(double initialBalance) {
            super(initialBalance);
        }
@Override
public void withdraw(double amount) {
            if (amount > 0 && (balance - amount) >= 100) {
                balance -= amount;
            }
        }
    }
public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(100);
        System.out.println("BankAccount balance: $" + account.getBalance());
SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(550); 
        System.out.println("SavingsAccount balance after denied withdrawal: $" + savings.getBalance());
        savings.withdraw(100);
        System.out.println("SavingsAccount balance after successful withdrawal: $" + savings.getBalance());
    }
}
