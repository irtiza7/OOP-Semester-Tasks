public class Square extends Shape{

    private double side;

    public Square(String color, double side){
        setColor(color);
        setSide(side);
    }

    public double calculateArea(){
        return side*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
