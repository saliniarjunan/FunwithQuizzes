public class QuizRunner {
    public static void main(String args[]){
        Quiz myQuiz = new Quiz();

        TrueFalseQuestion tfQuestion = new TrueFalseQuestion("The bald eagle has been the national bird of the United States since 1782 (True / False) ? : ","True");
        myQuiz.addQuestion(tfQuestion);

        CheckBoxQuestion cbQuestion = new CheckBoxQuestion("Which are all web technologies (Select that all apply, delimited your answer with comma)? A: ASP; B: ColdFusion; C: Mainframe; D: PHP  ","A,B,D");
        myQuiz.addQuestion(cbQuestion);

        MultipleChoiceQuestion mcQuestion = new MultipleChoiceQuestion("Which below is Database \nA: Java\nB: Junit\nC: MS SQL Server\nPlease enter the single letter as an answer", "C");
        myQuiz.addQuestion(mcQuestion);

        myQuiz.runQuiz();
    }
}
