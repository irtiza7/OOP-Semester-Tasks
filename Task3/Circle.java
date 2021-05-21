public class Circle{
    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }else{
            System.out.println("Invalid Radius Entered");
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double calculateArea(){
        double area = 3.14*(this.radius*this.radius);
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2*(3.14*this.radius);
        return perimeter;
    }
}