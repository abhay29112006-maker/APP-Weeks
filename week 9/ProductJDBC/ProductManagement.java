import java.sql.*;
import java.util.Scanner;

public class ProductManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/StoreDB";
        String username = "root";
        String password = "1608";

        try {

            
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println(
                    "Database Connected Successfully!");

            int choice;

            do {

                System.out.println("\n===== PRODUCT MENU =====");
                System.out.println("1. Insert Product");
                System.out.println("2. Retrieve Product");
                System.out.println("3. Update Quantity");
                System.out.println("4. Display Low Stock Products");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // INSERT PRODUCT
                    case 1:

                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int quantity = sc.nextInt();

                        String insertQuery =
                                "INSERT INTO Product "
                                + "VALUES (?, ?, ?, ?)";

                        PreparedStatement ps =
                                con.prepareStatement(insertQuery);

                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setDouble(3, price);
                        ps.setInt(4, quantity);

                        ps.executeUpdate();

                        System.out.println(
                                "Product inserted successfully!");

                        break;


                    // RETRIEVE PRODUCT
                    case 2:

                        System.out.print(
                                "Enter Product ID: ");

                        int searchId = sc.nextInt();

                        String searchQuery =
                                "SELECT * FROM Product "
                                + "WHERE ProductID = ?";

                        PreparedStatement ps2 =
                                con.prepareStatement(searchQuery);

                        ps2.setInt(1, searchId);

                        ResultSet rs =
                                ps2.executeQuery();

                        if (rs.next()) {

                            System.out.println(
                                    "\nProduct ID: "
                                    + rs.getInt("ProductID"));

                            System.out.println(
                                    "Product Name: "
                                    + rs.getString("ProductName"));

                            System.out.println(
                                    "Price: "
                                    + rs.getDouble("Price"));

                            System.out.println(
                                    "Quantity: "
                                    + rs.getInt("Quantity"));

                        } else {

                            System.out.println(
                                    "Product not found!");
                        }

                        break;


                    // UPDATE QUANTITY
                    case 3:

                        System.out.print(
                                "Enter Product ID: ");

                        int updateId = sc.nextInt();

                        System.out.print(
                                "Enter New Quantity: ");

                        int newQuantity = sc.nextInt();

                        String updateQuery =
                                "UPDATE Product SET Quantity = ? "
                                + "WHERE ProductID = ?";

                        PreparedStatement ps3 =
                                con.prepareStatement(updateQuery);

                        ps3.setInt(1, newQuantity);
                        ps3.setInt(2, updateId);

                        int rows =
                                ps3.executeUpdate();

                        if (rows > 0) {

                            System.out.println(
                                    "Quantity updated successfully!");

                        } else {

                            System.out.println(
                                    "Product not found!");
                        }

                        break;


                    // DISPLAY LOW STOCK PRODUCTS
                    case 4:

                        String lowStockQuery =
                                "SELECT * FROM Product "
                                + "WHERE Quantity < 10";

                        PreparedStatement ps4 =
                                con.prepareStatement(
                                        lowStockQuery);

                        ResultSet rs2 =
                                ps4.executeQuery();

                        System.out.println(
                                "\n===== LOW STOCK PRODUCTS =====");

                        while (rs2.next()) {

                            System.out.println(
                                    "ID: "
                                    + rs2.getInt("ProductID")
                                    + " | Name: "
                                    + rs2.getString("ProductName")
                                    + " | Price: Rs."
                                    + rs2.getDouble("Price")
                                    + " | Quantity: "
                                    + rs2.getInt("Quantity"));
                        }

                        break;


                    case 5:

                        System.out.println(
                                "Program ended.");

                        break;


                    default:

                        System.out.println(
                                "Invalid choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Database Error!");

            e.printStackTrace();
        }

        sc.close();
    }
}