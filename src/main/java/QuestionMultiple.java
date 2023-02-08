public class QuestionMultiple extends Question {

    private String answer;

    public QuestionMultiple(String question, String answer) {
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
