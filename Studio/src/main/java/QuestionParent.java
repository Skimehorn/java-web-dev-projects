


public abstract class QuestionParent {

    private static int idCounter = 1;

    private int id = 0;

    private final String question;

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public QuestionParent( String question) {
        this.id = idCounter++;
        this.question = question;
    }

    public abstract String makeTestQuestion();
}


