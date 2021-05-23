import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public Quiz() {  }
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int noOfAnswersCorrect = 0;
    private Scanner inputScanner = new Scanner(System.in);

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    private String getUserAnswers() {
        String userAnswer = inputScanner.nextLine();
        return userAnswer;
    }

    public ArrayList<Question> getQuestions() { return this.questions; }

    public void runQuiz() {
        int intQuestionNo = 1;
        for (Question question : questions) {
            System.out.println(intQuestionNo + ". " + question.getTheQuestion());
            String usersAnswer = this.getUserAnswers();
            if (question.answerCheck(usersAnswer)) {
                this.noOfAnswersCorrect++;
            }
            intQuestionNo++;
        }
        double percentageCorrect = ((double) this.noOfAnswersCorrect / (double) this.questions.size()) * 100;
        System.out.println("Total Correct answers are : " + this.noOfAnswersCorrect);
        System.out.println("Your Grade is : " + percentageCorrect + "%");
    }
}