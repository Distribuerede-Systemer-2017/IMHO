package objects;

public class Option {

    private int idOption;
    private String option;
    private int questionIdQuestion;
    private int questionQuizIdQuiz;
    private int questionQuizTopicIdTopic;

    public Option(int idOption, String option, int questionIdQuestion, int questionQuizIdQuiz, int questionQuizTopicIdTopic) {
        this.idOption = idOption;
        this.option = option;
        this.questionIdQuestion = questionIdQuestion;
        this.questionQuizIdQuiz = questionQuizIdQuiz;
        this.questionQuizTopicIdTopic = questionQuizTopicIdTopic;
    }

    public int getIdOption() {
        return idOption;
    }

    public void setIdOption(int idOption) {
        this.idOption = idOption;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getQuestionIdQuestion() {
        return questionIdQuestion;
    }

    public void setQuestionIdQuestion(int questionIdQuestion) {
        this.questionIdQuestion = questionIdQuestion;
    }

    public int getQuestionQuizIdQuiz() {
        return questionQuizIdQuiz;
    }

    public void setQuestionQuizIdQuiz(int questionQuizIdQuiz) {
        this.questionQuizIdQuiz = questionQuizIdQuiz;
    }

    public int getQuestionQuizTopicIdTopic() {
        return questionQuizTopicIdTopic;
    }

    public void setQuestionQuizTopicIdTopic(int questionQuizTopicIdTopic) {
        this.questionQuizTopicIdTopic = questionQuizTopicIdTopic;
    }
}
