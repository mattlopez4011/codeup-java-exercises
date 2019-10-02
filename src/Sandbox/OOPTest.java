package Sandbox;

import java.util.ArrayList;
import java.util.Scanner;

public class OOPTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        OOPPractice steve = new OOPPractice("Steve", "James", "Big Steve", "Green", 25);

        System.out.println(steve.getAll()); // Steve James Big Steve Green 25

        createNewPerson();



    }

    public static void createNewPerson(){
        ArrayList<OOPPractice> PersonArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Array currently contains: " + PersonArrayList.toString() ); // Array starts with

        System.out.println("What is your first name?");
        String userFirstName = input.nextLine();
        System.out.println("What is your last name?");
        String userLastName = input.nextLine();
        System.out.println("What is your nickname?");
        String userNickName = input.nextLine();
        System.out.println("What is your favorite color?");
        String userFavColor = input.nextLine();
        System.out.println("How old are you?");
        int userAge = Integer.parseInt(input.nextLine());

        OOPPractice newPerson = new OOPPractice(userFirstName, userLastName,userNickName, userFavColor, userAge);
        PersonArrayList.add(newPerson);

        System.out.println("Array contains: " + PersonArrayList.toString() );
    }

}
