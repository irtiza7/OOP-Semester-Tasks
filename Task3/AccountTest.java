import java.util.Scanner;

public class AccountTest {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.printf("New Account ?      (Enter 1)\n");
        System.out.printf("Existing Account ? (Enter 0)\n");
        System.out.print("Choice > ");
        int type = input.nextInt();

        if(type == 1){

            input.nextLine();
            System.out.print("Enter CNIC > ");
            String CNIC = input.nextLine();

            System.out.print("Enter Name > ");
            String name = input.nextLine();

            System.out.print("Enter Age > ");
            int age = input.nextInt();

            if(age<20){
                System.out.println("Can't Open Account, You are Under Age (Below 20)");
            }else{
                Account acc = new Account(CNIC, name, age);
                
                int choice;
                boolean state = true;
                double bal;

                while(state != false){
                    System.out.println("Enter 1 to Deposit");
                    System.out.println("Enter 2 to Withdraw");
                    System.out.println("Enter 3 to View Account Information");
                    System.out.println("Enter 4 to Exit");
                    System.out.println("Choice > ");
                    choice = input.nextInt();
        
                    switch(choice){
                        case 1: 
                            System.out.println("Enter Amount to Deposit > ");
                            bal = input.nextDouble();
                            acc.deposit(bal);
                            break;
                        case 2: 
                            System.out.println("Enter Amount to Withdraw > ");
                            bal = input.nextDouble();
                            acc.withdraw(bal);
                            break;
                        case 3:
                            System.out.printf("CNIC > %s\n", acc.getCNIC());
                            System.out.printf("Name > %s\n", acc.getName());
                            System.out.printf("Age > %d\n", acc.getAge());
                            System.out.printf("Balance > %.2f\n", acc.getBalance());
                            break;
                        case 4: 
                            state = false;
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                }
            }

        }else if (type == 0){
            
            System.out.print("Enter Account ID > ");
            int accountId = input.nextInt();

            Account acc = new Account(accountId);

            int choice;
            boolean state = true;
            double bal;

            while(state != false){
                System.out.println("Enter 1 to Deposit");
                System.out.println("Enter 2 to Withdraw");
                System.out.println("Enter 3 to View Account Information");
                System.out.println("Enter 4 to Exit");
                System.out.println("Choice > ");
                choice = input.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Enter Amount to Deposit > ");
                        bal = input.nextDouble();
                        acc.deposit(bal);
                        break; 
                    case 2:
                        System.out.println("Enter Amount to Withdraw > ");
                        bal = input.nextDouble();
                        acc.withdraw(bal);
                        break;
                    case 3: 
                        System.out.printf("Acount ID > %d\n", acc.getAccountId());
                        System.out.printf("Balance > %.2f\n", acc.getBalance());
                        break;
                    case 4: 
                        state = false;
                        break;
                    default:
                        System.out.println("Invalid Choice Entered");
                }
            }
        }
        System.out.printf("Program Terminated");      

    }
}
