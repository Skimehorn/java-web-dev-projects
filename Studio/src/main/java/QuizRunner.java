import java.util.Objects;
import java.util.Scanner;

public class QuizRunner {
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Put your quiz here!");

        while(true){
            System.out.println("Please select \n 1) What, 2) End the program");
            String userInput = menuInput.nextLine;
            System.out.println(userInput);

            if(Objects.equals(userInput, "1")) {
                System.out.println("Please enter your name: ");
                String userName = menuinput.nextLine();
                System.out.println(userName);
            }
            if(Objects.equals(userInput, "2")) {
                System.out.println("End the program");
                String userName = menuinput.nextLine();
                System.out.println(userName);
            }

        }
    }
}
