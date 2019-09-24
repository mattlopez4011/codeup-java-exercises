import java.text.DateFormatSymbols;
import java.util.Scanner;

public class JavaStringsBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //===============Bonuses
//        BONUS 1
//        Create date format converter application.
//        System.out.println("Enter a date: MM/DD/YYY");
//        String userInput = input.nextLine();
//        String [] arrOfDate = userInput.split("/", 3);
//        String month = arrOfDate[0];
//        String day = arrOfDate[1];
//        String year = arrOfDate[2];
//
//        int monthNum = Integer.parseInt(month);
//        String monthString = new DateFormatSymbols().getMonths()[monthNum -1];
//
//        System.out.printf("%s %s, %s", monthString, day, year);


//        ----BONUS 2
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//        Example:
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants

        System.out.print("Input a sentence: ");
        String str = input.nextLine();

//        Search for vowels
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
//        return count;
//        System.out.print("Number of  Vowels in the string: " + count_Vowels(count)+"\n");
        System.out.printf("Number of vowels in the string:  %s", count);






    } // End of main
}




