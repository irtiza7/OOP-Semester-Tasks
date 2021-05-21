public class Test {
    public static void main(String[] args) {

        Employee hourlyEmployee = new HourlyEmployee("Ali",
                "Billo",
                "12345",
                100,
                50);

        System.out.println(hourlyEmployee.toString());
        System.out.println(hourlyEmployee.getEarnings());
    }
}
