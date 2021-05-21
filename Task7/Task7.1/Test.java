public class Test {
    public static void main(String[] args) {
        Employee commissionEmployee =  new CommissionEmployee("Ali",
                "Boi",
                "12345");
        Employee baseEmployee = new BasePlusCommissionEmployee("Billo",
                "Boii",
                "98765");

        System.out.println(commissionEmployee.toString());
        System.out.println(baseEmployee.toString());
    }
}
