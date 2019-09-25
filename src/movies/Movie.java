package movies;

public class Movie {
    private String name;
    private String category;

//    Constructor
    public  Movie(String name, String category){
        this.name = name;
        this.category = category;

    }

    public static void main(String[] args) {
        System.out.println(createMovie("Harry Potter ", "Thriller"));
    }



}
