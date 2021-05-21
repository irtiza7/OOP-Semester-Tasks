public class BankAccount{
    double balance;
    String name;
    int deposits = 0;
    int withdraws = 0;

    public void deposit(double amount){
        
        if(balance >= 100000){
            balance = balance + (amount + amount/100);
        }else{
            balance = balance + amount;
        }
        
        deposits++;
    }
    public void withdraw(double amount){
        
        if (balance < 50000){
            balance = balance - amount;
            balance = balance - 2*(balance/100);
        }else{
            balance = balance - amount;
        }

        withdraws++;
    }
}