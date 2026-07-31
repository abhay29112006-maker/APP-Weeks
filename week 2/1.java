import java.util.Scanner;

class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, dep;
        int rollNo;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        dep = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
        System.out.println("Department: " + dep);

        sc.close();
    }
}