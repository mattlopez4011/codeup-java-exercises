import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        The value of pi is approximately 3.14.
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

//===============Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.println("How old are you?");
//        byte age = input.nextByte();

//        System.out.format("My age is: %s", age);

//===============Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("What is your favorite color?");
//        String favColor = input.nextLine();
//        System.out.println("What is your favorite search engine?");
//        String favSearch = input.nextLine();
//        System.out.println("What is your favorite number?");
//        byte favNumber = input.nextByte();
////
//        System.out.printf("Favorite color: %s%nFavorite search engine: %s%nFavorite Number: %s%n", favColor,favSearch,favNumber); // Preferred way (%n makes new line)
//        System.out.println(favColor);
//        System.out.println(favSearch);
//        System.out.println(favNumber);

//===============Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//          System.out.println("Enter a sentence: ");
//          String userInput = input.nextLine();
//          System.out.format("You entered: %s",userInput);

//================Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.println("What is the length of the classroom?");
        String length = input.nextLine();
        System.out.println("What is the width of the classroom?");
        String width = input.nextLine();

        double lengthNum = Double.valueOf(length);
        double widthNum = Double.parseDouble(width);

        System.out.println(lengthNum + " " + widthNum);


//=================Display the area and perimeter of that classroom.
//                 The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        double areaVal = lengthNum * widthNum;
        System.out.format("The area is: %s ", areaVal);
        double perimeterVal = lengthNum * 2 + widthNum * 2;
        System.out.format("\nThe perimeter is: %s", perimeterVal);
//        double perimeterDouble = (int) perimeterVal;



    }
}


