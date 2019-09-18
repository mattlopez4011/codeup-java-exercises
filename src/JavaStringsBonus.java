import java.text.DateFormatSymbols;
import java.util.Scanner;

public class JavaStringsBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //===============Bonuses
//        BONUS 1
//        Create date format converter application.
        System.out.println("Enter a date: MM/DD/YYY");
        String userInput = input.nextLine();
        String [] arrOfDate = userInput.split("/", 3);
        String month = arrOfDate[0];
        String day = arrOfDate[1];
        String year = arrOfDate[2];

        int monthNum = Integer.parseInt(month);
        String monthString = new DateFormatSymbols().getMonths()[monthNum -1];

        System.out.printf("%s %s, %s", monthString, day, year);
    }
}
