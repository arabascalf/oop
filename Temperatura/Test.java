import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperatura temp = new Temperatura();
    
        System.out.println("Ingresa la temperatura: ");
        temp.setTemperatura(sc.nextFloat());
    
        System.out.println(temp.getTemperatura() + "C equivale a:");
        System.out.println(temp.aFahrenheit() + "F");
        System.out.println(temp.aKelvin() + "K");
    }
}