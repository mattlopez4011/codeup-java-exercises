package movies;

public class Movie {
    private String titleName;
    private String category;

//===========Constructor
    public  Movie(String title, String category){
        this.titleName = title;
        this.category = category;

    }

    //========= Methods
    // returns the person's name
    public String getMovie(){

        return this.titleName + this.category;
    }
    // changes the name property to the passed value
    public void setMovie(String title, String category){

        this.titleName = title;
        this.category = category;
    }




}
