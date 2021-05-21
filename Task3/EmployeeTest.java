import java.util.Scanner;

public class EmployeeTest {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        String cnic, name;
        double salary;
        
        System.out.println("Enter CNIC > ");
        cnic = input.nextLine();
        System.out.println("Enter Name > ");
        name = input.nextLine();
        System.out.println("Enter Salary > ");
        salary = input.nextDouble();

        Employee e1 = new Employee();
        Employee e2 = new Employee(cnic, name);
        Employee e3 = new Employee(cnic, name, salary);
    }    
}
