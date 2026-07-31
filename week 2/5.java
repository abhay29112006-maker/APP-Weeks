import java.util.Scanner;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.print("Enter first student name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter first student age: ");
        s1.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second student name: ");
        s2.name = sc.nextLine();
        System.out.print("Enter second student age: ");
        s2.age = sc.nextInt();

        System.out.println("\nFirst student details");
        s1.display();

        System.out.println("\nSecond student details");
        s2.display();

        sc.close();
    }
}
