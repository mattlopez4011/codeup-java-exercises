package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
//    protected properties for length and width.
    protected int length; // Access within the class and sub-class
    protected int width; // Access within the class and sub-class

//Constructor
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

//    Methods

    public int getLength(){
        return this.length;
    }

    public abstract void setLength(int length); // Declared, but not defined



    public int getWidth(){
        return this.width;
    }

    public abstract void setWidth(int width); // Declared, but not defined

}
