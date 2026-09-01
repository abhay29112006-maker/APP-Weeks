import java.util.Scanner;

interface BasicSecurity
{
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity
{
    void fingerprint();
    void faceRecognition();
}

class BankingApplication implements AdvancedSecurity
{
    public void login()
    {
        System.out.println("Login successful");
    }

    public void logout()
    {
        System.out.println("Logout successful");
    }

    public void fingerprint()
    {
        System.out.println("Fingerprint authentication successful");
    }

    public void faceRecognition()
    {
        System.out.println("Face recognition authentication successful");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BankingApplication b = new BankingApplication();

        System.out.println("1. Login");
        System.out.println("2. Logout");
        System.out.println("3. Fingerprint Authentication");
        System.out.println("4. Face Recognition");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            b.login();
        }
        else if(choice == 2)
        {
            b.logout();
        }
        else if(choice == 3)
        {
            b.fingerprint();
        }
        else if(choice == 4)
        {
            b.faceRecognition();
        }
        else
        {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}