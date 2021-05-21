import java.util.Scanner;

public class TestCircle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area of Circle with Radius "+circle.getRadius()+": "+circle.calculateArea());
        System.out.println("Perimeter of Circle with Radius "+circle.getRadius()+": "+circle.calculatePerimeter());

    }
}
