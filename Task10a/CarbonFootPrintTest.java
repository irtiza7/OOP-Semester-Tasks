import java.util.ArrayList;
import java.util.Scanner;

public class CarbonFootPrintTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Miles Driven by Car> ");
        double milesDriven = input.nextDouble();

        System.out.println("Enter Covered Area of House> ");
        double coveredArea = input.nextDouble();

        House house = new House(coveredArea);
        Car car = new Car(milesDriven);

        ArrayList<CarbonFootPrintProducer> entities = new ArrayList<CarbonFootPrintProducer>(2);
        entities.add(house);
        entities.add(car);

        System.out.println();
        System.out.println("Total Carbon Foot Print is " + calculateTotalFootPrint(entities) + " ton(s) of CO2");
    }

    public static double calculateTotalFootPrint(ArrayList<CarbonFootPrintProducer> entities){
        double totalFootPrintOfCO2 = 0.0;

        for (CarbonFootPrintProducer entry: entities){
            totalFootPrintOfCO2 += entry.getCarbonFootPrint();
        }

        return totalFootPrintOfCO2;
    }
}
