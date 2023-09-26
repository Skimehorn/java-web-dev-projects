import java.util.Scanner;

public class CheckBox extends questionParent{

    public CheckBox( String question, Scanner scan, String answer ) {
        super(question);
        this.answer = answer;

    }


    private static final Scanner menuInput = new Scanner(System.in);

//   String answer = scan.nextLine();
//
//        System.out.println("quiz answer");


        @Override
    public String makeTestQuestion(){
            return null;
    }
}
