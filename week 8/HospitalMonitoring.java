class EmergencyAlert extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() + " - Priority: "
                + getPriority()
                + " - Critical patient alert"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class VitalMonitor extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() + " - Priority: "
                + getPriority()
                + " - Checking vital signs"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class ReportGenerator extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() + " - Priority: "
                + getPriority()
                + " - Generating routine report"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class HospitalMonitoring {

    public static void main(String[] args) {

        EmergencyAlert emergency =
            new EmergencyAlert();

        VitalMonitor vital =
            new VitalMonitor();

        ReportGenerator report =
            new ReportGenerator();

        emergency.setName("EmergencyAlert");
        vital.setName("VitalMonitor");
        report.setName("ReportGenerator");

        
        emergency.setPriority(Thread.MAX_PRIORITY);
        vital.setPriority(Thread.NORM_PRIORITY);
        report.setPriority(Thread.MIN_PRIORITY);

        
        System.out.println(
            emergency.getName()
            + " Priority: "
            + emergency.getPriority()
        );

        System.out.println(
            vital.getName()
            + " Priority: "
            + vital.getPriority()
        );

        System.out.println(
            report.getName()
            + " Priority: "
            + report.getPriority()
        );

        System.out.println("\nThreads Started...\n");

        // Start threads
        emergency.start();
        vital.start();
        report.start();
    }
}