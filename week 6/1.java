import java.util.Scanner;

class Vehicle
{
    String vehicleNumber;
    String brand;
    int speed;

    Vehicle(String vehicleNumber, String brand, int speed)
    {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle
{
    int numberOfDoors;

    Car(String vehicleNumber, String brand, int speed, int numberOfDoors)
    {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails()
    {
        System.out.println("\nCar Details");
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle
{
    boolean hasGear;

    Bike(String vehicleNumber, String brand, int speed, boolean hasGear)
    {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    void displayDetails()
    {
        System.out.println("\nBike Details");
        super.displayDetails();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Details");
        System.out.print("Vehicle Number: ");
        String carNumber = sc.nextLine();

        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Speed: ");
        int carSpeed = sc.nextInt();

        System.out.print("Number of Doors: ");
        int doors = sc.nextInt();

        sc.nextLine();

        System.out.println("\nEnter Bike Details");
        System.out.print("Vehicle Number: ");
        String bikeNumber = sc.nextLine();

        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Speed: ");
        int bikeSpeed = sc.nextInt();

        System.out.print("Has Gear (true/false): ");
        boolean gear = sc.nextBoolean();

        Vehicle v1 = new Car(carNumber, carBrand, carSpeed, doors);
        Vehicle v2 = new Bike(bikeNumber, bikeBrand, bikeSpeed, gear);

        v1.displayDetails();
        v2.displayDetails();

        sc.close();
    }
}