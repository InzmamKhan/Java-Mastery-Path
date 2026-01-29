import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query_Manipulation {
    private static final String URL = "jdbc:mysql://localhost:3306/my_new_database";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Your_Password_Here"; 

    public static void main(String[] args) {
        String insertSQL = "INSERT INTO students (name, email) VALUES (?, ?)";

        // Try-with-resources automatically closes Connection and PreparedStatement
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            // Setting parameters for the placeholders (?)
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "john@example.com");

            int rowsInserted = pstmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}