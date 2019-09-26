package movies;

public class Movie {
    private String name;
    private String category;

//===========Constructor
    public  Movie(String title, String category){
        this.name = title;
        this.category = category;

    }

    //========= Methods
    // returns the person's name
    public String getTitleName(){

        return this.name;
    }
    // changes the name property to the passed value
    public void setTitleName(String title){

        this.name = title;
    }

    public String getCategory(){

        return this.category;
    }

    // changes the name property to the passed value
    public void setCategory(String category){

        this.category = category;
    }



}
