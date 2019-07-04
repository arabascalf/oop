import java.util.ArrayList;

class Baraja {
    private ArrayList<Carta> cartas = new ArrayList<Carta>();
    private String[] palo = {"Espadas", "Bastos", "Oros", "Copas"};
    private int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

    Baraja() {
        for(int i = 0; i < numeros.length; i++)
            for(int j = 0; j < palo.length; j++) {
                Carta tmp = new Carta(numeros[i], palo[j]);
                cartas.add(tmp);
            }
    }

    public Carta getCarta(int index) {
        return cartas.get(index);
    }
}