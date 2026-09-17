class BankTask implements Runnable {

    String activity;
    int delay;

    BankTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName()
                + " - " + activity
                + " - Execution Count: " + i
            );

            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class BankingApp {

    public static void main(String[] args) {

        BankTask transaction =
            new BankTask("Transaction Processing", 1000);

        BankTask balance =
            new BankTask("Balance Updating", 1500);

        BankTask sms =
            new BankTask("SMS Notification", 2000);

        Thread t1 = new Thread(transaction);
        Thread t2 = new Thread(balance);
        Thread t3 = new Thread(sms);

        t1.setName("Transaction Thread");
        t2.setName("Balance Thread");
        t3.setName("SMS Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}