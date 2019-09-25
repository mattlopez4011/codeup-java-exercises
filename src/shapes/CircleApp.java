package shapes;
import Sandbox.Addition;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input(); // Pulling scanner from package

//        for the radius of the circle
        System.out.println("What is the radius of the circle");

        double userRadius = input.getDouble(); // User is asked to pick a number
        System.out.println("User radius number: " + userRadius);

        Circle CircleObj = new Circle(userRadius) ;
//        Circle userCircle = new Circle(userRadius);
        System.out.println("Area: " + CircleObj.getArea()); // Calls getArea method
        System.out.println("Circumference: " + CircleObj.getCircumference());

//        System.out.println(input.getString());
//        Addition addObj = new Addition();
        System.out.println(input.getString());
        System.out.println(input.getInt());


    } // End main
}