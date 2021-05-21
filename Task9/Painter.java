public class Painter {

    final private static double UNIT_RATE = 10;

    public double calculatePaintingCost(Shape shape){
        return shape.calculateArea() * UNIT_RATE;
    }
}
