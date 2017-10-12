package Models;

public class Question {

    private int idQuestion;
    private String question;
    private int quizIdQuiz;
    private int quizTopicIdTopic;

    public Question(int idQuestion, String question, int quizIdQuiz, int quizTopicIdTopic) {
        this.idQuestion = idQuestion;
        this.question = question;
        this.quizIdQuiz = quizIdQuiz;
        this.quizTopicIdTopic = quizTopicIdTopic;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuizIdQuiz() {
        return quizIdQuiz;
    }

    public void setQuizIdQuiz(int quizIdQuiz) {
        this.quizIdQuiz = quizIdQuiz;
    }

    public int getQuizTopicIdTopic() {
        return quizTopicIdTopic;
    }

    public void setQuizTopicIdTopic(int quizTopicIdTopic) {
        this.quizTopicIdTopic = quizTopicIdTopic;
    }
}
