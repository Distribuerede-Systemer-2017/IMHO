package server.dbmanager;

import server.models.User;

import java.sql.*;


public class dbmanager4 {

   private static String URL = "jdbc:mysql://localhost:3306/quizDB?useSSL=false";
   private static String USERNAME = "test";
   private static String PASSWORD = "";
   private static Connection connection = null;

   public dbmanager4() throws Exception{
       try {
           connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
           System.exit(1);
       }
   }

   private static void close(){
       try{
           connection.close();
       } catch (SQLException e){
           e.printStackTrace();
       }
   }


   
   public User getUserProfile(String idUser) {

   ResultSet resultSet = null;
   User user = null;

      try {

       PreparedStatement getUserProfile = connection
               .prepareStatement("SELECT * FROM User where idUser = ?");


           getUserProfile.setString(1, idUser);

           resultSet = getUserProfile.executeQuery();

           while(resultSet.next()) {
               user = new User();
               user.setIdUser(resultSet.getInt("idUser"));
               user.setType(resultSet.getInt("type"));
               user.setUsername(resultSet.getString("username"));
               user.setPassword(resultSet.getString("password"));

           }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
          try {
               resultSet.close();
          } catch (SQLException ex) {
              ex.printStackTrace();
              close();
          }

      }
      return user;
   }

}
