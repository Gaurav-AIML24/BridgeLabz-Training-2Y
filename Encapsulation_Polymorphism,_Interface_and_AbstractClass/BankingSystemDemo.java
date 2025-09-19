// Interface for Loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation - Getters & Setters
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance = " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract Method
    public abstract double calculateInterest();

    // Display details
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + 
                           ", Holder: " + holderName + 
                           ", Balance: " + balance);
    }
}

// SavingsAccount Class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Request: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000; // Eligible if balance > 5000
    }
}

// CurrentAccount Class
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2%

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Request: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000; // Eligible if balance > 10000
    }
}

// Main Class
public class BankingSystemDemo {
    public static void main(String[] args) {
        // Polymorphism: Superclass reference
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("S101", "Alice", 7000),
            new CurrentAccount("C202", "Bob", 12000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(50000);
                System.out.println("Eligible for Loan? " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}