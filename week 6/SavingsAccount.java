package accounts;

public class SavingsAccount extends Account
{
    double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate)
    {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails()
    {
        System.out.println("\nSavings Account");
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}