import java.util.Scanner;

abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}

class Electronics extends Product {

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;   // 10% discount
    }
}

class Clothing extends Product {

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;   // 20% discount
    }
}

class Books extends Product {

    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.15;   // 15% discount
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Product Category:");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product product;

        if (choice == 1) {
            product = new Electronics(id, name, price);
        }
        else if (choice == 2) {
            product = new Clothing(id, name, price);
        }
        else if (choice == 3) {
            product = new Books(id, name, price);
        }
        else {
            System.out.println("Invalid choice!");
            return;
        }

        product.display();

        sc.close();
    }
}