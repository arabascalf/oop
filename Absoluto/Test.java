/*
    Clase absoluto, define el absoluto de un valor.
    Version 1.0
    Aranzza Abascal
*/
import java.lang.Math;

public class Absoluto {
    private int numero = -10;

    public int calculaAbsoluto() { return Math.abs(numero); }
}

/*
    Clase Test, instancia y prueba la clase Absoluto.
    Version 1.0
    Aranzza Abascal
*/
public class Test {
    public static void main(String[] args) {
        Absoluto abs = new Absoluto();

        System.out.println("Absoluto: " + abs.calculaAbsoluto());
    }
}