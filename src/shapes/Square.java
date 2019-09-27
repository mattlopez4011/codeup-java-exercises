package shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side,side);

    }

    @Override
    public void setLength(int length) {
        super.length = length;

    }

    @Override
    public void setWidth(int width) {
        this.width = width;

    }

    @Override
    public int getPerimeter() {
        return  4 * super.length;

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


