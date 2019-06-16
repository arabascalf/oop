import java.util.Scanner;

class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection = 1;

        System.out.println("1. Create purchase order and get receipt\n
                            2. Make shipping\n3. Exit\nEnter selection:");
        selection = sc.nextInt();


        while (selection != 3) {

            if (selection == 1) {
                PurchaseOrder po = new PurchaseOrder();
                po.get_receipt();
            }
            
            if (selection == 2) {
                Shipping shipping = new Shipping();
                shipping.get_shipping();
            }
            
            System.out.println("1. Create purchase order and get receipt\n
                                2. Make shipping\n3. Exit\nEnter selection:");
            selection = sc.nextInt();
        }
    }
}