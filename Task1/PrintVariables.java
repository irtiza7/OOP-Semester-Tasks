import java.util.Scanner;

public class PrintVariables{
    public static void main(String args[]){
        byte n1 = 1;
        short n2 = 2;
        int n3 = 3;
        float n4 = 4.0F;
        long n5 = 5L;
        double n6 = 6.0;
        boolean b = true;

        System.out.println("Unchanged Values: ");
        System.out.printf("Byte: %d\n", n1);
        System.out.printf("Short: %d\n", n2);
        System.out.printf("Int: %d\n", n3);
        System.out.printf("Float: %.2f\n", n4);
        System.out.printf("Long: %d\n", n5);
        System.out.printf("Double: %.2f\n", n6);
        System.out.printf("Boolean: %b\n", b);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value for Byte: ");
        n1 = input.nextByte();
        System.out.print("Enter Value for Short: ");
        n2 = input.nextShort();
        System.out.print("Enter Value for Int: ");
        n3 = input.nextInt();
        System.out.print("Enter Value for Float: ");
        n4 = input.nextFloat();
        System.out.print("Enter Value for Long: ");
        n5 = input.nextLong();
        System.out.print("Enter Value for Double: ");
        n6 = input.nextDouble();
        System.out.print("Enter Value for Boolean: ");
        b =  input.nextBoolean();

        System.out.println("Changed Values: ");
        System.out.printf("Byte: %d\n", n1);
        System.out.printf("Short: %d\n", n2);
        System.out.printf("Int: %d\n", n3);
        System.out.printf("Float: %.2f\n", n4);
        System.out.printf("Long: %d\n", n5);
        System.out.printf("Double: %.2f\n", n6);
        System.out.printf("Boolean: %b\n", b);        
    }
}