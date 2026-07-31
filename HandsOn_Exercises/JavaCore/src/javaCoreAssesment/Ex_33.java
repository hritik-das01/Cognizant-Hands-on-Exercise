package javaCoreAssesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex_33 {
	    private String url = "jdbc:mysql://localhost:3306/testdb";
	    private String user = "root";
	    private String password = "password";

	    public void insertStudent(int id, String name) {
	        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.setString(2, name);
	            pstmt.executeUpdate();
	            System.out.println("Student inserted successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void updateStudent(int id, String newName) {
	        String sql = "UPDATE students SET name = ? WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, newName);
	            pstmt.setInt(2, id);
	            pstmt.executeUpdate();
	            System.out.println("Student updated successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
}
