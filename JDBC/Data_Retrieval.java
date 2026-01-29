import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data_Retrieval {
    private static final String URL = "jdbc:mysql://localhost:3306/my_new_database";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Your_Password_Here"; 

    public static void main(String[] args) {
        String query = "SELECT id, name, email FROM students";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("ID | Name | Email");
            System.out.println("-------------------");

            while (rs.next()) {
                // Retrieving by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " | " + name + " | " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}