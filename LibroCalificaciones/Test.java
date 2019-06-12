import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nombre del curso:");
        LibroCalificaciones lb = new LibroCalificaciones(sc.nextLine());
        lb.mostrarMensaje();

        System.out.println("Ingresa el nuevo nombre del curso:");
        lb.establecerNombreDelCurso(sc.nextLine());
        lb.mostrarMensaje();
    }
}