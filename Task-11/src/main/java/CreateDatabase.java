import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "0000";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE DATABASE Student";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
