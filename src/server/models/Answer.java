package server.models;

public class Answer {

    private int idAnswer;
    private int userId;
    private int optionIdOption;

    public Answer(int idAnswer, int optionIdOption, int userId) {
        this.idAnswer = idAnswer;
        this.optionIdOption = optionIdOption;
        this.userId = userId;
    }

    public Answer(){

    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public int getOptionIdOption() {
        return optionIdOption;
    }

    public void setOptionIdOption(int optionIdOption) {
        this.optionIdOption = optionIdOption;
    }
}
