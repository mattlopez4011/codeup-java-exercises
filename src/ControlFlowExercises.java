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
//        for (int i = 1; i <= 100; i++){
//
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }

//========Display a table of powers.
//        Prompt the user to enter an integer.
        System.out.println("Enter your number...");
        int userNum =  Integer.parseInt(input.nextLine());
        System.out.println(userNum);




    } // End of Main class
}
