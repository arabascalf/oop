import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Promedio promedio = new Promedio();
        double calificaion = 0;

        System.out.println("Ingrese las 3 calificaciones en escala de 100:");
        for(int i = 0; i < 3; i++) { calificaion += sc.nextDouble(); }

        promedio.calcularPromedio(calificaion);
    }
}