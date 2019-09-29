package shapes;

public class Circle {
    private double radius; // radius property
    private static int circleCount = 0; // static circleCount property or
//    Constructor
    public Circle(double radius){
        this.radius = radius;
        circleCount++; // Add 1 to circleCount every time a circle is created.
    }

    // Methods
    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;

    }

    public int getCircleCount(){
        return circleCount;
    }

}
