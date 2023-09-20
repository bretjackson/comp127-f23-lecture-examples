import java.util.Scanner;

/**
 * Shows examples of different looping patterns
 */
public class LetterGradeLoops {

   public static void main(String[] args){

       Scanner scan = new Scanner(System.in);

       // 1. Start by not using a loop at all. Ask the user for three grades and average them.
    //    System.out.print("Enter a grade: ");
    //    double grade1 = scan.nextDouble();
    //    System.out.print("\nEnter a grade: ");
    //    double grade2 = scan.nextDouble();
    //    System.out.print("\nEnter a grade: ");
    //    double grade3 = scan.nextDouble();

    //    double avg = (grade1+grade2+grade3)/3;
    //    System.out.println("Your average was: " + avg );

       /* 2. Better way with less repeated code.
        * This uses the do-n-times pattern:
        *   for(initialization; test; step) {
                do work
            }
        */
        // int numGrades = 3;
        // double total = 0; //Accumulator variable
        // for(int i = 0; i < numGrades; i++){
        //     System.out.print("\nEnter a grade: ");
        //     total += scan.nextDouble();
        // }
        // double avg = (total)/numGrades;
        // System.out.println("Your average was: " + avg );



       /* 3. Different way
        * This uses the repeat-until-sentinel pattern
        *   prompt for first value or initialize the value
            while(value != sentinel) {
                do work
                prompt user for new value or calculate a new value
            }
        */
        // int sentinel = -1;
        // int numGrades = 0;
        // double total = 0; //Accumulator variable
        // System.out.print("\nEnter a grade: ");
        // double value = scan.nextDouble();
        // while(value != sentinel){
        //     total += value;
        //     System.out.print("\nEnter a grade: ");
        //     value = scan.nextDouble();
        //     numGrades++;
        // }
        // double avg = (total)/numGrades;
        // System.out.println("Your average was: " + avg );


       /* 4. Here's an alternative form of the repeat-until-sentinel pattern
        *       while (true) {
                    prompt for value
                    if (value == sentinel) {
                        break;
                    }
                    do work
                }

        */

        int sentinel = -1;
        int numGrades = 0;
        double total = 0; //Accumulator variable

        while(true){
            System.out.print("\nEnter a grade: ");
            double value = scan.nextDouble();
            if (value == sentinel){
                break;
            }
            total += value;
            numGrades++;
        }
        double avg = (total)/numGrades;
        System.out.println("Your average was: " + avg );

       
   }
}
