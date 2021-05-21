public class Student{
    private String name;
    private PhoneNumber[] phoneNumber;

    public Student(String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(PhoneNumber[] phoneNumber){
        this.phoneNumber = new PhoneNumber[phoneNumber.length];
        
        for(int i = 0; i < phoneNumber.length; i++){
            this.phoneNumber[i] = phoneNumber[i];
        }
    }

    public String getName(){
        return this.name;
    }
    public PhoneNumber[] getPhoneNumber(){
        return this.phoneNumber;
    }
}