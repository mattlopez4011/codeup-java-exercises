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
//        System.out.println("Give me a number: ");
//        return Integer.parseInt(this.scanner.nextLine());

        try{

            return Integer.valueOf(getString("Enter a number: "));
        } catch(NumberFormatException e){
            System.out.println("Uh, oh! Something went wrong!" + e.getMessage());
            System.out.println("More detail below:");
            e.printStackTrace();
            return getInt();

        }

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
//        return Double.parseDouble(this.scanner.nextLine());
//        return Double.valueOf(this.scanner.nextLine());

        try{
            return Double.valueOf(getString());
        } catch(Exception e){
            System.out.println("Uh, oh! Something went wrong!" + e.getMessage());
            System.out.println("More detail below:");
            e.printStackTrace();
            return getDouble(prompt);

        }


    }

    public int getBinary(){
        int number=0;

        try{
            number = Integer.valueOf(getString("Enter a binary number: "), 2);
        } catch(Exception e){
            System.out.println("Uh, oh! Something went wrong!" + e.getMessage());
            System.out.println("More detail below:");
            e.printStackTrace();

        }
        System.out.print("Your number is ");
        return  number;
    }

    public int getHex(){
        int number=0;

        try{
            number = Integer.valueOf(getString("Enter a hexidecimal number: "), 16);
        } catch(Exception e){
            System.out.println("Uh, oh! Something went wrong!" + e.getMessage());
            System.out.println("More detail below:");
            e.printStackTrace();

        }
        System.out.print("Your number is ");
        return  number;
    }




//    public static void main(String[] args) {
//        Input.getString();
//    }


}
