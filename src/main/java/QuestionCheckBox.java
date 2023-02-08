public class QuestionCheckBox extends Question {


    // TODO - this class is not coded for functionality yet

    private String answer;

    public QuestionCheckBox(String question, String answer) {
        super(question);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
