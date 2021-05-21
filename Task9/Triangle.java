public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle (String color, double base, double height){
        setColor(color);
        setBase(base);
        setHeight(height);
    }

    public double calculateArea(){
        return 0.5*base*height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
