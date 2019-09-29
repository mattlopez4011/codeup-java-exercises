package shapes;
import Sandbox.Addition;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input(); // Pulling scanner from package

do {
    System.out.println("Hi!! Start of code---");
//        double radius = input.getDouble();
        Circle circleObj = new Circle(input.getDouble("Give me a decimal number for your circle: ")) ;
        System.out.println("getArea = " + circleObj.getArea());
        System.out.println("getCircumference = " + circleObj.getCircumference());
//        circleObj.setCircleCount(1); // Add 1 to counter
    System.out.println("You created " + circleObj.getCircleCount() + " circles.");
    System.out.println("Would you like to create a new circle?");
}while (input.yesNo());


    } // End main
}


//Bonus
//
//        After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.
//
//        Before exiting, the program should output the total number of circles created. Use a private static property, along with a public static method to keep track of and display the total number of circles created.