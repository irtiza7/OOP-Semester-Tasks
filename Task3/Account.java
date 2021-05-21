public class Account{
    private int accountId;
    private String CNIC;
    private String name;
    private int age;
    private double balance;

    
    public Account(String CNIC, String name, int age){
        setCNIC(CNIC);
        setName(name);
        setAge(age);

        if (age>35){
            deposit(0);
        }else if((age >= 20) && (age < 25)){
            deposit(50000);
        }else if((age >= 25) && (age < 30)){
            deposit(25000);
        }else if((age >= 30) && (age < 35)){
            deposit(10000);
        }
    }
    public Account(int accountId){
        setAccountId(accountId);
    }

    
    public void setAccountId(int accountId){
        this.accountId = accountId;
    }
    public int getAccountId(){
        return this.accountId;
    }

    public void setCNIC(String CNIC){
        this.CNIC = CNIC;
    }
    public String getCNIC(){
        return this.CNIC;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void deposit(double balance){
        setBalance(balance);
    }
    public void withdraw(double balance){
        setBalance(-(balance));
    }

    private void setBalance(double balance){
        this.balance = this.balance + (balance);
    }    
    public double getBalance(){
        return this.balance;
    }
    
}