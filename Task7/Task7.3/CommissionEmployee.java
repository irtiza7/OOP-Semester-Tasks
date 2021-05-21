public class CommissionEmployee extends Employee{
    private int commissionRate;
    private int sales;
    private double bonus = 0;

    public CommissionEmployee(String firstName, String lastName, String CNIC){
        super(firstName, lastName, CNIC);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public double getEarnings(){
        setBonus();
        return commissionRate*sales + getBonus();
    }


    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus() {
        double commission = commissionRate*sales;

        if (commission > 50000){
            this.bonus = 20000;
        }else if(50000 >= commission && commission >= 20000){
            this.bonus = 10000;
        }else if (20000 >= commission && commission >= 10000){
            this.bonus = 5000;
        }
    }
}
