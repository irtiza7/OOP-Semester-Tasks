public class Address {
    private String streetAddress;
    private String town;
    private String city;
    private String country;
    private PhoneNumber phoneNumber;

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    public void setTown(String town){
        this.town = town;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCounrty(String country){
        this.country = country;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void getAddress(){
        System.out.println(this.streetAddress);
        System.out.println(this.town);
        System.out.println(this.city);
        System.out.println(this.country);
        this.phoneNumber.getPhoneNumber();
    }
    
    // public String getStreetAddress(){
    //     return this.streetAddress;
    // }
    // public String getTown(){
    //     return this.town;
    // }
    // public String getCity(){
    //     return this.city;
    // }
    // public String getCounrty(){
    //     return this.country;
    // }
    // public PhoneNumber getPhoneNumber(){
    //     return this.phoneNumber;
    // }
}
