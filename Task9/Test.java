import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Shapes you want to create> ");
        int count = input.nextInt();

        ArrayList<Shape> shapes = new ArrayList<Shape>(count);

        int type;
        String color;

        for (int i = 0; i < count; i++){
            System.out.println("Press 1, to create Circle\n" + "Press 2, to create Rectangle\n" + "Press 3 to create Triangle\n" + "Press 4 to create Square");
            System.out.println("Chose shape # "+(i+1)+"> ");
            type = input.nextInt();

            switch(type){
                case 1:
                    System.out.println("Enter Radius> ");
                    double radius = input.nextDouble();

                    input.nextLine();
                    System.out.println("Enter Color> ");
                    color = input.nextLine();

                    Shape circle = new Circle(color, radius);
                    shapes.add(circle);
                    break;

                case 2:
                    System.out.println("Enter Length> ");
                    double length = input.nextDouble();

                    System.out.println("Enter Width> ");
                    double width = input.nextDouble();

                    input.nextLine();
                    System.out.println("Enter Color> ");
                    color = input.nextLine();

                    Shape rectangle = new Rectangle(color, length, width);
                    shapes.add(rectangle);
                    break;

                case 3:
                    System.out.println("Enter Base> ");
                    double base = input.nextDouble();

                    System.out.println("Enter Height> ");
                    double height = input.nextDouble();

                    input.nextLine();
                    System.out.println("Enter Color> ");
                    color = input.nextLine();

                    Shape triangle = new Triangle(color, base, height);
                    shapes.add(triangle);
                    break;

                case 4:
                    System.out.println("Enter Side Length> ");
                    double side = input.nextDouble();

                    input.nextLine();
                    System.out.println("Enter Color> ");
                    color = input.nextLine();

                    Shape square = new Square(color, side);
                    shapes.add(square);
                    break;
            }
        }

        printData(shapes);

    }

    public static void printData(ArrayList<Shape> shapes){

        int circleCount,rectangleCount, triangleCount, squareCount;
        circleCount = rectangleCount = triangleCount = squareCount = 0;


        double sumOfAreaOfCircle, sumOfAreaOfRectangle, sumOfAreaOfTriangle, sumOfAreaOfSquare;
        sumOfAreaOfCircle = sumOfAreaOfRectangle = sumOfAreaOfTriangle = sumOfAreaOfSquare = 0;


        double circlePaintingCost, rectanglePaintingCost, trianglePaintingCost, squarePaintingCost;
        circlePaintingCost = rectanglePaintingCost = trianglePaintingCost = squarePaintingCost = 0;


        Painter painter = new Painter();

        for(Shape shape: shapes){

            if(shape instanceof Circle){

                sumOfAreaOfCircle += shape.calculateArea();
                circlePaintingCost += painter.calculatePaintingCost(shape);
                circleCount++;

            }else if(shape instanceof Rectangle){

                sumOfAreaOfRectangle += shape.calculateArea();
                rectanglePaintingCost += painter.calculatePaintingCost(shape);
                rectangleCount++;

            }else if (shape instanceof Triangle){

                sumOfAreaOfTriangle += shape.calculateArea();
                trianglePaintingCost += painter.calculatePaintingCost(shape);
                triangleCount++;

            }else if (shape instanceof Square){

                sumOfAreaOfSquare += shape.calculateArea();
                squarePaintingCost += painter.calculatePaintingCost(shape);
                squareCount++;
            }
        }

        System.out.println("Total Circles: " + circleCount + " Total Area of all Circles: " + sumOfAreaOfCircle + " Painting Cost: " + circlePaintingCost);
        System.out.println("Total Rectangles: "+rectangleCount + " Total Area of all Rectangles: " + sumOfAreaOfRectangle + " Painting Cost: " + rectanglePaintingCost);
        System.out.println("Total Triangles: "+triangleCount + " Total Area of all Triangles: " + sumOfAreaOfTriangle + " Painting Cost: " + trianglePaintingCost);
        System.out.println("Total Squares: "+squareCount + " Total Area of all Squares: " + sumOfAreaOfSquare + " Painting Cost: " + squarePaintingCost);

        System.out.println("Total Painting Cost: " + (circlePaintingCost+rectanglePaintingCost+trianglePaintingCost+squarePaintingCost));
    }
}
