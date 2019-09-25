package Sandbox;

public class AllPlanets {
    public static void main (String [] args){
        Planet Earth = new Planet (200); // Best way to create object
//        Earth.size = 25000; // Not efficient way to create object
        Earth.displaySize(); // Calls display size method from Planets Class

    }
}
