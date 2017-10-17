package server.dbmanager;
import java.sql.*;

import server.models.User;


public class dbmanager1 {

    private static final String URL = "jdbc:mysql://localhost:3306/quizDB?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hello";
    private static Connection connection = null;

    public dbmanager1() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private static void close() {
        try {
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
