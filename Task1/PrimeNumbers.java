import java.util.Scanner;

public class Lecture4{
    public static  void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many Prime Numbers you want to be printed ? ");
        int n = input.nextInt();

        int range = 10000;
        int  t, i, j;
        int max = 0;
        
        System.out.println();
        System.out.printf("%d Prime Numbers: ", n);

        for (i = 2; i <= range; i++){
            t = 0;
            if(i > 1){
                for (j = 1; j <= i; j++){
                    if ((i % j) == 0){
                        t++;
                    }
                }
            }
            if(t == 2){
                System.out.println(i);
                max++;
                if (max == n){
                    break;
                }
            }
            
        }
    }
}