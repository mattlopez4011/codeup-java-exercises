package shapes;

public class Circle {
    private double radius; // radius property
//    Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Methods
    public double getArea(){

        return Math.PI * (radius * radius);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;

    }
}
