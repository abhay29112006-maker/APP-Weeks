import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double monthlySalary;

    Employee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    boolean isBonusEligible() {
        return monthlySalary >= 30000;
    }

    double calculateBonus() {
        return isBonusEligible() ? calculateAnnualSalary() * 0.10 : 0;
    }

    void displayDetails() {
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.printf("Monthly Salary: ₹%.2f%n", monthlySalary);
        System.out.printf("Annual Salary: ₹%.2f%n", calculateAnnualSalary());
        System.out.printf("Bonus: ₹%.2f%n", calculateBonus());
        System.out.println("Bonus Eligibility: "
                + (isBonusEligible() ? "Eligible" : "Not Eligible"));
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Monthly Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\n===== EMPLOYEE MANAGEMENT REPORT =====");

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }

        scanner.close();
    }
}