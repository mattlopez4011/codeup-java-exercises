package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4); // Instance
//        Rectangle box2 = new Square(5);
        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(5,4);

//        System.out.println(box1.getPerimeter()); // 18
//        System.out.println(box1.getArea()); // 20
//        System.out.println("");
//        System.out.println(box2.getPerimeter()); // 20
//        System.out.println(box2.getArea()); // 25

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(myShape2.getArea());
    }
}
