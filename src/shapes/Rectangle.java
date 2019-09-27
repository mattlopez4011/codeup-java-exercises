package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    Constructor


    public Rectangle(int length, int width) {
        super(length, width);
    }



    //    Methods
    @Override
    public void setLength(int length) {
        super.length = length;

    }

    @Override
    public void setWidth(int width) {
        super.width = width;

    }

    @Override
    public int getPerimeter() {
        return 2 * super.length + 2 * super.width;

    }

    @Override
    public int getArea() {
        return super.length * super.width;

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



