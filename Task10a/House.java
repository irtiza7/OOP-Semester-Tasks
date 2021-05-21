public class House implements CarbonFootPrintProducer{
    public double coveredArea;

    public House(double coveredArea){
        this.coveredArea = coveredArea;
    }

    public double getCarbonFootPrint(){
        return coveredArea * 0.005;
    }
}
