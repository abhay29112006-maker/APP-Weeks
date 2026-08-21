import java.util.Scanner;

class Employee {
    String name;
    int employeeId;
    double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Professor extends Employee {

    Professor(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 10000;
    }
}

class LabAssistant extends Employee {

    LabAssistant(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000;
    }
}

class AdministrativeStaff extends Employee {

    AdministrativeStaff(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 3000;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (Professor/LabAssistant/AdministrativeStaff): ");
        String type = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee employee;

        if (type.equalsIgnoreCase("Professor")) {
            employee = new Professor(name, id, salary);
        } 
        else if (type.equalsIgnoreCase("LabAssistant")) {
            employee = new LabAssistant(name, id, salary);
        } 
        else if (type.equalsIgnoreCase("AdministrativeStaff")) {
            employee = new AdministrativeStaff(name, id, salary);
        } 
        else {
            System.out.println("Invalid employee type!");
            return;
        }

        System.out.println("\n--- Employee Details ---");
        employee.display();

        sc.close();
    }
}