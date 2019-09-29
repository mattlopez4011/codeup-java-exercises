package util;
import java.util.Scanner;

public class Input {
//    private property named scanner
//    Instance
    private Scanner scanner;

    //    Constructor
    public Input(){
        this.scanner = new Scanner(System.in); // init new scanner variable
    }


    //  Method
    public String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        if (prompt.isEmpty()){
            System.out.println("Enter something:");
        }else {
            System.out.println(prompt);
        }

        return getString(); //returns the scanner.nextLine()
    }

    public boolean yesNo(){
        System.out.println("[ y / n ]");
        String checked = this.scanner.nextLine();
        return (checked.equalsIgnoreCase("y") | checked.equalsIgnoreCase("yes"));

    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        if(scanner.hasNextInt()){
            int userNum = Integer.parseInt(this.scanner.nextLine());
            if (userNum >= min && userNum <= max ){
                return userNum; // if user num is within the range, return user num
            }else {
                System.out.println("INCORRECT! Please enter a number between " + min + " and " + max);
                return getInt(min,max); // if user num is incorrect, run method again.
            }

        }else {
            System.out.println("Invalid input!"); // If the user does not enter a number.
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min,max);
        }
    }

    public int getInt(){
        System.out.println("Give me a number: ");
        return Integer.parseInt(this.scanner.nextLine());
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        if(scanner.hasNextInt()){
           double userNum = Double.parseDouble(scanner.nextLine());
            if (userNum >= min && userNum <= max ){
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

    public double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(this.scanner.nextLine());

    }

//    public static void main(String[] args) {
//        Input.getString();
//    }


}
