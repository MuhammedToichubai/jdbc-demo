package java13.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Mukhammed Asantegin
 */

public class DatabaseConfig {
    public static Connection getConnection() {
        try {
           return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5434/postgres",
                    "postgres",
                    "yiman"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
