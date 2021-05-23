public abstract class Question {
    public abstract boolean answerCheck(String answer);
    private final String strQuestion;
    private final String strAnswer;

    public Question(String question, String answer) {
        this.strQuestion = question;
        this.strAnswer = answer;
    }

    public String getTheQuestion() {
        return this.strQuestion;
    }
    public String getTheAnswer() {
        return this.strAnswer;
    }
}