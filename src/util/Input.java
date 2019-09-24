package util;
import java.util.Scanner;

public class Input {
//    private property named scanner
//    Instance
    private Scanner scanner;

    //    Constructor
    public Input(){
        this.scanner = new Scanner(System.in);
    }


    //  Method
    String getString(){
        System.out.println("Enter something:");
        return this.scanner.nextLine();
    }

    boolean yesNo(){
        System.out.println("y / n");

        String checked = scanner.nextLine();

        return (checked.equalsIgnoreCase("y") | checked.equalsIgnoreCase("yes"));

    }

    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        if(scanner.hasNextInt()){
            System.out.println("Valid input!");

            int userNum = Integer.parseInt(scanner.nextLine());
            if (userNum >= min && userNum <= max ){
                System.out.println("Correct!");
                System.out.print("You entered " );
                return userNum;

            }else {
                System.out.println("INCORRECT! Please enter a number between " + min + " and " + max);
                return getInt(min,max);
            }

        }else {
            System.out.println("Invalid input!");
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min,max);
        }
    }

    int getInt(){
        System.out.println("Enter a number between 1 and 10: " );
        if(scanner.hasNextInt()){
            System.out.println("Valid input!");

            int userNum = Integer.parseInt(scanner.nextLine());
            if (userNum >= 1 && userNum <= 10 ){
                System.out.println("Correct!");
                System.out.print("You entered " );
                return userNum;

            }else {
                System.out.println("INCORRECT! Please enter a number between 1 and 10");
                return getInt();
            }

        }else {
            System.out.println("Invalid input!");
            System.out.println("Please enter a number between 1 and 10");
            return getInt();
        }
    }

    double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        if(scanner.hasNextInt()){
            System.out.println("Valid input!");

            int userNum = Integer.parseInt(scanner.nextLine());
            if (userNum >= min && userNum <= max ){
                System.out.println("Correct!");
                System.out.print("You entered " );
                return userNum;

            }else {
                System.out.println("INCORRECT! Please enter a number between " + min + " and " + max);
                return getDouble(min,max);
            }

        }else {
            System.out.println("Invalid input!");
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min,max);
        }
    }

    int getDouble(){
        System.out.println("Enter a number between 1 and 10: " );
        if(scanner.hasNextInt()){
            System.out.println("Valid input!");

            int userNum = Integer.parseInt(scanner.nextLine());
            if (userNum >= 1 && userNum <= 10 ){
                System.out.println("Correct!");
                System.out.print("You entered " );
                return userNum;

            }else {
                System.out.println("INCORRECT! Please enter a number between 1 and 10");
                return getDouble();
            }

        }else {
            System.out.println("Invalid input!");
            System.out.println("Please enter a number between 1 and 10");
            return getDouble();
        }
    }

//    public static void main(String[] args) {
//        Input.getString();
//    }


}
