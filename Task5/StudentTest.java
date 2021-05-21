import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){
        
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter Name? ");
        String name = input.nextLine();
        System.out.print("Enter CNIC? ");
        String cnic = input.nextLine();
        
        System.out.print("Enter Street Address? ");
        String streetAddress = input.nextLine();
        System.out.print("Enter Town? ");
        String town = input.nextLine();
        System.out.print("Enter City? ");
        String city = input.nextLine();
        System.out.print("Enter Country? ");
        String country = input.nextLine();

        System.out.print("Enter Country Code? ");
        int countryCode = input.nextInt();
        System.out.print("Enter City Code? ");
        int cityCode = input.nextInt();
        System.out.print("Enter Line Number? ");
        int lineNumber = input.nextInt();

        Address addr = new Address();
        PhoneNumber phnbr = new PhoneNumber();

        phnbr.setCountryCode(countryCode);
        phnbr.setCityCode(cityCode);
        phnbr.setLineNumber(lineNumber);
        
        addr.setStreetAddress(streetAddress);
        addr.setTown(town);
        addr.setCity(city);
        addr.setCounrty(country);
        addr.setPhoneNumber(phnbr);

        Student student1 = new Student(name, cnic, addr);
        
        System.out.print("Enter Email? ");
        input.nextLine();
        String email = input.nextLine();
        
        System.out.print("Enter Details for Course 1:");
        System.out.println();
        System.out.print("Enter Course Code? ");
        String courseCode1 = input.nextLine();
        System.out.print("Enter Course Title? ");
        String courseTitle1 = input.nextLine();
        
        Course course1 = new Course();
        course1.setCourseCode(courseCode1);
        course1.setCourseTitle(courseTitle1);

        System.out.print("Enter Details for Course 2:");
        System.out.println();
        System.out.print("Enter Course Code? ");
        String courseCode2 = input.nextLine();
        System.out.print("Enter Course Title? ");
        String courseTitle2 = input.nextLine();
        
        Course course2 = new Course();
        course2.setCourseCode(courseCode2);
        course2.setCourseTitle(courseTitle2);

        student1.setEmail(email);
        student1.setCourse1(course1);
        student1.setCourse2(course2);

        System.out.println(student1.getName());
        System.out.println(student1.getCnic());
        System.out.println(student1.getEmail());
        System.out.println(student1.getCourse1Code());
        System.out.println(student1.getCourse1Title());
        System.out.println(student1.getCourse2Code());
        System.out.println(student1.getCourse2Title());
        student1.getAddress();

        System.out.print("Enter Name? ");
        name = input.nextLine();
        System.out.print("Enter CNIC? ");
        cnic = input.nextLine();

        Student student2 = new Student(name, cnic, addr);

        System.out.println(student1.getName());
        System.out.println(student1.getCnic());
        System.out.println(student1.getEmail());
        System.out.println(student1.getCourse1Code());
        System.out.println(student1.getCourse1Title());
        System.out.println(student1.getCourse2Code());
        System.out.println(student1.getCourse2Title());
        student1.getAddress();
    }    
}
