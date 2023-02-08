import java.util.HashMap;

public class QuizRunner {

    public static void main(String[] args) {

        HashMap<String, String> quiz = new HashMap<String, String>();

        quiz.put("True or False: Tomatoes are a vegetable", "False");
        quiz.put("What is Pol Tarres' height?  a. 5'10, b. 6'1, c. 6'3, d. 6'7: ", "d");

        QuestionBoolean qB1 = new QuestionBoolean("True or False: Mars is closer to the sun than Earth: ", "False");
        QuestionMultiple qM1 = new QuestionMultiple("What is my favorite color?:  a. yellow, b. blue, c. green", "b");
        quiz.put(qB1.getQuestion(), qB1.getAnswer());
        quiz.put(qM1.getQuestion(), qM1.getAnswer());

        Quiz.runQuiz(quiz);

    }
}
