import java.util.ArrayList;
import java.util.Scanner;
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
public String getAccountNumber() {
        return accountNumber;
    }
public String getAccountHolderName() {
        return accountHolderName;
    }
public double getBalance() {
        return balance;
    }
public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }
public String toString() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder: " + accountHolderName + "\n" +
               "Balance: $" + balance;
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }
public boolean removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed: " + accountNumber);
                return true;
            }
        }
        System.out.println("Account not found: " + accountNumber);
        return false;
    }
public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                System.out.println(account);
                System.out.println();
            }
        }
    }
}
public class Bank1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
while (true) {
            System.out.println("Bank Menu:");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); 
switch (option) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter account holder's name: ");
                    String accName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initBalance = sc.nextDouble();
                    sc.nextLine(); 
                    Account account = new Account(accNum, accName, initBalance);
                    bank.addAccount(account);
                    break;
                case 2:
                    System.out.print("Enter account number to remove: ");
                    String removeAccNum = sc.nextLine();
                    bank.removeAccount(removeAccNum);
                    break;
                case 3:
                    System.out.print("Enter account number for deposit: ");
                    String depositAccNum = sc.nextLine();
                    Account depositAcc = bank.getAccount(depositAccNum);
                    if (depositAcc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        depositAcc.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number for withdrawal: ");
                    String withdrawAccNum = sc.nextLine();
                    Account withdrawAcc = bank.getAccount(withdrawAccNum);
                    if (withdrawAcc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        sc.nextLine(); 
                        withdrawAcc.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    bank.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
