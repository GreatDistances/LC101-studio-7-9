import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

    private static int numCorrect;

    public static void addQuestion() {
        int newQuestionType;
        String newQuestion;
        String newAnswer;
        Scanner s = new Scanner(System.in);

        System.out.println("Is the question (1) True/False, (2) Multiple Choice, or (3) CheckBox?");
        newQuestionType = s.nextInt();
        System.out.println("Enter the quiz question you are adding: ");
        newQuestion = s.next();
        System.out.println("Enter the quiz answer you are adding: ");
        newAnswer = s.next();

        if (newQuestionType == 1) {
            QuestionBoolean newQ = new QuestionBoolean(newQuestion, newAnswer);
            //quiz.put(newQ.getQuestion(), newQ.getAnswer());
            // TODO - not functional.  figure out how to add objects to HashMap in other Class
        } else if (newQuestionType == 2) {
            QuestionMultiple newQ = new QuestionMultiple(newQuestion, newAnswer);
            //quiz.put(newQ.getQuestion(), newQ.getAnswer());
            // TODO - not functional.  figure out how to add objects to HashMap in other Class
        } else if (newQuestionType == 3) {
            QuestionCheckBox newQ = new QuestionCheckBox(newQuestion, newAnswer);
            //quiz.put(newQ.getQuestion(), newQ.getAnswer());
            // TODO - not functional.  figure out how to add objects to HashMap in other Class
        }
    }

    public static void runQuiz(HashMap<String, String> quiz) {
        numCorrect = 0;
        int numQuestions = quiz.size();
        Scanner s = new Scanner(System.in);
        String guess;

        boolean flag = true;
        while (flag) {
            System.out.println("Would you like to (1) run the quiz, or (2) add a question to the quiz?");
            int option;
            option = s.nextInt();
            if (option == 2) {
                addQuestion();
            }
            if (option == 1) {
                flag = false;
            }
        }

        for (Map.Entry<String, String> entry : quiz.entrySet()) {
            System.out.println(entry.getKey());
            guess = s.next().toUpperCase();
            if (guess.equals(entry.getValue().toUpperCase())) {
                numCorrect++;
            }
        }
        gradeQuiz(numCorrect, numQuestions);
    }

    public static void gradeQuiz(int correctAnswers, int questions) {
        DecimalFormat f = new DecimalFormat("##.##");

        double quizScore = (((double) correctAnswers / (double) questions) * 100);

        System.out.println("You guessed correctly on " + correctAnswers + " of " + questions + " questions. Your quiz score is: " + f.format(quizScore) + "%.");
    }
}
