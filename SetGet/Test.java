import java.util.Scanner;

class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sumadora sum = new Sumadora();

        System.out.println("Ingresa el valor de los dos números a sumar: ");
        sum.setValor1(sc.nextInt());
        sum.setValor2(sc.nextInt());
        
        System.out.println(sum.getValor1() + " + " + sum.getValor2() + " = " + sum.suma());
    }
}