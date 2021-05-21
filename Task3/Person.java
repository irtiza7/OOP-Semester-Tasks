import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;


    public Person(String name, int age){
        setName(name);
        setDateOfBirth(age);
    }
    public Person(String name, LocalDate dateOfBirth){
        setName(name);
        setDateOfBirth(dateOfBirth);
    }
    

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setDateOfBirth(int age){
        LocalDate temp1 = LocalDate.now();
        int year = temp1.getYear();
        year = year-age;
        temp1 = LocalDate.of(year, temp1.getMonth(), temp1.getDayOfMonth());
        this.dateOfBirth = temp1;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.dateOfBirth);
    }
}
