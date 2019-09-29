public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // System.out.println is used to output information to the console with a newline.
//        System.out.print("Hello, World!"); // System.out.print can be used to output information without a newline.
//        System.out.print("Hello, Ceres!");


        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber); // Prints out 21

        String myString = "a";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++); //Adds 1 post execution
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x); //Adds 1 pre execution
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
//        System.out.println(three);

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        x += 5; // shorthand
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x; // shorthand
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y; // shorthand
        y -= x; // shorthand
        System.out.println(x);
        System.out.println(y);
    }

}
