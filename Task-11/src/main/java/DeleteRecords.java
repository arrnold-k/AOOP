import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecords {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "0000";

        String sql = "DELETE FROM Registration WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 101);
            pstmt.executeUpdate();
            System.out.println("Record deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
