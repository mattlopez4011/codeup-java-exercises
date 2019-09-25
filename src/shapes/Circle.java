package shapes;

public class Circle {
    private double radius; // radius property
//    Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Methods
    public double getArea(){

        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;

    }
}
