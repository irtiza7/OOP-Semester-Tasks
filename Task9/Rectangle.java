public class Rectangle extends  Shape{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width){
        setColor(color);
        setLength(length);
        setWidth(width);
    }

    public double calculateArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
