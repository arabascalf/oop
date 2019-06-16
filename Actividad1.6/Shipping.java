import java.util.Scanner;

class Shipping {
    private String address;
    private String date;
    
    public Shipping() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shipping address:");
        address = sc.nextLine();

        System.out.println("Enter date (YYYY-MM-DD):");
        date = sc.nextLine();
    }

    public void get_shipping() {
        System.out.println("\n/////////////////////////////////////");
        System.out.println("SHIPPING INFORMATION");        
        System.out.println("Address: " + address);
        System.out.println("Date: " + date);
        System.out.println("/////////////////////////////////////\n");
    }
}