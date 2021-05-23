public class CheckBoxQuestion extends Question{
    public CheckBoxQuestion(String question, String answer){
        super(question,answer);
    }

    public boolean answerCheck(String answer){
        if (answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
