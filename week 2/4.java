import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void area() {
        int area = length * breadth;
        System.out.println("Rectangle's area = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter length: ");
        r.length = sc.nextInt();

        System.out.print("Enter breadth: ");
        r.breadth = sc.nextInt();

        r.area();

        sc.close();
    }
}