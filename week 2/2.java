import java.util.Scanner;

class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title, author;
        int price;

        System.out.print("Enter title of book: ");
        title = sc.nextLine();

        System.out.print("Enter author of book: ");
        author = sc.nextLine();

        System.out.print("Enter price of book: ");
        price = sc.nextInt();

        System.out.println("\nBook details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

        sc.close();
    }
}