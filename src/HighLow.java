import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random( )* 100) + 1; // Random Number between 1-100

        System.out.println("");
        String test = "on";
        int counter = 0;

        boolean loop = true;
        do {
            counter++; // Counts how many times user guessed the number.
            System.out.println("Guess the magic number...");
            System.out.println("=========================");
            String userResponse = input.nextLine();
            if (isNumber(userResponse)){
                int userNum = Integer.parseInt(userResponse); // User number
//                System.out.println("You entered a number :)");
                if(userNum < randomNum){
                    System.out.println("HIGHER! Enter a higher number :)");
                    System.out.println("");

                }else if(userNum > randomNum){
                    System.out.println("LOWER! Enter a lower number :)");
                    System.out.println("");

                }else{
                    System.out.println("GOOD GUESS! You guessed the magic number " + randomNum);
                    System.out.println("");
                    System.out.println("You guessed " + counter + " times!");
                    loop = false;
                }

            }else{
                System.out.println("Invalid input! Please enter a number value.");

            }

        }while (loop);// End of do loop

    }

// Method checks if the input is a number
    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i)) == false){
                return false;
            }
        }

        return true;
    }
} // End of HighLow method

//    You are going to build a high-low guessing game.
//The specs for the game are:
//
//        Game picks a random number between 1 and 100. √
//        Prompts user to guess the number.√
//        All user inputs are validated.√
//        If user's guess is less than the number, it outputs "HIGHER".√
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.