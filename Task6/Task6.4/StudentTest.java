import java.util.Scanner;

public class StudentTest{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name> ");
        String name = input.nextLine();

        System.out.println("Enter Number of Phone Numbers> ");
        int count = input.nextInt();
        PhoneNumber[] phoneNumber = new PhoneNumber[count];

        for(int i = 0; i < count; i++){
            
            System.out.println("Enter Line Number> ");
            long lineNumber = input.nextLong();

            PhoneNumber phnnbr = new PhoneNumber(lineNumber);
            phoneNumber[i] = phnnbr;
        }

        Student student1 = new Student(name);
        student1.setPhoneNumber(phoneNumber);

        System.out.println(student1.getName());
        PhoneNumber temp[] = student1.getPhoneNumber();
        
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i].lineNumber);
        }
    }
}