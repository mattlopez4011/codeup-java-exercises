package shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side,side); // Sets the width and the length

    }

    @Override
    public void setLength(int length) {
        super.length = length;
        super.width = length;

    }

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.length = width;

    }

    @Override
    public int getPerimeter() {
        return  4 * super.width;

    }

    @Override
    public int getArea() {
        return super.width * super.length;
    }
//    private int side;
//
////    Constructor
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//
//    }
//
////    Methods
//    public int getArea(){
//        int area = side * side ;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 4 * side;
//        return perimeter;
//
//    }

}


