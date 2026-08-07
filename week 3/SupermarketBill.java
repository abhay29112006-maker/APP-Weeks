import java.util.Scanner;

public class SupermarketBill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[5];
        int totalBill = 0;
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scanner.nextInt();
            totalBill += prices[i];
        }
        System.out.println("Total Bill:"+totalBill);
        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }
        scanner.close();


    }
}