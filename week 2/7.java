import java.util.Scanner;

class Marks {
    int sub1, sub2, sub3;

    void display() {
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Marks m = new Marks();

        System.out.print("Enter marks sub1: ");
        m.sub1 = sc.nextInt();

        System.out.print("Enter marks of sub2: ");
        m.sub2 = sc.nextInt();

        System.out.print("Enter marrks of sub3: ");
        m.sub3 = sc.nextInt();

        m.display();

        sc.close();
    }
}