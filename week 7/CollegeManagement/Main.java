import Student.Student;
import Course.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Abhay", 101, "CSE");

        Course c = new Course("Data Structures", "CSE201", 4);

        System.out.println("----- Student Information -----");
        s.displayStudent();

        System.out.println();

        System.out.println("----- Course Information -----");
        c.displayCourse();
    }
}