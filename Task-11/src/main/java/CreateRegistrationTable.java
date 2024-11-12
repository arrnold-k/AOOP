import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRegistrationTable {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "0000";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE Registration (" +
                         "id SERIAL PRIMARY KEY, " +
                         "name VARCHAR(100), " +
                         "address VARCHAR(200), " +
                         "program VARCHAR(100))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
