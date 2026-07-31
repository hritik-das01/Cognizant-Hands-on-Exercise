package javaCoreAssesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex_34 {

	public static void transferMoney(int fromAcc, int toAcc, double amount) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false); // Begin transaction

            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAcc);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAcc);
                creditStmt.executeUpdate();

                conn.commit(); // Commit transaction
                System.out.println("Transfer successful!");
            } catch (Exception e) {
                conn.rollback(); // Rollback on failure
                System.out.println("Transaction failed. Rolled back.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
