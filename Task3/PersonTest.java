import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonTest {
    public static void main (String args[]){
        
        // Scanner input = new Scanner(System.in);
        // String dobIN, nameIN;
        // int ageIN;

        // System.out.print("Enter Name > ");
        // nameIN = input.nextLine();
        // System.out.print("Enter Date of Birth (as YYYY-MM-DD) (Enter Null in case you dont remember) > ");
        // dobIN = input.nextLine();
        // System.out.print("Enter Age (Enter Null in case you dont remember) > ");
        // ageIN = input.nextInt();
        
        // if(dobIN != null){
        //     LocalDate dateOfBirth =  getDateOfBirth(dobIN);
        //     Person p = new Person(nameIN, dateOfBirth);
        // }else{
        //     Person p = new Person(nameIN, ageIN);
        // }
        String name = "irtiza";
        int age = 23;
        String dateOfBirth = "2021-03-03";
        LocalDate dob = getDateOfBirth(dateOfBirth);

        System.out.print("\nCase: Name and Age\n");
        Person p1 = new Person(name, age);
        p1.showInfo();

        System.out.print("\nCase: Name and DOB\n");
        Person p2 = new Person(name, dob);
        p2.showInfo();

    }

    public static LocalDate getDateOfBirth(String d){
        LocalDate temp = LocalDate.parse(d);
        return temp;
    }
    
}
