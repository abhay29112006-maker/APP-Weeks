import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] attendance = new int[7];
        int presentDays = 0;

        for (int i = 0; i < attendance.length; i++) {
            System.out.print("Enter attendance for day " + (i + 1)
                    + " (1 = Present, 0 = Absent): ");

            attendance[i] = scanner.nextInt();

            if (attendance[i] == 1) {
                presentDays++;
            }
        }

        double attendancePercentage =
                (presentDays * 100.0) / attendance.length;

        System.out.println("Present days: " + presentDays);
        System.out.println("Attendance: " + attendancePercentage + "%");

        if (attendancePercentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}