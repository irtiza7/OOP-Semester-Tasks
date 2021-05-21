public class Employee {
    private String firstName;
    private String lastName;
    final private String CNIC;

    public Employee(String firstName, String lastName, String CNIC){
        setFirstName(firstName);
        setLastName(lastName);
        this.CNIC = CNIC;
    }

    @Override
    public String toString(){
        return "First Name: "+getFirstName()+" Last Name: "+getLastName()+" CNIC: "+getCNIC();
    }

    protected void setFirstName(String firstName){
        this.firstName = firstName;
    }
    protected void setLastName(String lastName){
        this.lastName = lastName;
    }

    protected String getFirstName(){
        return this.firstName;
    }
    protected String getLastName(){
        return this.lastName;
    }
    protected String getCNIC(){
        return this.CNIC;
    }
}
