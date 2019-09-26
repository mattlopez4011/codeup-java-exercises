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
    public String getTitleName(){

        return this.titleName;
    }
    // changes the name property to the passed value
    public void setTitleName(String title){

        this.titleName = title;
    }

    public String getCategory(){

        return this.category;
    }

    // changes the name property to the passed value
    public void setCategory(String category){

        this.category = category;
    }



}
