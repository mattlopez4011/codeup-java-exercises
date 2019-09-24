package Sandbox;

public class AdditionProgram {
    public static void main(String[] args){
//        Creating new object ⬇️
        Addition addObject = new Addition(5,5);// Takes in two number parameter
//        Below I am calling the new addObject and the getNumber Method to get the object value we assigned it.
        System.out.println("The addition equals to: " + addObject.getNumber() );
    }
}
