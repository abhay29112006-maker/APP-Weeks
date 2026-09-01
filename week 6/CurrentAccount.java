package accounts;

public class CurrentAccount extends Account
{
    double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit)
    {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayDetails()
    {
        System.out.println("\nCurrent Account");
        super.displayDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}