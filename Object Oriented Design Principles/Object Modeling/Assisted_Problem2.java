import java.util.ArrayList;

public class Assisted_Problem2 {

    static class Account {
        private String accountNumber;
        private double balance;
        private Bank bank;

        public Account(String accountNumber, Bank bank) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
            this.bank = bank;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }

    static class Customer {
        private String name;
        private ArrayList<Account> accounts;

        public Customer(String name) {
            this.name = name;
            this.accounts = new ArrayList<>();
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public void viewBalance() {
            System.out.println("Balances for " + name + ":");
            for (Account account : accounts) {
                System.out.println("Account " + account.getAccountNumber() + ": $" + account.getBalance());
            }
        }
    }

    static class Bank {
        private String name;
        private ArrayList<Customer> customers;

        public Bank(String name) {
            this.name = name;
            this.customers = new ArrayList<>();
        }

        public void addCustomer(Customer customer) {
            customers.add(customer);
        }

        public Account openAccount(String accountNumber, Customer customer) {
            Account account = new Account(accountNumber, this);
            customer.addAccount(account);
            return account;
        }
    }

    public static void main(String[] args) {
        // Create bank
        Bank bank = new Bank("National Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts (association)
        Account acc1 = bank.openAccount("12345", customer1);
        Account acc2 = bank.openAccount("67890", customer2);
        Account acc3 = bank.openAccount("54321", customer1);

        // Deposit some money
        acc1.deposit(1000);
        acc2.deposit(500);
        acc3.deposit(200);

        // View balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
