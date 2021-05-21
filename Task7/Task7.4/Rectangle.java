public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(){}
    public Rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        double area;
        area = this.length*this.width;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter;
        perimeter = 2*(this.length+this.width);
        return perimeter;
    }
}
