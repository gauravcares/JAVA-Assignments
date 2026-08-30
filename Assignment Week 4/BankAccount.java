import java.util.Scanner;

class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0;
    }

    public Account(String accountNumber, String ownerName, double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative");

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0)
            return false;

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance)
            return false;

        balance -= amount;
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + accountNumber +
               ", Owner: " + ownerName +
               ", Balance: " + balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String number1 = sc.nextLine();

        System.out.print("Enter owner name: ");
        String name1 = sc.nextLine();

        Account a1 = new Account(number1, name1);

        System.out.print("Enter second account number: ");
        String number2 = sc.nextLine();

        System.out.print("Enter second owner name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        Account a2 = new Account(number2, name2, balance);

        System.out.println("\n" + a1);
        System.out.println(a2);

        System.out.print("\nEnter deposit amount for account 1: ");
        double deposit = sc.nextDouble();
        System.out.println("Deposit successful: " + a1.deposit(deposit));

        System.out.print("Enter withdrawal amount for account 1: ");
        double withdraw = sc.nextDouble();
        System.out.println("Withdrawal successful: " + a1.withdraw(withdraw));

        System.out.println("\nFinal accounts:");
        System.out.println(a1);
        System.out.println(a2);

        sc.close();
    }
}
