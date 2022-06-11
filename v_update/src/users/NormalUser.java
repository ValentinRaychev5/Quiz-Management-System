package users;

import java.util.HashMap;
import java.util.List;

public class NormalUser extends User {

    private int lastQuizScore;
    protected int[][] quizScore;    //[QuizNum][Score]
//    public boolean hasAssigned;
    protected List<Integer> assignedQuizzes;

    public void seeLastFiveResult(NormalUser normalUser) {
        for (int currentQuiz = quizScore.length; currentQuiz > quizScore.length - 5; currentQuiz--) {
            System.out.println(quizScore[currentQuiz][0]);
        }
    }

    public void playQuiz(NormalUser normalUser) {
        if (assignedQuizzes.size() > 0) {
            if (assignedQuizzes.size() > 1)
                System.out.println("You have " + assignedQuizzes.size() + " quizzes.");
            else {
                System.out.println("You have an assigned quiz.");
            }
        }
        else {
            System.out.println("Choose a quiz: ");

        }

    }
}
