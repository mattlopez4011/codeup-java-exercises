import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        System.out.println(addFunction(1, 1)); // Call and Returns add Function
//        System.out.println(subtractFunction(2, 1)); // Call and Returns subtract Function
//        System.out.println(multiplyFunction(3 ,3 )); // Call and Returns multiply Function
//        System.out.println(divideFunction(10 ,5 )); // Call and Returns divide Function
//        System.out.println(modulusFunction(9, 2 )); // Call and Returns modulus Function
//        System.out.println(multiplyWLoopFunction(5,5)); // Call and Returns multiply W Loop Function
//        System.out.println("Final num = " + multiplyWRecursion(5,5)); // Call and Returns multiply W Recursion Function
//        System.out.println("Please enter a number between 1 and 10");
//        System.out.println(getInteger(1, 10));
        rollDice();
//        fizzBuzzLoo p(1);




    } // End of main


    public static void fizzBuzzLoop(int i) {
        if (i <= 100){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                    i++;
                    fizzBuzzLoop(i);

            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                    i++;
                    fizzBuzzLoop(i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                    i++;
                    fizzBuzzLoop(i);
            } else {
                System.out.println(i);
                    i++;
                    fizzBuzzLoop(i);
            }
        } // End of if
    }







//    Add Method
    public static int addFunction(int num1, int num2){
        return num1 + num2;

    }

    public static int subtractFunction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplyFunction(int num1, int num2){
        return num1 * num2;
    }

    public static int divideFunction(int num1, int num2){
        return num1 / num2;

    }

    public static int modulusFunction(int num1, int num2){

        return num1 % num2;

    }
// Bonus
    public static int multiplyWLoopFunction(int num1, int num2){
        int finalNum = 0;
        for (int i = 0; i < num1; i++){
            finalNum += num2;
        }
        return finalNum;
    }

    public static int multiplyWRecursion(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else {

            System.out.println("num1 = " + num1 + " num2 = " + num2);
            return (num1 + multiplyWRecursion(num1, num2 -1));

        }

    }



//    public static int getInteger(int min, int max){
//        Scanner input = new Scanner(System.in);
//
//
//        while (true){
//
//            if(input.hasNextInt()){
//                System.out.println("Valid input!");
//
//                int userNum = Integer.parseInt(input.nextLine());
//                if (userNum >= min && userNum <= max ){
//                    System.out.println("Correct!");
//                    System.out.print("You entered " );
//                    return userNum;
//
//                }else {
//                    System.out.println("INCORRECT! Please enter a number between " + min + " and " + max);
//                    return getInteger(min,max);
//                }
//
//            }else {
//                System.out.println("Invalid input!");
//                System.out.println("Please enter a number between " + min + " and " + max);
//                return getInteger(min,max);
//            }
//    //        return 0;
////            input.nextLine(); // Needed to clear scanner of current input.
//        }
//    }}

//    public static int getInteger(int min, int max){
//        Scanner input = new Scanner(System.in);
////        System.out.print("Enter a number between 1 and 10: ");
//
//        if(input.hasNextInt()){
//            System.out.println("Valid input!");
//
//            int userNum = Integer.parseInt(input.nextLine());
//            if (userNum >= min && userNum <= max ){
//                System.out.println("Correct!");
//                System.out.print("You entered " );
//                return userNum;
//
//            }else {
//                System.out.println("INCORRECT! Please enter a number between " + min + " and " + max);
//                return getInteger(min,max);
//            }
//
//        }else {
//            System.out.println("Invalid input!");
//            System.out.println("Please enter a number between " + min + " and " + max);
//            return getInteger(min,max);
//        }
////        return 0;
//
//    }

//  3.  Calculate the factorial of a number.
    public static String getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        String outputText = "";
        String userYesOrNo = "yes"; //Set the while loop to keep looping.
        int counter = 1; // Counts how may times the user plays.
        while(userYesOrNo.equalsIgnoreCase("y") | userYesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Please enter a number between 1 and 10");
//============Checks if the user entered a number.
            if (input.hasNextInt()) {
//                System.out.println("Valid input!");
                    int userNum = Integer.parseInt(input.nextLine()); // Users number

//==========If statement checks if the user entered a number between min & max number
                    if (userNum >= min && userNum <= max) {
//                System.out.println("Correct!");
//                System.out.print("You entered ");

//==================For Loop to get factorial number
                    long factorial = 1;

                    for(int i = 2; i <= userNum; i++){
                    factorial = factorial * i;

                    }
                    System.out.println("Your factorial number is: " + factorial);

//                    printStream outputText = System.out.printf("%s! = 1           = %s\n", counter, factorial);
                        if(counter >= 2){
                            outputText += counter + "! = 1 x " + userNum + "               = " + factorial + "\n";
                            System.out.println(outputText);
                        }else if(counter <= min) {
                            outputText += counter + "! = 1                   = " + factorial + "\n";
                            System.out.println(outputText);
                        }
                        counter++; // Count each time the user plays
                        System.out.println("The counter is at: " + counter);
//                    System.out.println("Would you like to continue playing? Y/N"); // Ask user if they would like to continue playing
//                    userInputAnswer = input.nextLine();
//                    return userNum;
//                    return "";



                    } else {
                    System.out.println("Number out of range! Please enter a number between " + min + " and " + max);
//                    return getInteger(min, max); // Restarts the method again.
                    }

                    } else {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter a number between " + min + " and " + max);

//                    return getInteger(min, max); // Restarts the method again.
                    }
//                return "";
//            input.nextLine(); // Needed to clear scanner of current input.


//    public long factorialUsingForLoop(int n) {
//        long fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;


//==========Ask the user if they would like to continue playing.
            System.out.println("Would you like to play again? Y/N");
            userYesOrNo = input.nextLine();
        } // End of While loop...
        return "Okay, Have a great day!";
    } // End of getInteger







//=============================================
//Create an application that simulates dice rolling.
    public static void rollDice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for pair of dice?");
        int userNum = Integer.parseInt(input.nextLine()); // Number the user entered for the dice.
        System.out.println("Would you like to roll the dice?  [ yes | no ]" );
        String userRollDiceAnswer = input.nextLine();
//        Checking if the user would like to roll the dice
        if (userRollDiceAnswer.equalsIgnoreCase("no")){
            System.out.println("Have a great day!");
        }else{
            try{
                Thread.sleep(1500);
                // Then do something meaningful...
                System.out.println("Rolling the dice...");
                System.out.println("...");
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            try{
                Thread.sleep(3500);
                // Then do something meaningful...
                System.out.println("Rolling the dice...");
                System.out.println("...");
            }catch(InterruptedException e){
                e.printStackTrace();
            }

//

            try{
                Thread.sleep(3500);
                // Then do something meaningful...
                System.out.println("");
                int diceOneNum = (int) (Math.random() * userNum) + 1;
                int diceTwoNum = (int) (Math.random() * userNum) + 1;
                System.out.println("Dice one is: " + diceOneNum);
                System.out.println("Dice two is: " + diceTwoNum);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

//        Ask user if they would like to play again?
        System.out.println("Would you like to roll the dice again?");
        String rollAgainAnswer = input.nextLine();
        if(rollAgainAnswer.equalsIgnoreCase("no")){
            System.out.println("No problem! Have a wonderful day!");
        }else{
//            Run method again if player says they want to play again.
            rollDice();
        }

    }



} // End of Methods Exercises class