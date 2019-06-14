import java.math.BigInteger; 
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moto moto;
        Seguro seguro;
        String cliente;
        int pago;
        double efectivo;
        int tarjeta;

        System.out.println("Ingrese el nombre de la persona que desea realizar la reservación:");
        cliente = sc.nextLine();

        seguro = new Seguro("AXA Seguros", 1234151);
        moto = new Moto(1, "Mazda 3 2018", seguro, cliente, 2);

        System.out.println("Si desea pagar con efectivo ingrese 1, con tarjeta de crédito ingrese 2:");
        pago = sc.nextInt();

        if(pago == 1) {
            System.out.println("Ingrese la cantidad con la que pagó:");
            moto.pagar(sc.nextDouble());
        } else {
            System.out.println("Ingrese el número de tarjeta: (8 dígitos)");
            moto.pagar(sc.nextInt());
        }

        moto.imprimirVehiculo();
    }
}