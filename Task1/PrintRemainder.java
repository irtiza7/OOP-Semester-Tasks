import java.util.Scanner;

public class PrintRemainder {
    public static void main(String args[]){
        double first, second;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Fisrt Number: ");
        first = input.nextDouble();
        System.out.println("Enter Second Number: ");
        second = input.nextDouble();

        System.out.printf("Remainder of %.2f/%.2f: %.2f\n", first, second, (first%second));
        
        if((first%second) == 0){
            System.out.printf("%.2f is divisible by %.2f\n", first, second);
        }else{
            System.out.printf("%.2f is not divisible by %.2f\n", first, second);
        }
        }
    }
