import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/LibraryDB";
        String username = "root";
        String password = "1608";

        try {

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully!");

            int choice;

            do {

                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. Insert New Book");
                System.out.println("2. Search Book");
                System.out.println("3. Display Available Books");
                System.out.println("4. Issue Book");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        String insertQuery =
                                "INSERT INTO Book VALUES (?, ?, ?, ?, ?)";

                        PreparedStatement ps =
                                con.prepareStatement(insertQuery);

                        ps.setInt(1, id);
                        ps.setString(2, title);
                        ps.setString(3, author);
                        ps.setDouble(4, price);
                        ps.setBoolean(5, true);

                        ps.executeUpdate();

                        System.out.println(
                                "Book inserted successfully!");

                        break;


                    case 2:

                        System.out.print("Enter Book ID: ");
                        int searchId = sc.nextInt();

                        String searchQuery =
                                "SELECT * FROM Book WHERE BookID = ?";

                        PreparedStatement ps2 =
                                con.prepareStatement(searchQuery);

                        ps2.setInt(1, searchId);

                        ResultSet rs =
                                ps2.executeQuery();

                        if (rs.next()) {

                            System.out.println("\nBook ID: "
                                    + rs.getInt("BookID"));

                            System.out.println("Title: "
                                    + rs.getString("Title"));

                            System.out.println("Author: "
                                    + rs.getString("Author"));

                            System.out.println("Price: "
                                    + rs.getDouble("Price"));

                            System.out.println("Availability: "
                                    + rs.getBoolean("Availability"));

                        } else {

                            System.out.println("Book not found!");
                        }

                        break;


                    case 3:

                        String displayQuery =
                                "SELECT * FROM Book "
                                + "WHERE Availability = true";

                        Statement stmt =
                                con.createStatement();

                        ResultSet rs2 =
                                stmt.executeQuery(displayQuery);

                        System.out.println(
                                "\n===== AVAILABLE BOOKS =====");

                        while (rs2.next()) {

                            System.out.println(
                                    "ID: "
                                    + rs2.getInt("BookID")
                                    + " | Title: "
                                    + rs2.getString("Title")
                                    + " | Author: "
                                    + rs2.getString("Author")
                                    + " | Price: Rs."
                                    + rs2.getDouble("Price")
                            );
                        }

                        break;


                    case 4:

                        System.out.print(
                                "Enter Book ID to issue: ");

                        int issueId = sc.nextInt();

                        String updateQuery =
                                "UPDATE Book SET Availability = false "
                                + "WHERE BookID = ?";

                        PreparedStatement ps3 =
                                con.prepareStatement(updateQuery);

                        ps3.setInt(1, issueId);

                        int rows =
                                ps3.executeUpdate();

                        if (rows > 0) {

                            System.out.println(
                                    "Book issued successfully!");

                        } else {

                            System.out.println(
                                    "Book not found!");
                        }

                        break;


                    case 5:

                        System.out.println("Program ended.");
                        break;


                    default:

                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (SQLException e) {

            System.out.println("Database Error!");
            e.printStackTrace();
        }

        sc.close();
    }
}