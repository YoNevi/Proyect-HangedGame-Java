import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        // Statements and Assignments
        String secretWord = "cat";
        int attempts = 0;
        int maximumAttempts = 10;
        boolean isGuessedWord = false;

        // Arrays
        char[] charGuessed = new char[secretWord.length()];

        // loops

        for (int i = 0; i < charGuessed.length; i++){
            charGuessed[i] = '_';

        }
        while(!isGuessedWord && attempts < maximumAttempts){
            System.out.println("Word to guess:  " + String.valueOf(charGuessed));
            char letter = scanner.next().charAt(0);
            boolean correctWord = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    charGuessed[i] = secretWord.charAt(i);
                    correctWord = true;
                }

            }
            if(!correctWord){
                attempts++;
                System.out.println("Letter Incorrect you have " + (maximumAttempts - attempts) + " left");
            }
            if(String.valueOf(charGuessed).equals(secretWord)){
                isGuessedWord = true;
                    System.out.println("Congratulations! You guessed it!");
            }



        }
        if(!isGuessedWord){
            System.out.println("You ran out of attempts");
        }











    }

}