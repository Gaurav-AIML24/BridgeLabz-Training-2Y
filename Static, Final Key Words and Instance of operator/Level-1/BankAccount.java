public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789");
        if (account instanceof BankAccount) {
            account.displayDetails();
        } else {
            System.out.println("Object is not an instance of BankAccount");
        }
        BankAccount.getTotalAccounts();
    }
}
