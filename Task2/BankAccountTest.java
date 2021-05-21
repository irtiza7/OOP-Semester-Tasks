import java.util.Scanner;

public class BankAccountTest{
    public static void main(String args[]){
        
        BankAccount acc = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();
        acc.name = name;

        System.out.print("Enter Balance: ");
        double bal = input.nextDouble();
        acc.balance = bal;

        boolean state = true;
        int choice, c;

        while(state != false){

            System.out.println();
            System.out.print("Press 1: To Deposit an amount\nPress 2: To Withdraw an amount\nPress 3: To View the current balance\nPress 4: To Close this program\n");
            choice = input.nextInt();

            switch(choice){
                case 1: 
                    System.out.print("Enter Amount to Deposit: ");
                    bal = input.nextDouble();
                    acc.deposit(bal);
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    bal = input.nextDouble();

                    if(((acc.balance - bal) < 50000) && (acc.balance >= 50000)){
                        System.out.println("Your Sure ?");
                        System.out.println("Enter 1 to Continue\nEnter 0 to Abort");
                        c = input.nextInt();

                        if(c == 1){
                            acc.withdraw(bal);
                        }else{
                            break;
                        }

                    }else{
                        acc.withdraw(bal);
                    }

                    break;
                case 3:
                    System.out.printf("Current Balance: %.2f\n", acc.balance);
                    break;
                case 4:
                    System.out.println("Program Terminating...");
                    System.out.printf("[Account Title] - %s\n", acc.name);
                    System.out.printf("[Total Deposits] - %d\n", acc.deposits);
                    System.out.printf("[Total Withdraws] - %d\n", acc.withdraws);
                    System.out.printf("[Balance] - %.2f\n", acc.balance);
                    state = false;
                    break;
                default:
                    System.out.println("Invalid Number Entered");
            }

        }

    }
}