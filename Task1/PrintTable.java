import java.util.Scanner;

public class PrintTable {
    public static void main(String args[]){
        int table, start, end;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Number: ");
        table = input.nextInt();
        System.out.println("Enter Start: ");
        start = input.nextInt();
        System.out.println("Enter End: ");
        end = input.nextInt();

        for(int i = start; i <= end; i++){
            System.out.printf("%d * %d = %d\n", table, i, (table*i));
        }
    }
    
}
