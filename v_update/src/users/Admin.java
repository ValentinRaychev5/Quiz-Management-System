package users;

import quiz.Quiz;

public class Admin extends User {

    public void createQuiz() {

    }

    public void addQuestion(Quiz quiz) {
        System.out.println("Add a question and an answer: ");
        String[] wrongAnswersInput = new String[3];
        for (int i = 0; i < wrongAnswersInput.length; i++) {
            wrongAnswersInput[i] = scanner.nextLine();
        }
        quiz.questions.put(quiz.questions.size() + 1, scanner.nextLine());
        quiz.correctAnswers.put(quiz.correctAnswers.size() + 1, scanner.nextLine());
        quiz.wrongAnswers.put(quiz.wrongAnswers.size() + 1, wrongAnswersInput);
    }

    public void editQuestion(int questionNum, Quiz quiz) {          //WHAT TO EDIT!
        try {
            quiz.questions.containsKey(questionNum);

            String[] wrongAnswersInput = new String[3];
            for (int i = 0; i < wrongAnswersInput.length; i++) {
                wrongAnswersInput[i] = scanner.nextLine();
            }

            quiz.questions.replace(questionNum, scanner.nextLine());
            quiz.correctAnswers.replace(questionNum, scanner.nextLine());
            quiz.wrongAnswers.replace(questionNum, wrongAnswersInput);

        } catch(Exception e) {
            System.out.println("Quiz does not contain such question!");
        }
    }

    public int seeUserResults(NormalUser normalUser, int quizNum) {
        return normalUser.quizScore[quizNum - 1][0];
    }

    public void assignQuizTo(NormalUser normalUser, int quizNum) {
        normalUser.assignedQuizzes.add(quizNum);
    }
}
