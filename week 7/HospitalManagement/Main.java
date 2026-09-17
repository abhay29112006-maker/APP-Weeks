import doctor.Doctor;
import patient.Patient;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist", 1000);
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Dermatologist", 800);

        Patient p1 = new Patient(201, "Rahul", "Heart Disease", 45);
        Patient p2 = new Patient(202, "Priya", "Skin Allergy", 25);
        Patient p3 = new Patient(203, "Aman", "Heart Disease", 50);

        System.out.println("===== PATIENT 1 =====");
        p1.displayPatient();

        System.out.println("Doctor Treating Patient:");
        d1.displayDoctor();

        System.out.println();

        System.out.println("===== PATIENT 2 =====");
        p2.displayPatient();

        System.out.println("Doctor Treating Patient:");
        d2.displayDoctor();

        System.out.println();

        System.out.println("===== PATIENT 3 =====");
        p3.displayPatient();

        System.out.println("Doctor Treating Patient:");
        d1.displayDoctor();

        int patientsForD1 = 2;
        int patientsForD2 = 1;

        double totalFeeD1 = patientsForD1 * d1.getConsultationFee();
        double totalFeeD2 = patientsForD2 * d2.getConsultationFee();

        System.out.println();
        System.out.println("===== TOTAL CONSULTATION FEE =====");

        System.out.println(d1.getName() + ": " + totalFeeD1);
        System.out.println(d2.getName() + ": " + totalFeeD2);
    }
}