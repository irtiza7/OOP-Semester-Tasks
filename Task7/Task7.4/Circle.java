public class Circle extends Shape {
    private double radius;

    public Circle(){}
    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area;
        area = 3.14*(this.radius*this.radius);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter;
        perimeter = 2*3.14*this.radius;
        return perimeter;
    }
}
