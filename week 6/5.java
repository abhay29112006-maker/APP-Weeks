import java.util.Scanner;
import student.Student;
import course.Course;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();

        System.out.print("Enter credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, rollNo, department);
        Course c = new Course(courseName, courseCode, credits);

        System.out.println("\nStudent Details");
        s.displayDetails();

        System.out.println("\nCourse Details");
        c.displayDetails();

        sc.close();
    }
}