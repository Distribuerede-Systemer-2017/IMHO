package objects;

public class Answer {

    private int idAnswer;
    private int answerResult;
    private int optionIdOption;
    private int optionQuestionIdQuestion;
    private int optionQuestionQuizIdQuiz;
    private int optionQuestionQuizTopicIdTopic;

    public Answer(int idAnswer, int answerResult, int optionIdOption, int optionQuestionIdQuestion, int optionQuestionQuizIdQuiz, int optionQuestionQuizTopicIdTopic) {
        this.idAnswer = idAnswer;
        this.answerResult = answerResult;
        this.optionIdOption = optionIdOption;
        this.optionQuestionIdQuestion = optionQuestionIdQuestion;
        this.optionQuestionQuizIdQuiz = optionQuestionQuizIdQuiz;
        this.optionQuestionQuizTopicIdTopic = optionQuestionQuizTopicIdTopic;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public int getAnswerResult() {
        return answerResult;
    }

    public void setAnswerResult(int answerResult) {
        this.answerResult = answerResult;
    }

    public int getOptionIdOption() {
        return optionIdOption;
    }

    public void setOptionIdOption(int optionIdOption) {
        this.optionIdOption = optionIdOption;
    }

    public int getOptionQuestionIdQuestion() {
        return optionQuestionIdQuestion;
    }

    public void setOptionQuestionIdQuestion(int optionQuestionIdQuestion) {
        this.optionQuestionIdQuestion = optionQuestionIdQuestion;
    }

    public int getOptionQuestionQuizIdQuiz() {
        return optionQuestionQuizIdQuiz;
    }

    public void setOptionQuestionQuizIdQuiz(int optionQuestionQuizIdQuiz) {
        this.optionQuestionQuizIdQuiz = optionQuestionQuizIdQuiz;
    }

    public int getOptionQuestionQuizTopicIdTopic() {
        return optionQuestionQuizTopicIdTopic;
    }

    public void setOptionQuestionQuizTopicIdTopic(int optionQuestionQuizTopicIdTopic) {
        this.optionQuestionQuizTopicIdTopic = optionQuestionQuizTopicIdTopic;
    }
}
