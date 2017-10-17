package server.dbmanager;

import server.models.Question;
import server.models.Quiz;
import server.resetdatabase.ResetDatabase;

import java.sql.*;

public class dbmanager2 {

        private static final String URL = "jdbc:mysql://localhost:3306/quizDB?useSSL=false";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "hello";
        private static Connection connection = null;

        public dbmanager2() {
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

    public boolean createQuiz(Quiz quiz) throws IllegalArgumentException {
        try {
            PreparedStatement createQuiz = connection
                    .prepareStatement("INSERT INTO Quiz (String created_by, int question_count, String quiz_title, String quiz_description, int topic_d) VALUES (?,?,?,?,?)");

            createQuiz.setString(1, quiz.getCreatedBy());
            createQuiz.setInt(2, quiz.getQuestionCount());
            createQuiz.setString(3, quiz.getQuizTitle());
            createQuiz.setString(4, quiz.getQuizDescription());
            createQuiz.setInt(5, quiz.getTopicId());

            int rowsAffected = createQuiz.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createQuestion(Question question) throws IllegalArgumentException {
        try {
            PreparedStatement createQuestion = connection
                    .prepareStatement("INSERT INTO  (VARCHAR question, int quiz_id) VALUES (?, ?)");
            createQuestion.setString(1, question.getQuestion());
            createQuestion.setInt(2, question.getQuizIdQuiz());

            int rowsAffected = createQuestion.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteQuiz(Quiz quiz) throws IllegalArgumentException {
        try {
            PreparedStatement deleteQuiz = connection
                    .prepareStatement("DELETE FROM Quiz WHERE idQuiz = ?");

            deleteQuiz.setInt(1, quiz.getIdQuiz());

            int rowsAffected = deleteQuiz.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
