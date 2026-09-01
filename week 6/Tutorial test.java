import java.util.Scanner;

class Wallet {
    int wallet_ID;
    String customer_name;
    double balance;

    public Wallet(int wallet_ID, String customer_name, double balance) {
        this.wallet_ID = wallet_ID;
        this.customer_name = customer_name;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Wallet ID: " + wallet_ID);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Insufficient balance.");
            return balance;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Wallet ID: ");
        int wallet_ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String customer_name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        Wallet wallet = new Wallet(wallet_ID, customer_name, balance);
        wallet.displayDetails();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        wallet.deposit(depositAmount);
        System.out.println("New Balance after deposit: " + wallet.getBalance());
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        wallet.withdraw(withdrawAmount);
        System.out.println("New Balance after withdrawal: " + wallet.getBalance());
        sc.close();
    }
}