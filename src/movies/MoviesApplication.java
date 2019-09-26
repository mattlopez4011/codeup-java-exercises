package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
//    static String [] movieArray = new MoviesArray.findAll();

    public static void main(String[] args) {
        Input input = new Input(); // Pulling scanner from package
//        MoviesArray allMovies = new MoviesArray();
        Movie[] moviesArray = MoviesArray.findAll();
//        moviesArray.getMovie()

//        System.out.println(Arrays.toString(moviesArray));



        boolean loop = true;
        do {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice: ");

            int userNum = input.getInt();



        switch (userNum) {
            case 0:
                System.out.println("Goodbye!");
                loop = false;
                break;
            case 1:
//                All Movies
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getTitleName() + "--" + movie.getCategory());
                }
                break;
            case 2:
//                animated category
                for (Movie movie : moviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getTitleName());
                    }
                }
                break;
            case 3:
//                drama category
                for (Movie movie : moviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getTitleName());
                    }
                }
                break;
            case 4:
//                horror category
                for (Movie movie : moviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getTitleName());
                    }
                }
                break;
            case 5:
//                scifi category
                for (Movie movie : moviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getTitleName());
                    }
                }
                break;
            }
        }
        while (loop);



    }
}


