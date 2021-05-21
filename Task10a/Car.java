public class Car implements CarbonFootPrintProducer{
    public double milesDriven;

    public Car(double milesDriven){
        this.milesDriven = milesDriven;
    }

    public double getCarbonFootPrint(){
        return milesDriven *  0.0000292;
    }

}
