public class CommissionEmployee extends Employee{
    private int commissionRate;
    private int sales;

    public CommissionEmployee(String firstName, String lastName, String CNIC){
        super(firstName, lastName, CNIC);
    }

    @Override
    public String toString(){
        return super.toString();
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
}
