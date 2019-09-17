import java.util.Arrays;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Loop Basics
//        Do While

//        int i = 5;
//        while(i <= 15){
//            System.out.format("%d ", i );
//            i++;
//
//        }
        int i = 2;
        do {
            System.out.println(i);
            i *= Math.pow(i, 1);
        }
        while (i <= 1000000);




    }
}
