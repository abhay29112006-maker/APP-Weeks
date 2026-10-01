import java.sql.*;
import java.util.Scanner;

public class CourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url =
                "jdbc:mysql://localhost:3306/CollegeDB";

        String username = "root";

        String password = "1608";

        try {

            // Establish connection
            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println(
                    "Database Connected Successfully!");

            // Accept Course Code
            System.out.print(
                    "Enter Course Code: ");

            String courseCode = sc.nextLine();

            // SQL query
            String query =
                    "SELECT * FROM CourseRegistration "
                    + "WHERE CourseCode = ?";

            // Create PreparedStatement
            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, courseCode);

            // Execute query
            ResultSet rs =
                    ps.executeQuery();

            boolean found = false;

            System.out.println(
                    "\n===== REGISTERED STUDENTS =====");

            // Process ResultSet
            while (rs.next()) {

                found = true;

                System.out.println(
                        "Student ID: "
                        + rs.getInt("StudentID"));

                System.out.println(
                        "Student Name: "
                        + rs.getString("StudentName"));

                System.out.println(
                        "Course Code: "
                        + rs.getString("CourseCode"));

                System.out.println(
                        "Course Name: "
                        + rs.getString("CourseName"));

                System.out.println(
                        "Semester: "
                        + rs.getInt("Semester"));

                System.out.println("----------------------");
            }

            // If no student found
            if (!found) {

                System.out.println(
                        "No students are registered "
                        + "for course code: "
                        + courseCode);
            }

            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Database Error!");

            e.printStackTrace();
        }

        sc.close();
    }
}