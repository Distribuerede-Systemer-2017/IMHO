package server.dbmanager;

import server.models.Option;
import server.models.Question;
import server.models.User;

import java.sql.*;
import java.util.ArrayList;


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

   public ArrayList<Question> getQuestion(int quizId){
       ResultSet resultSet = null;
       ArrayList<Question> questions = new ArrayList<>();

       try{
           PreparedStatement getQuestion = connection.prepareStatement("SELECT * FROM Question WHERE quiz_id = ?");

           getQuestion.setInt(1,quizId);
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

    public ArrayList<Option> getOption(Question question){
        ResultSet resultSet = null;
        ArrayList<Option> options = new ArrayList<>();

        try{
            PreparedStatement getOption = connection.prepareStatement("SELECT * FROM Option WHERE question_id = ?");

            getOption.setInt(1,question.getIdQuestion());
            resultSet = getOption.executeQuery();

            while(resultSet.next()){
                Option option = new Option();
                option.setIdOption(resultSet.getInt("idQuestion"));
                option.setOption(resultSet.getString("option"));
                option.setQuestionIdQuestion(resultSet.getInt("question_id"));
                option.setIsCorrect(resultSet.getInt("is_correct"));

                options.add(option);
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
        return options;

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
