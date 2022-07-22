package repository;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {

    private static Connection connection;
    private PropertiesConfiguration databaseProperties = new PropertiesConfiguration();

    public DatabaseManager() {
        this.setUpDatabase();
    }

    private void setUpDatabase() {

        try {
            databaseProperties.load("database.properties");

            String username = databaseProperties.getString("database.username");
            String password = databaseProperties.getString("database.password");
            String host = databaseProperties.getString("database.host");
            String port = databaseProperties.getString("database.port");
            String dbName = databaseProperties.getString("database.dbName");

            //String connectionUrl = "jdbc:mysql://localhost:3306/java_27_28_todo_app";
            String connectionUrl = host + ":" + port + "/" + dbName;

            connection = DriverManager.getConnection(connectionUrl, username, password);
        }catch (SQLException | ConfigurationException exception) {
            System.out.println("Error occurred while connecting to MySQL");
            exception.printStackTrace();
        }
    }

    public Connection getConnection() {

        return connection;
    }
}
