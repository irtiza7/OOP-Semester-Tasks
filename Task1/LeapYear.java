import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int year;
        boolean exit = true;
        
        while(exit){
            
            System.out.println("Enter a Year or Enter 0 to Exit: ");
            year = input.nextInt();

            if(year < 500 && year != 0){
                continue;
            }

            if (year == 0){
                break;
            }

            isLeapYear(year);
        }
        System.out.println("Program Terminating");
    }
    
    public static void isLeapYear(int year){

        if((year%4) == 0){
            if((year%100) == 0){
                if((year%400) == 0){
                    System.out.println(year+" is a Leap year");
                }else{
                    System.out.println(year+" is not a Leap year");
                }
            }else if ((year%4) == 0){
                System.out.println(year+" is a Leap year");
            }else{
                System.out.println(year+" is not a Leap year");
            }
        }else{
            System.out.println(year+" is not a Leap year");
        }
    }
}
