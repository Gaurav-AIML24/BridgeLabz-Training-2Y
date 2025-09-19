public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        // Accessing public member
        System.out.println("Account Number: " + accountNumber);
        // Accessing protected member
        System.out.println("Account Holder: " + accountHolder);
        // Cannot access private member balance directly here
        System.out.println("Balance (accessed via getter): " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456", "Bob", 1000.0);
        sa.display();
    }
}
