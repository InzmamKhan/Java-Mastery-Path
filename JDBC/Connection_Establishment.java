import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Establishment {
    // 1. Define database credentials and URL
    private static final String URL = "jdbc:mysql://localhost:3306/my_new_database";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Your_Password_Here"; 

    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        // 2. Establish Connection using Try-with-Resources
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            
            if (connection != null) {
                System.out.println("Success! Connected to the database.");
                System.out.println("Driver Name: " + connection.getMetaData().getDriverName());
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.println("Connection Failed! Check output console");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
        }
    }
}