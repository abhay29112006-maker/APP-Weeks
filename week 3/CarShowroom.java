import java.util.Scanner;

class Car {
    String model;
    double price;

    Car() {
        model = "Not Specified";
        price = 0;
    }

    Car(String model) {
        this.model = model;
        price = 0;
    }

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("\nCar Model : " + model);
        System.out.println("Car Price : " + price);
    }
}

public class CarShowroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Register without details");
        System.out.println("2. Register with model name");
        System.out.println("3. Register with model name and price");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Car car;

        if (choice == 1) {
            car = new Car();
        } else if (choice == 2) {
            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            car = new Car(model);
        } else if (choice == 3) {
            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car price: ");
            double price = scanner.nextDouble();

            car = new Car(model, price);
        } else {
            System.out.println("Invalid option");
            scanner.close();
            return;
        }

        car.displayDetails();

        scanner.close();
    }
}