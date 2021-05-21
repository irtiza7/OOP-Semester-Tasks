import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Lenght of Array? ");
        int len = input.nextInt();
        int[] num = new int[len];

        if(num.length != 0){
            for (int i = 0; i < num.length; i++) {
                System.out.printf("Enter Number for Index # %d? ", i);
                num[i] = input.nextInt();
            }

            for(int e: num){
                System.out.println(e);
            }

            findMin(num);
            findMax(num);
            average(num);
        }

    }
    public static void findMin(int[] temp){
        int min = temp[0];
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if(min>temp[i]){
                min = temp[i];
                index = i;
            }
        }

        System.out.printf("Index[%d] has Minimum Number: %d\n", index, min);
    }
    public static void findMax(int[] temp){
        int max = temp[0];
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if(max<temp[i]){
                max = temp[i];
                index = i;
            }
        }

        System.out.printf("Index[%d] has Maximum Number: %d\n", index, max);
    }
    public static void average(int[] temp){
        double avg = 0;
        double sum = 0;

        for(int element: temp){
            sum += element;
        }

        avg = sum/temp.length;
        System.out.printf("Average: %.2f", avg);
    }
}