package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
//    protected properties for length and width.
    protected int length;
    protected int width;

//Constructor
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

//    Methods

    public int getLength(){
        return this.length;
    }

    public abstract void setLength(int length);



    public int getWidth(){
        return this.width;
    }

    public abstract void setWidth(int width);

}
