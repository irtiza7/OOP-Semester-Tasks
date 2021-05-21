public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius){
        setColor(color);
        setRadius(radius);
    }

    public double calculateArea(){
        return 3.14*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
