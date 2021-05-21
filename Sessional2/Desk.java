public class Desk extends Furniture{

    public Desk(int quality){
      setQuality(quality);
    }

    public void setQuality(int quality){
        if (quality == 1){
            this.quality = FurnitureQuality.WOODEN;
        }else if(quality == 2){
            this.quality = FurnitureQuality.IRON;
        }else if (quality == 3){
            this.quality = FurnitureQuality.PLASTIC;
        }else{
            System.out.println("Invalid Quality");
        }
    }

    public FurnitureQuality getQuality(){
        return this.quality;
    }
}
