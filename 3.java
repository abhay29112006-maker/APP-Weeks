import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("\nStudent details");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNo = sc.nextInt();

        s.display();

        sc.close();
    }
}