package server.dbmanager;

import server.models.Quiz;

import java.sql.PreparedStatement;
import java.sql.SQLData;
import java.sql.SQLException;

public class dbmanager2 {

    public boolean createQuiz(Quiz quiz) throws IllegalArgumentException {
        try {
            PreparedStatement createQuiz = connection
                    .prepareStatement("INSERT INTO Quiz (String createdBy, String url, int questionCount, String quizTitle, String quizDescription, int topicId) VALUES (?,?,?,?,?,?)");

            createQuiz.setString(1, quiz.getCreatedBy());
            createQuiz.setString(2, quiz.getUrl());
            createQuiz.setInt(3, quiz.getQuestionCount());
            createQuiz.setString(4, quiz.getQuizTitle());
            createQuiz.setString(5, quiz.getQuizDescription());
            createQuiz.setInt(6, quiz.getTopicId());

            int rowsAffected = createQuiz.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
