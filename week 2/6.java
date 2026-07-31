import java.util.Scanner;

class Employee {
    String name;
    int id;

    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.print("Enter First employee name: ");
        e1.name = sc.nextLine();
        System.out.print("Enter First employee id: ");
        e1.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second employee name: ");
        e2.name = sc.nextLine();
        System.out.print("Enter second employee id: ");
        e2.id = sc.nextInt();

        System.out.println("\nFirst employee details");
        e1.display();

        System.out.println("\nSecond employee details");
        e2.display();

        sc.close();
    }
}