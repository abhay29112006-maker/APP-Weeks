class ExamTask implements Runnable {

    String activity;

    ExamTask(String activity) {
        this.activity = activity;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                Thread.currentThread().getName() +
                " - " + activity
            );

            try {
                if (activity.equals("Displaying Remaining Time")) {
                    Thread.sleep(1000);
                }
                else if (activity.equals("Auto-Saving Answers")) {
                    Thread.sleep(2000);
                }
                else {
                    Thread.sleep(1500);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class OnlineExam {

    public static void main(String[] args) {

        ExamTask timeTask =
            new ExamTask("Displaying Remaining Time");

        ExamTask saveTask =
            new ExamTask("Auto-Saving Answers");

        ExamTask networkTask =
            new ExamTask("Checking Network Connection");

        Thread t1 = new Thread(timeTask);
        Thread t2 = new Thread(saveTask);
        Thread t3 = new Thread(networkTask);

        t1.setName("Time Thread");
        t2.setName("Auto-Save Thread");
        t3.setName("Network Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}