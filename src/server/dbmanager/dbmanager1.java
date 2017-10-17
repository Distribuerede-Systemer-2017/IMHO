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
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception exception) {
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

    public User authorizeUser(String username, String password) throws IllegalArgumentException {

        ResultSet resultSet = null;
        User user = null;

        try {
            PreparedStatement authorizeUser = connection.prepareStatement("SELECT * from User where username = ? AND password = ?");

            authorizeUser.setString(1, username);
            authorizeUser.setString(2, password);

            resultSet = authorizeUser.executeQuery();

            while(resultSet.next()) {
                user = new User();
                user.setIdUser(resultSet.getInt("idUser"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password)"));
                user.setType(resultSet.getInt("type"));

            }

        } catch(SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

}
