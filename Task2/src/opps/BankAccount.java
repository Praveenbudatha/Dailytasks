package opps;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account number (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.printf("Account Number: %s%nBalance: %.2f%n",
                          accountNumber, balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC1001", 500.0);
        BankAccount acc2 = new BankAccount("ACC1002", 1000.0);

        acc1.deposit(150.0);
        acc1.withdraw(100.0);

        acc2.withdraw(1200.0);  // Should fail
        acc2.deposit(-50.0);    // Should fail

        System.out.println("Account details:");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}

