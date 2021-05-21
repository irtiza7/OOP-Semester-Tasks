import java.util.Scanner;

public class PrintDigits{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-Digit Interger: ");
        int n = input.nextInt();
        int digit;
        
        digit = n/1000;
        n = n%1000;
        System.out.printf("First Digit: %d\n", digit);

        digit = n/100;
        n = n%100;
        System.out.printf("Second Digit: %d\n", digit);

        digit = n/10;
        n = n%10;
        System.out.printf("Third Digit: %d\n", digit);

        digit = n;
        System.out.printf("Fourth Digit: %d\n", digit);
    }
}