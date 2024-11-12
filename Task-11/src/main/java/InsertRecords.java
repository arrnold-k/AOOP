import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "0000";

        String sql = "INSERT INTO Registration (name, address, program) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Alice");
            pstmt.setString(2, "123 Main St");
            pstmt.setString(3, "Computer Science");
            pstmt.executeUpdate();

            pstmt.setString(1, "Bob");
            pstmt.setString(2, "456 Park Ave");
            pstmt.setString(3, "Mathematics");
            pstmt.executeUpdate();

            pstmt.setString(1, "Charlie");
            pstmt.setString(2, "789 Elm St");
            pstmt.setString(3, "Physics");
            pstmt.executeUpdate();

            pstmt.setString(1, "David");
            pstmt.setString(2, "101 Pine Rd");
            pstmt.setString(3, "Chemistry");
            pstmt.executeUpdate();

            System.out.println("Records inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
