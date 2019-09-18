//import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Loop Basics
//        Do While

//        int i = 5;
//        while(i <= 15){
//            System.out.format("%d ", i );
//            i++;
//
//        }
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= Math.pow(i, 1);
//        }
//        while (i <= 1000000);

//        Refactor the previous two exercises to use a for loop instead.
//        For Loop
//        int y = 5;
//        for (int i = 5; i <= 15; i++){
//            System.out.format("%d ", y);
//            y++;
//        }

//        int y = 5;
//        for (int i = 100; i >= -10; i-=5){
//            System.out.format("%d%n ", i);
////            y++;
//        }

//        for (int i = 2; i <= 1000000; i *= Math.pow(i, 1) ){
//            System.out.println(i);
//        }


//==========Fizzbuzz exercise

//        Write a program that prints the numbers from 1 to 100.
//        for (int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }

//        For multiples of three: print “Fizz” instead of the number.
//        for (int i = 1; i <= 100; i++){
//
//            if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//        }

//        For the multiples of five: print “Buzz”.
//        for (int i = 1; i <= 100; i++){
//
//            if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }

//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 1; i <= 100; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

//========Display a table of powers.
//        Prompt the user to enter an integer.

//        do {
//            System.out.println("What number would you like to go up to?");
//            int userNum =  Integer.parseInt(input.nextLine());
////            System.out.println(userNum); // Shows the users input
//            System.out.println(userNum);
//            if (userNum.isEmpty()){
//                System.out.println("OOPS! Enter a number...");
//            }else{
//                System.out.printf("number");
//                System.out.printf("- - - - - -");
//                for (int i = 1; i <= userNum; i++ ){
//                    System.out.println(i);
//
//                }
//
//            }

//                Ask user if they would like to continue
//                System.out.println("Would you like to continue?");
//                String userContinue = input.nextLine();
//                Sting userYes = "yes";

//        }while(true);
//
//boolean userInput = false;

//        ==================================================
        // convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)
//        String cat = "cat"; // "atcay"
//        String pigLatinCar = ;


    } // End of Main class
}
