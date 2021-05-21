import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    final static String SUPPLIER_NAME = "IKEA";
    final static double CHAIR_UNIT_PRICE = 30.0;
    final static double TABLE_UNIT_PRICE = 40.0;
    final static double NOTEBOOK_UNIT_PRICE = 10.0;

    static double totalFurniturePrice;
    static double totalNotebookPrice;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name>");
        String name = input.nextLine();

        System.out.println("What do you want to order?");
        System.out.println("1: Furniture");
        System.out.println("2: Notebooks");
        System.out.println("3: Furniture and Notebooks");
        int choice = input.nextInt();

        ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();

        int tableCount = -1;
        int chairCount = -1;
        int notebookCount = -1;
        int tableType = -1;
        int chairType = -1;
        int notebookType = -1;

        switch (choice) {
            case 1:
                System.out.println("How many Desks?");
                tableCount = input.nextInt();

                for (int i = 0; i < tableCount; i++) {
                    System.out.println("Enter Type for Desk # " + (i + 1));
                    System.out.println("1: Wooden");
                    System.out.println("2: Iron");
                    System.out.println("3: Plastic");
                    tableType = input.nextInt();

                    furnitures.add(new Desk(tableType));
                }

                System.out.println("How many Chairs?");
                chairCount = input.nextInt();

                for (int i = 0; i < chairCount; i++) {
                    System.out.println("Enter Type for Chair # " + (i + 1));
                    System.out.println("1: Wooden");
                    System.out.println("2: Iron");
                    chairType = input.nextInt();

                    furnitures.add(new Chair(chairType));
                }

                break;

            case 2:
                System.out.println("How many Notebooks?");
                notebookCount = input.nextInt();

                for (int i = 0; i < notebookCount; i++) {
                    System.out.println("Enter Type for Notebook # " + (i + 1));
                    System.out.println("1: Spiral");
                    System.out.println("2: Lab");
                    notebookType = input.nextInt();

                    notebooks.add(new Notebook(notebookType));
                }

                break;

            case 3:
                System.out.println("How many Desks?");
                tableCount = input.nextInt();

                for (int i = 0; i < tableCount; i++) {
                    System.out.println("Enter Type for Desk # " + (i + 1));
                    System.out.println("1: Wooden");
                    System.out.println("2: Iron");
                    System.out.println("3: Plastic");
                    tableType = input.nextInt();

                    furnitures.add(new Desk(tableType));
                }

                System.out.println("How many Chairs?");
                chairCount = input.nextInt();

                for (int i = 0; i < chairCount; i++) {
                    System.out.println("Enter Type for Chair # " + (i + 1));
                    System.out.println("1: Wooden");
                    System.out.println("2: Iron");
                    chairType = input.nextInt();

                    furnitures.add(new Chair(chairType));
                }

                System.out.println("How many Notebooks?");
                notebookCount = input.nextInt();

                for (int i = 0; i < notebookCount; i++) {
                    System.out.println("Enter Type for Notebook # " + (i + 1));
                    System.out.println("1: Spiral");
                    System.out.println("2: Lab");
                    notebookType = input.nextInt();

                    notebooks.add(new Notebook(notebookType));
                }

                break;
        }

        System.out.println("INVOICE");
        System.out.println("Supplier Name: "+SUPPLIER_NAME);
        System.out.println("Customer Name: "+name);

        double totalFurniturePrice = printFurniturePayment(furnitures);
        double totalNotebookPrice = printNotebookPayment(notebooks);

        System.out.println();
        System.out.println("Total Cost of Order: "+(totalFurniturePrice+totalNotebookPrice));
        System.out.println("Date: "+printDate());
    }

    public static double printFurniturePayment(ArrayList<Furniture> furnitures){
        int chairCount = 0;
        int deskCount = 0;

        for (Furniture item: furnitures){
            if (item instanceof Chair){
                chairCount++;
            }else{
                deskCount++;
            }
        }

        System.out.println();
        System.out.println("Total Chairs: "+chairCount);
        System.out.println("Unit Price for 1 Chair: "+CHAIR_UNIT_PRICE);
        System.out.println("Total Price for Chairs: "+(chairCount*CHAIR_UNIT_PRICE));

        System.out.println();
        System.out.println("Total Desks: "+deskCount);
        System.out.println("Unit Price for 1 Desk: "+TABLE_UNIT_PRICE);
        System.out.println("Total Price for Desks: "+(deskCount*TABLE_UNIT_PRICE));

        System.out.println();
        System.out.println("Sales Tax for Furniture: "+Furniture.SALES_TAX+"%");
        System.out.println("Total Price for Furniture: "+((chairCount+deskCount)*CHAIR_UNIT_PRICE));

        double totalPrice;
        totalPrice = (chairCount*CHAIR_UNIT_PRICE)+(deskCount*TABLE_UNIT_PRICE);
        totalPrice = totalPrice + (totalPrice/100*17);

        System.out.println("Total Price for Furniture including Sales Tax: "+totalPrice);

        return totalPrice;
    }

    public static double printNotebookPayment(ArrayList<Notebook> notebooks){
        int spiralCount = 0;
        int labCount = 0;

        for (Notebook item: notebooks){

            if(item.getType() == NotebookType.SPIRAL){
                spiralCount++;
            }else{
                labCount++;
            }
        }

        System.out.println();
        System.out.println("Total Spiral Notebooks: "+spiralCount);
        System.out.println("Total Lab Notebooks: "+labCount);

        System.out.println();
        System.out.println("Unit Price for 1 Notebook: "+NOTEBOOK_UNIT_PRICE);
        System.out.println("Total Price for Notebooks: "+((spiralCount+labCount)*NOTEBOOK_UNIT_PRICE));

        return (spiralCount+labCount)*NOTEBOOK_UNIT_PRICE;
    }

    public static String printDate(){
        return "21 May 2021";
    }

}