import java.util.Scanner;

class Temperature {
    double celsius;

    void display() {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature t = new Temperature();

        System.out.print("Enter temperature in celsius: ");
        t.celsius = sc.nextDouble();

        t.display();

        sc.close();
    }
}