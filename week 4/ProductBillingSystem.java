import java.util.Scanner;

class Product {
    private final int productId;
    private final String productName;
    private final double price;
    private final int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    double getDiscount() {
        if (getTotalPrice() >= 5000) {
            return getTotalPrice() * 0.10;
        } else {
            return getTotalPrice() * 0.05;
        }
    }

    double getFinalPrice() {
        return getTotalPrice() - getDiscount();
    }

    void displayBill() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.printf("Total Price: ₹%.2f%n", getTotalPrice());
        System.out.printf("Discount: ₹%.2f%n", getDiscount());
        System.out.printf("Final Price: ₹%.2f%n", getFinalPrice());
    }
}

public class ProductBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(id, name, price, quantity);
        }

        System.out.println("\n========== PRODUCT BILL ==========");

        for (int i = 0; i < products.length; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");
            products[i].displayBill();
        }

        scanner.close();
    }
}