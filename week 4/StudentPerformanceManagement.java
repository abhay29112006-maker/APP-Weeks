import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    double[] marks = new double[3];
    double attendance;

    Student(int rollNumber, String name, double[] marks, double attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    double getTotalMarks() {
        double total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    double getAverage() {
        return getTotalMarks() / marks.length;
    }

    String getResult() {
        return getAverage() >= 50 ? "Pass" : "Fail";
    }

    String getScholarshipStatus() {
        return (getAverage() >= 75 && attendance >= 80)
                ? "Eligible"
                : "Not Eligible";
    }

    String getPerformance() {
        return getAverage() >= 85 ? "Excellent" : "Good";
    }

    void displayDetails() {
        System.out.println("\nRoll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.printf("Total Marks: %.2f%n", getTotalMarks());
        System.out.printf("Average Marks: %.2f%n", getAverage());
        System.out.println("Result: " + getResult());
        System.out.println("Scholarship: " + getScholarshipStatus());
        System.out.println("Performance: " + getPerformance());
    }
}

public class StudentPerformanceManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            double[] marks = new double[3];

            for (int j = 0; j < marks.length; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextDouble();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = scanner.nextDouble();

            students[i] = new Student(rollNumber, name, marks, attendance);
        }

        Student highestStudent = students[0];

        System.out.println("\n===== STUDENT PERFORMANCE REPORT =====");

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();

            if (students[i].getAverage() > highestStudent.getAverage()) {
                highestStudent = students[i];
            }
        }

        System.out.println("\n===== HIGHEST AVERAGE =====");
        System.out.println("Name: " + highestStudent.name);
        System.out.println("Roll Number: " + highestStudent.rollNumber);
        System.out.printf("Highest Average: %.2f%n", highestStudent.getAverage());

        scanner.close();
    }
}