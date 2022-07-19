package repository;

import java.sql.Connection;

public class DatabaseManager {

    private static Connection connection;

    private DatabaseManager() {

    }
    public static Connection getConnection() {
        return connection;
    }
}
