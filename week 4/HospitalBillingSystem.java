import java.util.Scanner;

class Patient {
    String patientName;
    double consultationFee;

    Patient(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    double calculateDiscount(double fee) {
        return fee >= 2000 ? fee * 0.10 : fee * 0.05;
    }

    double calculateFinalAmount(double fee) {
        return fee - calculateDiscount(fee);
    }

    void displayBill() {
        double discount = calculateDiscount(consultationFee);
        double finalAmount = calculateFinalAmount(consultationFee);

        System.out.println("\nPatient Name: " + patientName);
        System.out.printf("Original Consultation Fee: ₹%.2f%n", consultationFee);
        System.out.printf("Discount: ₹%.2f%n", discount);
        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < patients.length; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1) + ":");

            System.out.print("Patient Name: ");
            String name = scanner.nextLine();

            System.out.print("Consultation Fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine();

            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n===== HOSPITAL CONSULTATION BILL =====");

        for (int i = 0; i < patients.length; i++) {
            patients[i].displayBill();
        }

        scanner.close();
    }
}