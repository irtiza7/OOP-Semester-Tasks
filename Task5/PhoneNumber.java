public class PhoneNumber {
    private int countryCode;
    private int cityCode;
    private int lineNumber;

    public void setCountryCode(int countryCode){
        this.countryCode = countryCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public void setLineNumber(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void getPhoneNumber(){
        System.out.println(this.countryCode);
        System.out.println(this.cityCode);
        System.out.println(this.lineNumber);
    }

    // public int getCountryCode(){
    //     return this.countryCode;
    // }
    // public int getCityCode(){
    //     return this.cityCode;
    // }
    // public int getLineNumber(){
    //     return this.lineNumber;
    // }
}
