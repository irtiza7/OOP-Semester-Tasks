public class BasePlusCommissionEmployee extends CommissionEmployee{
    private int basicSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC){
        super(firstName, lastName, CNIC);
    }

    @Override
    public String toString(){
        return super.toString();
    }


    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
