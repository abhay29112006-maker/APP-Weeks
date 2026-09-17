import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int factorial = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
    }
}