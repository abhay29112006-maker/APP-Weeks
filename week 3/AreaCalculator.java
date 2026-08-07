import java.util.Scanner;

public class AreaCalculator {

    static double area(double side) {
        return side * side;
    }

    static double area(double length, double breadth) {
        return length * breadth;
    }

    static double area(float radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of Square: " + area(side));

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + area(length, breadth));

        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();
        System.out.println("Area of Circle: " + area(radius));

        scanner.close();
    }
}