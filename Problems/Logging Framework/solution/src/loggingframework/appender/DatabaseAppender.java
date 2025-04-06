package loggingframework.appender;

import loggingframework.LogMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// create database connection and insert into the table
public class DatabaseAppender implements LogAppender{

    private final String jdbcURL;

    private final String username;

    private final String password;

    public DatabaseAppender(String jdbcURL, String username, String password) {
        this.jdbcURL = jdbcURL;
        this.username = username;
        this.password = password;
    }

    @Override
    public void append(LogMessage logMessage) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO logs (level, message, timestamp) values (?,?,?)");
            preparedStatement.setString(1, logMessage.getLogLevel().toString());
            preparedStatement.setString(2, logMessage.getMessage());
            preparedStatement.setLong(3, logMessage.getTimestamp());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
