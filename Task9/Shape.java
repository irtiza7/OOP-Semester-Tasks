public abstract class Shape {

    private String color;

    abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
