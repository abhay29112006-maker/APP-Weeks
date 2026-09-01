import java.util.Scanner;
import accounts.Account;
import accounts.SavingsAccount;
import accounts.CurrentAccount;
import payments.Payment;
import payments.UPIPayment;
import payments.CardPayment;
import payments.OnlineTransaction;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Savings Account Details");
        System.out.print("Account Number: ");
        String savingsNumber = sc.nextLine();

        System.out.print("Holder Name: ");
        String savingsName = sc.nextLine();

        System.out.print("Balance: ");
        double savingsBalance = sc.nextDouble();

        System.out.print("Interest Rate: ");
        double interestRate = sc.nextDouble();

        System.out.println("\nEnter Current Account Details");
        System.out.print("Account Number: ");
        sc.nextLine();
        String currentNumber = sc.nextLine();

        System.out.print("Holder Name: ");
        String currentName = sc.nextLine();

        System.out.print("Balance: ");
        double currentBalance = sc.nextDouble();

        System.out.print("Overdraft Limit: ");
        double overdraftLimit = sc.nextDouble();

        Account a1 = new SavingsAccount(savingsNumber, savingsName, savingsBalance, interestRate);
        Account a2 = new CurrentAccount(currentNumber, currentName, currentBalance, overdraftLimit);

        a1.displayDetails();
        a2.displayDetails();

        System.out.print("\nEnter payment amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.print("Enter payment method: ");
        int choice = sc.nextInt();

        Payment p;

        if(choice == 1)
        {
            p = new UPIPayment();
        }
        else
        {
            p = new CardPayment();
        }

        p.pay(amount);

        if(p instanceof SecurePayment)
        {
            SecurePayment s = (SecurePayment)p;
            s.verifyPayment();
        }

        if(p instanceof OnlineTransaction)
        {
            System.out.println("This is an online transaction");
        }

        sc.close();
    }
}