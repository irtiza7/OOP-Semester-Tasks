public class HourlyEmployee extends Employee{
    private double hours;
    private double wage; // wage per hour

    public HourlyEmployee(String firstName,
                          String lastName,
                          String CNIC,
                          double hours,
                          double wage){
        super(firstName, lastName, CNIC);
        setHours(hours);
        setWage(wage);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public double getEarnings(){
        return wage*hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (168 >= hours && hours >= 0){
            this.hours = hours;
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0){
            this.wage = wage;
        }
    }
}
