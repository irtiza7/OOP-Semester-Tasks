public class Employee {
    private String cnic;
    private String name;
    private double salary;

    public Employee(){
        System.out.println("No-Argument Constrcutor Called");
    }
    public Employee(String cnic, String name){
        System.out.println("2-Argument Constructor Called");
        setCnic(cnic);
        setName(name);
    }
    public Employee(String cnic, String name, double salary){
        this(cnic, name);
        System.out.println("3-Argument Constructor Called");
        setSalary(salary);
    }

    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public String getCnic(){
        return this.cnic;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    
}
