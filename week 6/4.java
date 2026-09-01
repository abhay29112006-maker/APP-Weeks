import java.util.Scanner;

interface Confidential
{
}

class Document
{
    String name;

    Document(String name)
    {
        this.name = name;
    }

    void display()
    {
        System.out.println("Document: " + name);
    }
}

class PublicDocument extends Document
{
    PublicDocument(String name)
    {
        super(name);
    }
}

class PrivateDocument extends Document implements Confidential
{
    PrivateDocument(String name)
    {
        super(name);
    }
}

class SecretDocument extends Document implements Confidential
{
    SecretDocument(String name)
    {
        super(name);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter document name: ");
        String name = sc.nextLine();

        System.out.println("1. Public Document");
        System.out.println("2. Private Document");
        System.out.println("3. Secret Document");

        System.out.print("Enter document type: ");
        int choice = sc.nextInt();

        Document d;

        if(choice == 1)
        {
            d = new PublicDocument(name);
        }
        else if(choice == 2)
        {
            d = new PrivateDocument(name);
        }
        else
        {
            d = new SecretDocument(name);
        }

        d.display();

        if(d instanceof Confidential)
        {
            System.out.println("The document is confidential");
        }
        else
        {
            System.out.println("The document is not confidential");
        }

        sc.close();
    }
}