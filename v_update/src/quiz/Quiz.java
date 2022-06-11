package quiz;

import java.util.HashMap;

public class Quiz {
//      CSV FILE STRUCTURE -> REPETITIVE QUESTIONS
//    private static int quizIndex;
    public HashMap<Integer, String> questions;  //FOR ALL 3 <QuizNum, Question/Answer>
    public HashMap<Integer, String> correctAnswers;
    public HashMap<Integer, String[]> wrongAnswers;

    public Quiz(HashMap<Integer, String> questions,
                HashMap<Integer, String> correctAnswers,
                HashMap<Integer, String[]> wrongAnswers) {

        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
    }
}
