public class Test {
    public static void main(String[] args) {

        CommissionEmployee e1 = new CommissionEmployee("Ali",
                "bill",
                "1234-2-2-2");
        e1.setCommissionRate(100);
        e1.setSales(200);
        System.out.println(e1.toString());
        System.out.println(e1.getEarnings());

        System.out.println();

        BasePlusCommissionEmployee e2 = new BasePlusCommissionEmployee("ahmed",
                "dill",
                "2232-2323-23-2");
        e2.setCommissionRate(200);
        e2.setSales(300);
        e2.setBasicSalary(5000);
        System.out.println(e2.toString());
        System.out.println(e2.getEarnings());
    }
}
