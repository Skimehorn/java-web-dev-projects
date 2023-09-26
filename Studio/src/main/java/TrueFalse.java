import java.util.Scanner;


public class TrueFalse extends QuestionParent {

    private Boolean answer;


    public TrueFalse(String question, Boolean answer) {
        super(question);
        this.answer = answer;
    }

    public Boolean getAnswer() {

        return null;
    }

    @Override
    public String makeTestQuestion() {
        return null;
    }
}
