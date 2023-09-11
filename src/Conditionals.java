import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int answer = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        // This shows off a multi-condition statement.
        // You could possibly test multiple conditions on the same line using && (and) or || (or).
        /*
         if (guess < answer || guess > answer){
            ...
         }
         */
        if (guess < answer){
            System.out.println("Your guess was too low.");
        }
        else if (guess > answer){
            System.out.println("Too high!");
        }
        else {
            System.out.println("You got it!");
        }
        scanner.close();
    }
}
