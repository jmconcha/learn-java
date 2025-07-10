import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (
              Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
              Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name STRING);");
            statement.executeUpdate("INSERT INTO users VALUES (1, 'Jane Doe');");
            statement.executeUpdate("INSERT INTO users VALUES (2, 'John Doe');");
            ResultSet result = statement.executeQuery("SELECT * FROM users;");

            while (result.next()) {
                System.out.println("id: " + result.getInt("id"));
                System.out.println("id: " + result.getString("name"));
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
}