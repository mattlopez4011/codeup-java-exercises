package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    Constructor


    public Rectangle(int length, int width) {
        super(length, width);
    }



    //    Methods
    @Override
    public void setLength(int length) {
        this.length = length;

    }

    @Override
    public void setWidth(int width) {
        this.width = width;

    }

    @Override
    public int getPerimeter() {
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    public int getArea() {
        int area = length * width;
        return area;
    }


//    protected int length;
//    protected int width;
//
////    Constructor
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//
//    }
//
////    Methods
//    public int getArea(){
//
//         int area = length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }



}



