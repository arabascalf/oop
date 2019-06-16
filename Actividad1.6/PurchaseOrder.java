import java.util.Scanner;

class PurchaseOrder {
    
    private int po_id;
    private String client;
    private int product_amount;
    private String products_name[];
    private double products_price[];
    private int payment_method;
    private String date;
    private double subtotal = 0;

    public PurchaseOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase order id:");
        po_id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter client name:");
        client = sc.nextLine();

        System.out.println("Enter products amount:");
        product_amount = Integer.parseInt(sc.nextLine());
        products_name = new String[product_amount];
        products_price = new double[product_amount];

        for (int i = 0; i < product_amount; i++) {
            System.out.println("Enter product name:");
            products_name[i] = sc.nextLine();

            System.out.println("Enter product price:");
            products_price[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("1. Credit card\n2. Debit card\n
                            3. Cash\nEnter payment method:");
        payment_method = Integer.parseInt(sc.nextLine());

        System.out.println("Enter date: (YYYY-MM-DD)");
        date = sc.nextLine();
    }

    private String get_payment_method() {
        switch (payment_method) {
            case 1:
                return "Credit card";
            
            case 2:
                return "Debit card";

            case 3:
                return "Cash";

            default:
                return "";
        }
    }

    private double get_subtotal() {
        for(int i = 0; i < product_amount; i++) { subtotal += products_price[i]; }
        return subtotal;
    }
    
    public void get_receipt() {
        System.out.println("\n///////////////////////////////////////////////////");
        System.out.println("PURCHASE ORDER INFORMATION");
        System.out.println("- Purchase order number: " + po_id);
        System.out.println("- Client: " + client);
        System.out.println("- Number of products: " + products_name.length);
        System.out.println("- Products: ");
        for (int i = 0; i < products_name.length; i++) {
            System.out.println(products_name[i] + " $" + products_price[i]);
        }

        System.out.println("- Subtotal: $" + get_subtotal());
        System.out.println("- Payment method: " + get_payment_method());
        System.out.println("- Purchase order date: " + date);

        System.out.println("///////////////////////////////////////////////////\n");
    }
}