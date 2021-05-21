public class Student {
    private String name;
    private String email;
    private String cnic;
    private Course course1;
    private Course course2;
    private Address address;

    public Student(String name, String cnic, Address address){
        setName(name);
        setCnic(cnic);
        setAddress(address);
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public void setCourse1(Course course1){
        this.course1 = course1;
    }
    public void setCourse2(Course course2){
        this.course2 = course2;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCnic(){
        return this.cnic;
    }

    public String getCourse1Code(){
        return this.course1.getCourseCode();
    }
    public String getCourse1Title(){
        return this.course1.getCourseTitle();
    }

    public String getCourse2Code(){
        return this.course2.getCourseCode();
    }
    public String getCourse2Title(){
        return this.course2.getCourseTitle();
    }

    public void getAddress(){
        this.address.getAddress();
    }
}
