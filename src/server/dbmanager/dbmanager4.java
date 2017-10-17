package server.dbmanager;

import server.models.Option;
import server.models.Question;
import server.models.Quiz;
import server.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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

   public List<Question> getQuestion(Quiz quiz){
       ResultSet resultSet = null;
       List<Question> questions = new ArrayList<>();

       try{
           PreparedStatement getQuestion = connection.prepareStatement("SELECT * FROM Question WHERE quiz_id = ?");

           getQuestion.setInt(1,quiz.getIdQuiz());
           resultSet = getQuestion.executeQuery();

           while(resultSet.next()){
               Question question = new Question();
               question.setIdQuestion(resultSet.getInt("idQuestion"));
               question.setQuestion(resultSet.getString("question"));
               question.setQuizIdQuiz(resultSet.getInt("quiz_id"));
               questions.add(question);
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
    return questions;

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
